package com.acts.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Base64;

public class ActsVO implements Serializable {
	private String actid;
	private String memid;
	private String title;
	private String cont;
	private Timestamp time;
	private String shsts;
	private String sts;
	private String type;
	private byte[] pic;
	private Integer peop;
	private String areacd;
	private Integer hot;
	private String loc;
	private String store;
	private Integer bgt;
	private Integer pts;
	private String rpsts;
	
	
	
	private String base64Image;
	
	public String getBase64Image() {
		return Base64.getEncoder().encodeToString(this.pic);
	}
	public void setBase64Image(String base64Image) {
		this.base64Image = base64Image;
	}
		
	public ActsVO() {
	}
	
	@Override
	public String toString() {
		return "ActsVO [actid=" + actid + ", memid=" + memid + ", shsts=" + shsts + ", time=" + time + ", title="
				+ title + ", sts=" + sts + ", type=" + type + ", cont=" + cont + ", pic=" + Arrays.toString(pic)
				+ ", peop=" + peop + ", areacd=" + areacd + ", hot=" + hot + ", loc=" + loc + ", store=" + store
				+ ", bgt=" + bgt + ", pts=" + pts + ", rpsts=" + rpsts + ", base64Image=" + base64Image + "]";
	}
	public ActsVO(String actid, String memid, String shsts, Timestamp time, String title, String sts, String type,
			String cont, byte[] pic,  Integer peop, String areacd, Integer hot, String loc, String store, Integer bgt, Integer pts,
			String rpsts) {
		this.actid = actid;
		this.memid = memid;
		this.shsts = shsts;
		this.time = time;
		this.title = title;
		this.sts = sts;
		this.type = type;
		this.cont = cont;
		this.pic = pic;
		this.peop = peop;
		this.areacd = areacd;
		this.hot = hot;
		this.loc = loc;
		this.store = store;
		this.bgt = bgt;
		this.pts = pts;
		this.rpsts = rpsts;
	}


	public String getActid() {
		return actid;
	}

	public void setActid(String actid) {
		this.actid = actid;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public String getShsts() {
		return shsts;
	}

	public void setShsts(String shsts) {
		this.shsts = shsts;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSts() {
		return sts;
	}

	public void setSts(String sts) {
		this.sts = sts;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public Integer getPeop() {
		return peop;
	}

	public void setPeop(Integer peop) {
		this.peop = peop;
	}

	public String getAreacd() {
		return areacd;
	}

	public void setAreacd(String areacd) {
		this.areacd = areacd;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public Integer getBgt() {
		return bgt;
	}

	public void setBgt(Integer bgt) {
		this.bgt = bgt;
	}

	public Integer getPts() {
		return pts;
	}

	public void setPts(Integer pts) {
		this.pts = pts;
	}

	public String getRpsts() {
		return rpsts;
	}

	public void setRpsts(String rpsts) {
		this.rpsts = rpsts;
	}
	
}
