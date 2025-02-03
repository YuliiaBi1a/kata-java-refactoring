package dev.vir.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItemQuality(item);
            updateItemSellIn(item);
            handleExpiredItem(item);
        }
    }

    private void updateItemQuality(Item item) {
        if (isLegendaryItem(item)) return;

        if (isAgedBrie(item) || isBackstagePass(item)) {
            increaseQuality(item);
            if (isBackstagePass(item)) applyBackstagePassRules(item);
        } else {
            decreaseQuality(item);
        }
    }

    private void updateItemSellIn(Item item) {
        if (!isLegendaryItem(item)) {
            item.sellIn--;
        }
    }

    private void handleExpiredItem(Item item) {
        if (item.sellIn >= 0) return;

        if (isAgedBrie(item)) {
            increaseQuality(item);
        } else if (isBackstagePass(item)) {
            item.quality = 0;
        } else {
            decreaseQuality(item);
        }
    }

    private void applyBackstagePassRules(Item item) {
        if (item.sellIn < 11) increaseQuality(item);
        if (item.sellIn < 6) increaseQuality(item);
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) item.quality++;
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) item.quality--;
    }

    private boolean isAgedBrie(Item item) {
        return "Aged Brie".equals(item.name);
    }

    private boolean isBackstagePass(Item item) {
        return "Backstage passes to a TAFKAL80ETC concert".equals(item.name);
    }

    private boolean isLegendaryItem(Item item) {
        return "Sulfuras, Hand of Ragnaros".equals(item.name);
    }
}
