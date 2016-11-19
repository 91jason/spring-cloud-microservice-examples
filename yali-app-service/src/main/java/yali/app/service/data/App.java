/**
 * @(#)App.java, 十月 28, 2016.
 * <p>
 * Copyright 2016 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package yali.app.service.data;

/**
 * @author jason
 */

public class App {
	public enum AppType {
		IOS, ANDROID
		} 

    private int id;
    /**
     * 0=ios,1=android
     */
    private AppType type;
    /**
     * 应用名称
     */
    private String name;
    /**
     * 图标
     */
    private String icon;
    /**
     * 启动页
     */
    private String start;
    /**
     * 一句话描述
     */
    private String short_description;
    /**
     * 应用简介
     */
    private String description;
    /**
     * 截图
     */
    private String screenshots;
    /**
     * 关键词
     */
    private String keywords;
    /**
     * 版权信息
     */
    private String copyright;
    /**
     * 最新市场地址
     */
    private String market_url;
    /**
     * bundle_id
     */
    private String bundle_id;
    /**
     * 应用签名
     */
    private String sign;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AppType getType() {
		return type;
	}
	public void setType(AppType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getScreenshots() {
		return screenshots;
	}
	public void setScreenshots(String screenshots) {
		this.screenshots = screenshots;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public String getMarket_url() {
		return market_url;
	}
	public void setMarket_url(String market_url) {
		this.market_url = market_url;
	}
	public String getBundle_id() {
		return bundle_id;
	}
	public void setBundle_id(String bundle_id) {
		this.bundle_id = bundle_id;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
    
}