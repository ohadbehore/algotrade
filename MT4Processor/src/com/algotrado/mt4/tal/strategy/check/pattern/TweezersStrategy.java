package com.algotrado.mt4.tal.strategy.check.pattern;

import com.algotrado.mt4.tal.patterns.continuos.Tweezers;
import com.algotrado.mt4.tal.strategy.Strategy;

public class TweezersStrategy extends Strategy {

	@Override
	public boolean isLongStrategyPattern(SingleCandleBarData[] previousCandles,
			int index, double pipsValue) {
		return new Tweezers().isBullishReversalPattern(previousCandles, index, pipsValue);
	}

	@Override
	public boolean isShortStrategyPattern(
			SingleCandleBarData[] previousCandles, int index, double pipsValue) {
		return new Tweezers().isBearishReversalPattern(previousCandles, index, pipsValue);
	}

}
