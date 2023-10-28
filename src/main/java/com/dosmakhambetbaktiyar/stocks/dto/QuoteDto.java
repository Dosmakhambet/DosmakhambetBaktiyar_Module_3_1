package com.dosmakhambetbaktiyar.stocks.dto;

import com.dosmakhambetbaktiyar.stocks.model.Quote;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.concurrent.Callable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuoteDto implements Callable,Serializable {
    private String id;
    private Number avgTotalVolume;
    private String calculationPrice;
    private Number change;
    private Number changePercent;
    private Number close;
    private String closeSource;
    private Number closeTime;
    private String companyName;
    private String currency;
    private Number delayedPrice;
    private Number delayedPriceTime;
    private Number extendedChange;
    private Number extendedChangePercent;
    private Number extendedPrice;
    private Number extendedPriceTime;
    private Number high;
    private String highSource;
    private Number highTime;
    private Number iexAskPrice;
    private Number iexAskSize;
    private Number iexBidPrice;
    private Number iexBidSize;
    private Number iexClose;
    private Number iexCloseTime;
    private Number iexLastUpdated;
    private Number iexMarketPercent;
    private Number iexOpen;
    private Number iexOpenTime;
    private Number iexRealtimePrice;
    private Number iexRealtimeSize;
    private Number iexVolume;
    private Number lastTradeTime;
    private Number latestPrice;
    private String latestSource;
    private String latestTime;
    private Number latestUpdate;
    private Number latestVolume;
    private Number low;
    private String lowSource;
    private Number lowTime;
    private Number marketCap;
    private Number oddLotDelayedPrice;
    private Number oddLotDelayedPriceTime;
    private Number open;
    private Number openTime;
    private String openSource;
    private Number peRatio;
    private Number previousClose;
    private Number previousVolume;
    private String primaryExchange;
    private String symbol;
    private Number volume;
    private Number week52High;
    private Number week52Low;
    private Number ytdChange;
    private Boolean isUSMarketOpen;

    public static QuoteDto asDto(Quote entity){
        return QuoteDto.builder()
                .id(entity.getId())
                .avgTotalVolume(entity.getAvgTotalVolume())
                .calculationPrice(entity.getCalculationPrice())
                .change(entity.getChange())
                .changePercent(entity.getChangePercent())
                .close(entity.getClose())
                .closeTime(entity.getCloseTime())
                .closeSource(entity.getCloseSource())
                .companyName(entity.getCompanyName())
                .currency(entity.getCurrency())
                .delayedPrice(entity.getDelayedPrice())
                .delayedPriceTime(entity.getDelayedPriceTime())
                .extendedChange(entity.getExtendedChange())
                .extendedChangePercent(entity.getExtendedChangePercent())
                .extendedPrice(entity.getExtendedPrice())
                .extendedPriceTime(entity.getExtendedPriceTime())
                .high(entity.getHigh())
                .highSource(entity.getHighSource())
                .highTime(entity.getHighTime())
                .iexAskPrice(entity.getIexAskPrice())
                .iexAskSize(entity.getIexAskSize())
                .iexBidPrice(entity.getIexBidPrice())
                .iexBidSize(entity.getIexBidSize())
                .iexClose(entity.getIexClose())
                .iexCloseTime(entity.getIexCloseTime())
                .iexLastUpdated(entity.getIexLastUpdated())
                .iexMarketPercent(entity.getIexMarketPercent())
                .iexOpen(entity.getIexOpen())
                .iexOpenTime(entity.getIexOpenTime())
                .iexRealtimePrice(entity.getIexRealtimePrice())
                .iexRealtimeSize(entity.getIexRealtimeSize())
                .iexVolume(entity.getIexVolume())
                .isUSMarketOpen(entity.getIsUSMarketOpen())
                .lastTradeTime(entity.getLastTradeTime())
                .latestPrice(entity.getLatestPrice())
                .latestSource(entity.getLatestSource())
                .latestUpdate(entity.getLatestUpdate())
                .latestVolume(entity.getLatestVolume())
                .low(entity.getLow())
                .lowSource(entity.getLowSource())
                .lowTime(entity.getLowTime())
                .marketCap(entity.getMarketCap())
                .oddLotDelayedPrice(entity.getOddLotDelayedPrice())
                .oddLotDelayedPriceTime(entity.getOddLotDelayedPriceTime())
                .open(entity.getOpen())
                .openSource(entity.getOpenSource())
                .openTime(entity.getOpenTime())
                .peRatio(entity.getPeRatio())
                .previousClose(entity.getPreviousClose())
                .previousVolume(entity.getPreviousVolume())
                .primaryExchange(entity.getPrimaryExchange())
                .symbol(entity.getSymbol())
                .week52High(entity.getWeek52High())
                .week52Low(entity.getWeek52Low())
                .ytdChange(entity.getYtdChange())
                .latestTime(entity.getLatestTime())
                .volume(entity.getVolume())
                .build();
    }

    public Quote asEntity(){
        return Quote.builder()
                .id(id)
                .avgTotalVolume(avgTotalVolume)
                .calculationPrice(calculationPrice)
                .change(change)
                .changePercent(changePercent)
                .close(close)
                .closeTime(closeTime)
                .closeSource(closeSource)
                .companyName(companyName)
                .currency(currency)
                .delayedPrice(delayedPrice)
                .delayedPriceTime(delayedPriceTime)
                .extendedChange(extendedChange)
                .extendedChangePercent(extendedChangePercent)
                .extendedPrice(extendedPrice)
                .extendedPriceTime(extendedPriceTime)
                .high(high)
                .highSource(highSource)
                .highTime(highTime)
                .iexAskPrice(iexAskPrice)
                .iexAskSize(iexAskSize)
                .iexBidPrice(iexBidPrice)
                .iexBidSize(iexBidSize)
                .iexClose(iexClose)
                .iexCloseTime(iexCloseTime)
                .iexLastUpdated(iexLastUpdated)
                .iexMarketPercent(iexMarketPercent)
                .iexOpen(iexOpen)
                .iexOpenTime(iexOpenTime)
                .iexRealtimePrice(iexRealtimePrice)
                .iexRealtimeSize(iexRealtimeSize)
                .iexVolume(iexVolume)
                .isUSMarketOpen(isUSMarketOpen)
                .lastTradeTime(lastTradeTime)
                .latestPrice(latestPrice)
                .latestSource(latestSource)
                .latestUpdate(latestUpdate)
                .latestVolume(latestVolume)
                .low(low)
                .lowSource(lowSource)
                .lowTime(lowTime)
                .marketCap(marketCap)
                .oddLotDelayedPrice(oddLotDelayedPrice)
                .oddLotDelayedPriceTime(oddLotDelayedPriceTime)
                .open(open)
                .openSource(openSource)
                .openTime(openTime)
                .peRatio(peRatio)
                .previousClose(previousClose)
                .previousVolume(previousVolume)
                .primaryExchange(primaryExchange)
                .symbol(symbol)
                .week52High(week52High)
                .week52Low(week52Low)
                .ytdChange(ytdChange)
                .latestTime(latestTime)
                .volume(volume)
                .build();
    }

    @Override
    public Object call(){
        return QuoteDto.builder()
                .id(id)
                .avgTotalVolume(avgTotalVolume)
                .calculationPrice(calculationPrice)
                .change(change)
                .changePercent(changePercent)
                .close(close)
                .closeTime(closeTime)
                .closeSource(closeSource)
                .companyName(companyName)
                .currency(currency)
                .delayedPrice(delayedPrice)
                .delayedPriceTime(delayedPriceTime)
                .extendedChange(extendedChange)
                .extendedChangePercent(extendedChangePercent)
                .extendedPrice(extendedPrice)
                .extendedPriceTime(extendedPriceTime)
                .high(high)
                .highSource(highSource)
                .highTime(highTime)
                .iexAskPrice(iexAskPrice)
                .iexAskSize(iexAskSize)
                .iexBidPrice(iexBidPrice)
                .iexBidSize(iexBidSize)
                .iexClose(iexClose)
                .iexCloseTime(iexCloseTime)
                .iexLastUpdated(iexLastUpdated)
                .iexMarketPercent(iexMarketPercent)
                .iexOpen(iexOpen)
                .iexOpenTime(iexOpenTime)
                .iexRealtimePrice(iexRealtimePrice)
                .iexRealtimeSize(iexRealtimeSize)
                .iexVolume(iexVolume)
                .isUSMarketOpen(isUSMarketOpen)
                .lastTradeTime(lastTradeTime)
                .latestPrice(latestPrice)
                .latestSource(latestSource)
                .latestUpdate(latestUpdate)
                .latestVolume(latestVolume)
                .low(low)
                .lowSource(lowSource)
                .lowTime(lowTime)
                .marketCap(marketCap)
                .oddLotDelayedPrice(oddLotDelayedPrice)
                .oddLotDelayedPriceTime(oddLotDelayedPriceTime)
                .open(open)
                .openSource(openSource)
                .openTime(openTime)
                .peRatio(peRatio)
                .previousClose(previousClose)
                .previousVolume(previousVolume)
                .primaryExchange(primaryExchange)
                .symbol(symbol)
                .week52High(week52High)
                .week52Low(week52Low)
                .ytdChange(ytdChange)
                .latestTime(latestTime)
                .volume(volume)
                .build();
    }
}
