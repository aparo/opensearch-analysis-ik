package org.opensearch.plugin.analysis.ik;

import org.apache.lucene.analysis.Analyzer;
import org.opensearch.index.analysis.AnalyzerProvider;
import org.opensearch.index.analysis.IkAnalyzerProvider;
import org.opensearch.index.analysis.IkTokenizerFactory;
import org.opensearch.index.analysis.TokenizerFactory;
import org.opensearch.indices.analysis.AnalysisModule;
import org.opensearch.plugins.AnalysisPlugin;
import org.opensearch.plugins.Plugin;

import java.util.HashMap;
import java.util.Map;

/**
 * AnalysisIkPlugin is an OpenSearch plugin that provides IK Analyzer
 * integration for text analysis.
 * <p>
 * This plugin registers custom tokenizers and analyzers for Chinese text
 * segmentation using the IK Analyzer.
 * It supports two main modes: "ik_smart" for coarse-grained segmentation and
 * "ik_max_word" for fine-grained segmentation.
 *
 * <p>
 * Tokenizers:
 * <ul>
 * <li>ik_smart: Uses IK's smart segmentation algorithm.</li>
 * <li>ik_max_word: Uses IK's maximum word segmentation algorithm.</li>
 * </ul>
 *
 * <p>
 * Analyzers:
 * <ul>
 * <li>ik_smart: Analyzer with smart segmentation.</li>
 * <li>ik_max_word: Analyzer with maximum word segmentation.</li>
 * </ul>
 *
 * <p>
 * Usage:
 * Register this plugin in your OpenSearch cluster to enable the IK Analyzer for
 * text fields in your indices.
 *
 * @author IK Analyzer contributors
 * @since 1.0.0
 */
public class AnalysisIkPlugin extends Plugin implements AnalysisPlugin {

    public static String PLUGIN_NAME = "analysis-ik";

    @Override
    public Map<String, AnalysisModule.AnalysisProvider<TokenizerFactory>> getTokenizers() {
        Map<String, AnalysisModule.AnalysisProvider<TokenizerFactory>> extra = new HashMap<>();

        extra.put("ik_smart", IkTokenizerFactory::getIkSmartTokenizerFactory);
        extra.put("ik_max_word", IkTokenizerFactory::getIkTokenizerFactory);

        return extra;
    }

    @Override
    public Map<String, AnalysisModule.AnalysisProvider<AnalyzerProvider<? extends Analyzer>>> getAnalyzers() {
        Map<String, AnalysisModule.AnalysisProvider<AnalyzerProvider<? extends Analyzer>>> extra = new HashMap<>();

        extra.put("ik_smart", IkAnalyzerProvider::getIkSmartAnalyzerProvider);
        extra.put("ik_max_word", IkAnalyzerProvider::getIkAnalyzerProvider);

        return extra;
    }

}