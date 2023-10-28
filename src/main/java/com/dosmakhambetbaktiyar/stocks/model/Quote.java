package com.dosmakhambetbaktiyar.stocks.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("quote")
public class Quote implements Serializable {
    @Id
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
}
