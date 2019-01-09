/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_9104_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String gubun;
	public String wiibgodat;
	public String wifactcd;
	public String wifactnm;
	public String wijjcd;
	public String jcjjcdnm;
	public String jcjjcd;
	public String wiibgoroll;
	public String wiibgowt;
	public String wiibgowt_b;
	public String wiibiyul;

	public MT_PAPINOUT_9104_LCURLIST1Record(){}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setWiibgodat(String wiibgodat){
		this.wiibgodat = wiibgodat;
	}

	public void setWifactcd(String wifactcd){
		this.wifactcd = wifactcd;
	}

	public void setWifactnm(String wifactnm){
		this.wifactnm = wifactnm;
	}

	public void setWijjcd(String wijjcd){
		this.wijjcd = wijjcd;
	}

	public void setJcjjcdnm(String jcjjcdnm){
		this.jcjjcdnm = jcjjcdnm;
	}

	public void setJcjjcd(String jcjjcd){
		this.jcjjcd = jcjjcd;
	}

	public void setWiibgoroll(String wiibgoroll){
		this.wiibgoroll = wiibgoroll;
	}

	public void setWiibgowt(String wiibgowt){
		this.wiibgowt = wiibgowt;
	}

	public void setWiibgowt_b(String wiibgowt_b){
		this.wiibgowt_b = wiibgowt_b;
	}

	public void setWiibiyul(String wiibiyul){
		this.wiibiyul = wiibiyul;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getWiibgodat(){
		return this.wiibgodat;
	}

	public String getWifactcd(){
		return this.wifactcd;
	}

	public String getWifactnm(){
		return this.wifactnm;
	}

	public String getWijjcd(){
		return this.wijjcd;
	}

	public String getJcjjcdnm(){
		return this.jcjjcdnm;
	}

	public String getJcjjcd(){
		return this.jcjjcd;
	}

	public String getWiibgoroll(){
		return this.wiibgoroll;
	}

	public String getWiibgowt(){
		return this.wiibgowt;
	}

	public String getWiibgowt_b(){
		return this.wiibgowt_b;
	}

	public String getWiibiyul(){
		return this.wiibiyul;
	}
}

/* 작성시간 : Fri May 22 18:01:19 KST 2009 */