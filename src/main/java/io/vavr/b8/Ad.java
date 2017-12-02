package io.vavr.b8;

public class Ad {

    private final Long adId;
    private final String text;
    private final Long userId;

    public Ad(Long adId, String text, Long userId) {
        this.adId = adId;
        this.text = text;
        this.userId = userId;
    }

    public Long getAdId() {
        return adId;
    }

    public String getText() {
        return text;
    }

    public Long getUserId() {
        return userId;
    }
}
