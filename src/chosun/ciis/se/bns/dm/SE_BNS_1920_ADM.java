/***************************************************************************************************
* 파일명 : SE_BNS_1920_ADM.java
* 기능 : 판매-판촉물관리 - 판촉물정정처리
* 작성일자 : 2009-05-01
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.ds.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1920_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd			;
	public String clos_yn			;
	public String yymm				;
	public String tms				;
	public String stmt_issu_clsf	;
	public String selldeptcd		;
	public String incmg_pers_ip		;
	public String incmg_pers		;

	public SE_BNS_1920_ADM(){}
	public SE_BNS_1920_ADM(String cmpy_cd, String clos_yn, String yymm, String tms, String stmt_issu_clsf, String selldeptcd, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd			= cmpy_cd				;
		this.clos_yn			= clos_yn				;
		this.yymm				= yymm					;
		this.tms				= tms					;
		this.stmt_issu_clsf		= stmt_issu_clsf		;
		this.selldeptcd			= selldeptcd			;
		this.incmg_pers_ip		= incmg_pers_ip			;
		this.incmg_pers			= incmg_pers			;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getCmpy_cd(){
		return cmpy_cd;
	}
	
	public String getClos_yn() {
		return clos_yn;
	}
	public void setClos_yn(String clos_yn) {
		this.clos_yn = clos_yn;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}
	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}
	public String getSelldeptcd() {
		return selldeptcd;
	}
	public void setSelldeptcd(String selldeptcd) {
		this.selldeptcd = selldeptcd;
	}
	public String getStmt_issu_clsf() {
		return stmt_issu_clsf;
	}
	public void setStmt_issu_clsf(String stmt_issu_clsf) {
		this.stmt_issu_clsf = stmt_issu_clsf;
	}
	public String getTms() {
		return tms;
	}
	public void setTms(String tms) {
		this.tms = tms;
	}
	public String getYymm() {
		return yymm;
	}
	public void setYymm(String yymm) {
		this.yymm = yymm;
	}
	
	public String getSQL(){
		 return "{ call SP_SE_BNS_1920_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1920_ADM dm = (SE_BNS_1920_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.clos_yn			);
		cstmt.setString( 4, dm.cmpy_cd			);
		cstmt.setString( 5, dm.yymm				);
		cstmt.setString( 6, dm.tms				);
		cstmt.setString( 7, dm.stmt_issu_clsf	);
		cstmt.setString( 8, dm.selldeptcd		);
		cstmt.setString( 9, dm.incmg_pers_ip	);
		cstmt.setString(10, dm.incmg_pers		);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1920_ADataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd			());
        System.out.println("clos_yn 		= " + getClos_yn			());
        System.out.println("yymm 			= " + getYymm				());
        System.out.println("tms 			= " + getTms				());
        System.out.println("stmt_issu_clsf 	= " + getStmt_issu_clsf		());
        System.out.println("selldeptcd 		= " + getSelldeptcd			());
        System.out.println("incmg_pers_ip 	= " + getIncmg_pers_ip		());
        System.out.println("incmg_pers 		= " + getIncmg_pers			());
            }
	
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String bns_item_cd = req.getParameter("bns_item_cd");
if( bns_item_cd == null){
	System.out.println(this.toString+" : bns_item_cd is null" );
}else{
	System.out.println(this.toString+" : bns_item_cd is "+bns_item_cd );
}
String divn_dt = req.getParameter("divn_dt");
if( divn_dt == null){
	System.out.println(this.toString+" : divn_dt is null" );
}else{
	System.out.println(this.toString+" : divn_dt is "+divn_dt );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String ewh_seq = req.getParameter("ewh_seq");
if( ewh_seq == null){
	System.out.println(this.toString+" : ewh_seq is null" );
}else{
	System.out.println(this.toString+" : ewh_seq is "+ewh_seq );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String divn_uprc = req.getParameter("divn_uprc");
if( divn_uprc == null){
	System.out.println(this.toString+" : divn_uprc is null" );
}else{
	System.out.println(this.toString+" : divn_uprc is "+divn_uprc );
}
String compen_divn_amt = req.getParameter("compen_divn_amt");
if( compen_divn_amt == null){
	System.out.println(this.toString+" : compen_divn_amt is null" );
}else{
	System.out.println(this.toString+" : compen_divn_amt is "+compen_divn_amt );
}
String nocompen_divn_amt = req.getParameter("nocompen_divn_amt");
if( nocompen_divn_amt == null){
	System.out.println(this.toString+" : nocompen_divn_amt is null" );
}else{
	System.out.println(this.toString+" : nocompen_divn_amt is "+nocompen_divn_amt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
String divn_dt = Util.checkString(req.getParameter("divn_dt"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String ewh_seq = Util.checkString(req.getParameter("ewh_seq"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String qunt = Util.checkString(req.getParameter("qunt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String divn_uprc = Util.checkString(req.getParameter("divn_uprc"));
String compen_divn_amt = Util.checkString(req.getParameter("compen_divn_amt"));
String nocompen_divn_amt = Util.checkString(req.getParameter("nocompen_divn_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String bns_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_cd")));
String divn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_dt")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String ewh_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_seq")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String divn_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_uprc")));
String compen_divn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("compen_divn_amt")));
String nocompen_divn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("nocompen_divn_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setBns_item_cd(bns_item_cd);
dm.setDivn_dt(divn_dt);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setEwh_seq(ewh_seq);
dm.setArea_cd(area_cd);
dm.setQunt(qunt);
dm.setUprc(uprc);
dm.setDivn_uprc(divn_uprc);
dm.setCompen_divn_amt(compen_divn_amt);
dm.setNocompen_divn_amt(nocompen_divn_amt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 14:22:15 KST 2009 */