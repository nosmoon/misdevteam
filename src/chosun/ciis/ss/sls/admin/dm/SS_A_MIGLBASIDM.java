/***************************************************************************************************
* 파일명 : SS_A_MIGLBASIDM.java
* 기능 : 관리자-마일리지-지급기준-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-마일리지-지급기준-등록,수정,삭제를 위한 DM
 */

public class SS_A_MIGLBASIDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String cmpycd;
	public String medicd;
	public String paybasicd;
	public String payclsfcd;
	public String pontcalcclsfcd;
	public String descri;
	public String paypointdescri;
	public String remk;
	public String pont;
	public String pontrate;
	public String hdqtallmratio;
	public String boallmratio;
	public String adjmexchrate;
	public String rdrgradsumyn;
	public String vdtyyn;

	public SS_A_MIGLBASIDM(){}
	public SS_A_MIGLBASIDM(String incmgpers, String accflag, String cmpycd, String medicd, String paybasicd, String payclsfcd, String pontcalcclsfcd, String descri, String paypointdescri, String remk, String pont, String pontrate, String hdqtallmratio, String boallmratio, String adjmexchrate, String rdrgradsumyn, String vdtyyn){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.paybasicd = paybasicd;
		this.payclsfcd = payclsfcd;
		this.pontcalcclsfcd = pontcalcclsfcd;
		this.descri = descri;
		this.paypointdescri = paypointdescri;
		this.remk = remk;
		this.pont = pont;
		this.pontrate = pontrate;
		this.hdqtallmratio = hdqtallmratio;
		this.boallmratio = boallmratio;
		this.adjmexchrate = adjmexchrate;
		this.rdrgradsumyn = rdrgradsumyn;
		this.vdtyyn = vdtyyn;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setPaybasicd(String paybasicd){
		this.paybasicd = paybasicd;
	}

	public void setPayclsfcd(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public void setPontcalcclsfcd(String pontcalcclsfcd){
		this.pontcalcclsfcd = pontcalcclsfcd;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public void setPaypointdescri(String paypointdescri){
		this.paypointdescri = paypointdescri;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPont(String pont){
		this.pont = pont;
	}

	public void setPontrate(String pontrate){
		this.pontrate = pontrate;
	}

	public void setHdqtallmratio(String hdqtallmratio){
		this.hdqtallmratio = hdqtallmratio;
	}

	public void setBoallmratio(String boallmratio){
		this.boallmratio = boallmratio;
	}

	public void setAdjmexchrate(String adjmexchrate){
		this.adjmexchrate = adjmexchrate;
	}

	public void setRdrgradsumyn(String rdrgradsumyn){
		this.rdrgradsumyn = rdrgradsumyn;
	}

	public void setVdtyyn(String vdtyyn){
		this.vdtyyn = vdtyyn;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getPaybasicd(){
		return this.paybasicd;
	}

	public String getPayclsfcd(){
		return this.payclsfcd;
	}

	public String getPontcalcclsfcd(){
		return this.pontcalcclsfcd;
	}

	public String getDescri(){
		return this.descri;
	}

	public String getPaypointdescri(){
		return this.paypointdescri;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPont(){
		return this.pont;
	}

	public String getPontrate(){
		return this.pontrate;
	}

	public String getHdqtallmratio(){
		return this.hdqtallmratio;
	}

	public String getBoallmratio(){
		return this.boallmratio;
	}

	public String getAdjmexchrate(){
		return this.adjmexchrate;
	}

	public String getRdrgradsumyn(){
		return this.rdrgradsumyn;
	}

	public String getVdtyyn(){
		return this.vdtyyn;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_MIGLBASI( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_MIGLBASIDM dm = (SS_A_MIGLBASIDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.cmpycd);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.paybasicd);
		cstmt.setString(8, dm.payclsfcd);
		cstmt.setString(9, dm.pontcalcclsfcd);
		cstmt.setString(10, dm.descri);
		cstmt.setString(11, dm.paypointdescri);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.pont);
		cstmt.setString(14, dm.pontrate);
		cstmt.setString(15, dm.hdqtallmratio);
		cstmt.setString(16, dm.boallmratio);
		cstmt.setString(17, dm.adjmexchrate);
		cstmt.setString(18, dm.rdrgradsumyn);
		cstmt.setString(19, dm.vdtyyn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_MIGLBASIDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String paybasicd = req.getParameter("paybasicd");
if( paybasicd == null){
	System.out.println(this.toString+" : paybasicd is null" );
}else{
	System.out.println(this.toString+" : paybasicd is "+paybasicd );
}
String payclsfcd = req.getParameter("payclsfcd");
if( payclsfcd == null){
	System.out.println(this.toString+" : payclsfcd is null" );
}else{
	System.out.println(this.toString+" : payclsfcd is "+payclsfcd );
}
String pontcalcclsfcd = req.getParameter("pontcalcclsfcd");
if( pontcalcclsfcd == null){
	System.out.println(this.toString+" : pontcalcclsfcd is null" );
}else{
	System.out.println(this.toString+" : pontcalcclsfcd is "+pontcalcclsfcd );
}
String descri = req.getParameter("descri");
if( descri == null){
	System.out.println(this.toString+" : descri is null" );
}else{
	System.out.println(this.toString+" : descri is "+descri );
}
String paypointdescri = req.getParameter("paypointdescri");
if( paypointdescri == null){
	System.out.println(this.toString+" : paypointdescri is null" );
}else{
	System.out.println(this.toString+" : paypointdescri is "+paypointdescri );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String pont = req.getParameter("pont");
if( pont == null){
	System.out.println(this.toString+" : pont is null" );
}else{
	System.out.println(this.toString+" : pont is "+pont );
}
String pontrate = req.getParameter("pontrate");
if( pontrate == null){
	System.out.println(this.toString+" : pontrate is null" );
}else{
	System.out.println(this.toString+" : pontrate is "+pontrate );
}
String hdqtallmratio = req.getParameter("hdqtallmratio");
if( hdqtallmratio == null){
	System.out.println(this.toString+" : hdqtallmratio is null" );
}else{
	System.out.println(this.toString+" : hdqtallmratio is "+hdqtallmratio );
}
String boallmratio = req.getParameter("boallmratio");
if( boallmratio == null){
	System.out.println(this.toString+" : boallmratio is null" );
}else{
	System.out.println(this.toString+" : boallmratio is "+boallmratio );
}
String adjmexchrate = req.getParameter("adjmexchrate");
if( adjmexchrate == null){
	System.out.println(this.toString+" : adjmexchrate is null" );
}else{
	System.out.println(this.toString+" : adjmexchrate is "+adjmexchrate );
}
String rdrgradsumyn = req.getParameter("rdrgradsumyn");
if( rdrgradsumyn == null){
	System.out.println(this.toString+" : rdrgradsumyn is null" );
}else{
	System.out.println(this.toString+" : rdrgradsumyn is "+rdrgradsumyn );
}
String vdtyyn = req.getParameter("vdtyyn");
if( vdtyyn == null){
	System.out.println(this.toString+" : vdtyyn is null" );
}else{
	System.out.println(this.toString+" : vdtyyn is "+vdtyyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String paybasicd = Util.checkString(req.getParameter("paybasicd"));
String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));
String pontcalcclsfcd = Util.checkString(req.getParameter("pontcalcclsfcd"));
String descri = Util.checkString(req.getParameter("descri"));
String paypointdescri = Util.checkString(req.getParameter("paypointdescri"));
String remk = Util.checkString(req.getParameter("remk"));
String pont = Util.checkString(req.getParameter("pont"));
String pontrate = Util.checkString(req.getParameter("pontrate"));
String hdqtallmratio = Util.checkString(req.getParameter("hdqtallmratio"));
String boallmratio = Util.checkString(req.getParameter("boallmratio"));
String adjmexchrate = Util.checkString(req.getParameter("adjmexchrate"));
String rdrgradsumyn = Util.checkString(req.getParameter("rdrgradsumyn"));
String vdtyyn = Util.checkString(req.getParameter("vdtyyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String paybasicd = Util.Uni2Ksc(Util.checkString(req.getParameter("paybasicd")));
String payclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("payclsfcd")));
String pontcalcclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("pontcalcclsfcd")));
String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));
String paypointdescri = Util.Uni2Ksc(Util.checkString(req.getParameter("paypointdescri")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String pont = Util.Uni2Ksc(Util.checkString(req.getParameter("pont")));
String pontrate = Util.Uni2Ksc(Util.checkString(req.getParameter("pontrate")));
String hdqtallmratio = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqtallmratio")));
String boallmratio = Util.Uni2Ksc(Util.checkString(req.getParameter("boallmratio")));
String adjmexchrate = Util.Uni2Ksc(Util.checkString(req.getParameter("adjmexchrate")));
String rdrgradsumyn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrgradsumyn")));
String vdtyyn = Util.Uni2Ksc(Util.checkString(req.getParameter("vdtyyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setPaybasicd(paybasicd);
dm.setPayclsfcd(payclsfcd);
dm.setPontcalcclsfcd(pontcalcclsfcd);
dm.setDescri(descri);
dm.setPaypointdescri(paypointdescri);
dm.setRemk(remk);
dm.setPont(pont);
dm.setPontrate(pontrate);
dm.setHdqtallmratio(hdqtallmratio);
dm.setBoallmratio(boallmratio);
dm.setAdjmexchrate(adjmexchrate);
dm.setRdrgradsumyn(rdrgradsumyn);
dm.setVdtyyn(vdtyyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 21:41:14 KST 2004 */