/***************************************************************************************************
* 파일명 : SE_SND_1110_LCURLISTRecord.java
* 기능 : 판매 - 발송관리 - 노선등록
 * 작성일자 : 2009.02.03
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String medi_nm;
	public String route_cd;
	public String route_nm;
	public String route_clsf;
	public String prt_plac_cd;
	public String ecnt_cd;
	public String ledt_cd;
	public String inwsp_send_yn;
	public String route_rank;
	public String num;
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getInwsp_send_yn() {
		return inwsp_send_yn;
	}

	public void setInwsp_send_yn(String inwsp_send_yn) {
		this.inwsp_send_yn = inwsp_send_yn;
	}

	public SE_SND_1110_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setEcnt_cd(String ecnt_cd){
		this.ecnt_cd = ecnt_cd;
	}

	public void setLedt_cd(String ledt_cd){
		this.ledt_cd = ledt_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getEcnt_cd(){
		return this.ecnt_cd;
	}

	public String getLedt_cd(){
		return this.ledt_cd;
	}

	public String getRoute_clsf() {
		return route_clsf;
	}

	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}

	public String getRoute_rank() {
		return route_rank;
	}

	public void setRoute_rank(String route_rank) {
		this.route_rank = route_rank;
	}
}

/* 작성시간 : Tue Jan 20 19:27:48 KST 2009 */