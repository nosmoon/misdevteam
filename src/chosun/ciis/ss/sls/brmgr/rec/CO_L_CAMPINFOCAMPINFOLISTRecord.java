/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국경영-구독유지켐페인조회-캠페인목록조회
* 작성일자 : 2008-10-17
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *지국경영-구독유지켐페인조회-캠페인목록조회
 */

public class CO_L_CAMPINFOCAMPINFOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String campid;
	public String campnm;
	public String campmclscd;
	public String campmclsnm;
	public String camppurp;
	public String campexecclsfcd;
	public Timestamp campexecfrdt;
	public Timestamp campexectodt;
	public String campchnlfrdt;
	public String campchnltodt;
	public int campobjcnt;
	public String campplanpersid;
	public String campplanpersnm;
	public String campexecguid;
	public String outsdcustyn;
	public String camptypecd;

	public CO_L_CAMPINFOCAMPINFOLISTRecord(){}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public void setCampmclscd(String campmclscd){
		this.campmclscd = campmclscd;
	}

	public void setCampmclsnm(String campmclsnm){
		this.campmclsnm = campmclsnm;
	}

	public void setCamppurp(String camppurp){
		this.camppurp = camppurp;
	}

	public void setCampexecclsfcd(String campexecclsfcd){
		this.campexecclsfcd = campexecclsfcd;
	}

	public void setCampexecfrdt(Timestamp campexecfrdt){
		this.campexecfrdt = campexecfrdt;
	}

	public void setCampexectodt(Timestamp campexectodt){
		this.campexectodt = campexectodt;
	}

	public void setCampchnlfrdt(String campchnlfrdt){
		this.campchnlfrdt = campchnlfrdt;
	}

	public void setCampchnltodt(String campchnltodt){
		this.campchnltodt = campchnltodt;
	}

	public void setCampobjcnt(int campobjcnt){
		this.campobjcnt = campobjcnt;
	}

	public void setCampplanpersid(String campplanpersid){
		this.campplanpersid = campplanpersid;
	}

	public void setCampplanpersnm(String campplanpersnm){
		this.campplanpersnm = campplanpersnm;
	}

	public void setCampexecguid(String campexecguid){
		this.campexecguid = campexecguid;
	}

	public void setOutsdcustyn(String outsdcustyn){
		this.outsdcustyn = outsdcustyn;
	}

	public void setCamptypecd(String camptypecd){
		this.camptypecd = camptypecd;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getCampnm(){
		return this.campnm;
	}

	public String getCampmclscd(){
		return this.campmclscd;
	}

	public String getCampmclsnm(){
		return this.campmclsnm;
	}

	public String getCamppurp(){
		return this.camppurp;
	}

	public String getCampexecclsfcd(){
		return this.campexecclsfcd;
	}

	public Timestamp getCampexecfrdt(){
		return this.campexecfrdt;
	}

	public Timestamp getCampexectodt(){
		return this.campexectodt;
	}

	public String getCampchnlfrdt(){
		return this.campchnlfrdt;
	}

	public String getCampchnltodt(){
		return this.campchnltodt;
	}

	public int getCampobjcnt(){
		return this.campobjcnt;
	}

	public String getCampplanpersid(){
		return this.campplanpersid;
	}

	public String getCampplanpersnm(){
		return this.campplanpersnm;
	}

	public String getCampexecguid(){
		return this.campexecguid;
	}

	public String getOutsdcustyn(){
		return this.outsdcustyn;
	}

	public String getCamptypecd(){
		return this.camptypecd;
	}
}

/* 작성시간 : Fri Oct 17 16:27:17 KST 2008 */