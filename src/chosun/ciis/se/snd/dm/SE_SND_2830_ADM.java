/***************************************************************************************************
* 파일명 : SE_SND_2830_ADM.java
* 기능 : 발송관리 - 마감관리 - 발송정보 DOWNLOAD
* 작성일자 : 2009-03-26
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2830_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd			;
	public String mode				;
	public String issu_dt			;
	public String clos_tms			;
	public String clos_dt			;
	public String clos_tm			;
	public String prt_dt			;
	public String route_clsf		;
	public String medi_cd			;
	public String sect_cd			;
	public String add_prt_seq		;
	public String send_medi_cd		;
	public String pcnt				;
	public String clr_pcnt			;
	public String qty_index			;
	public String qty				;
	public String send_yn			;
	public String yn				;
	public String incmg_pers		;
	public String incmg_pers_ip		;
    
	public SE_SND_2830_ADM(){}
	public SE_SND_2830_ADM(String cmpy_cd, String mode, String issu_dt, String clos_tms, String clos_dt, String clos_tm, String prt_dt, String route_clsf, String medi_cd, String sect_cd, String add_prt_seq, String send_medi_cd, String pcnt, String clr_pcnt, String qty_index, String qty, String send_yn, String yn, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd		= cmpy_cd		;
		this.mode			= mode			;
		this.issu_dt		= issu_dt		;
		this.clos_tms		= clos_tms		;
		this.clos_dt		= clos_dt		;
		this.clos_tm		= clos_tm		;
		this.prt_dt			= prt_dt		;
		this.route_clsf		= route_clsf	;
		this.medi_cd		= medi_cd		;
		this.sect_cd		= sect_cd		;
		this.add_prt_seq	= add_prt_seq	;
		this.send_medi_cd	= send_medi_cd	;
		this.pcnt			= pcnt			;
		this.clr_pcnt		= clr_pcnt		;
		this.qty_index		= qty_index		;
		this.qty			= qty			;
		this.send_yn		= send_yn		;
		this.yn				= yn			;
		this.incmg_pers		= incmg_pers	;
		this.incmg_pers_ip	= incmg_pers_ip ;
	}
	
	public String getSQL(){
		 return "{ call SP_SE_SND_2830_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2830_ADM dm = (SE_SND_2830_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd			);
		cstmt.setString( 4, dm.mode				);
		cstmt.setString( 5, dm.issu_dt			);
		cstmt.setString( 6, dm.clos_tms			);
		cstmt.setString( 7, dm.clos_dt			);
		cstmt.setString( 8, dm.clos_tm			);
		cstmt.setString( 9, dm.prt_dt			);
		cstmt.setString(10, dm.route_clsf		);
		cstmt.setString(11, dm.medi_cd			);
		cstmt.setString(12, dm.sect_cd			);
		cstmt.setString(13, dm.add_prt_seq		);
		cstmt.setString(14, dm.send_medi_cd		);
		cstmt.setString(15, dm.pcnt				);
		cstmt.setString(16, dm.clr_pcnt			);
		cstmt.setString(17, dm.qty_index		);
		cstmt.setString(18, dm.qty				);
		cstmt.setString(19, dm.send_yn			);
		cstmt.setString(20, dm.yn				);
		cstmt.setString(21, dm.incmg_pers		);
		cstmt.setString(22, dm.incmg_pers_ip	);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR	);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR	);
		cstmt.registerOutParameter(25, OracleTypes.CURSOR	);
		cstmt.registerOutParameter(26, OracleTypes.CURSOR	);
		cstmt.registerOutParameter(27, Types.VARCHAR		);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2830_ADataSet();
	}

   public void print(){
	   System.out.println("cmpy_cd         = " + getCmpy_cd         ());
	   System.out.println("mode            = " + getMode            ());
	   System.out.println("issu_dt         = " + getIssu_dt         ());
	   System.out.println("clos_tms        = " + getClos_tms        ());
	   System.out.println("clos_dt 	       = " + getClos_dt		    ());
	   System.out.println("clos_tm 	       = " + getClos_tm		    ());
	   System.out.println("prt_dt          = " + getPrt_dt          ());
	   System.out.println("route_clsf      = " + getRoute_clsf      ());
	   System.out.println("medi_cd         = " + getMedi_cd         ());
	   System.out.println("sect_cd         = " + getSect_cd         ());
	   System.out.println("add_prt_seq     = " + getAdd_prt_seq     ());
	   System.out.println("send_medi_cd    = " + getSend_medi_cd    ());
	   System.out.println("pcnt            = " + getPcnt            ());
	   System.out.println("clr_pcnt        = " + getClr_pcnt        ());
	   System.out.println("qty_index       = " + getQty_index       ());
	   System.out.println("qty             = " + getQty             ());
	   System.out.println("send_yn         = " + getSend_yn         ());
	   System.out.println("yn	 	       = " + getYn 		        ());
	   System.out.println("incmg_pers      = " + getIncmg_pers      ());
	   System.out.println("incmg_pers_ip   = " + getIncmg_pers_ip   ());
   }
	
	public String getAdd_prt_seq() {
		return add_prt_seq;
	}
	public void setAdd_prt_seq(String add_prt_seq) {
		this.add_prt_seq = add_prt_seq;
	}
	public String getClos_tms() {
		return clos_tms;
	}
	public void setClos_tms(String clos_tms) {
		this.clos_tms = clos_tms;
	}
	public String getClr_pcnt() {
		return clr_pcnt;
	}
	public void setClr_pcnt(String clr_pcnt) {
		this.clr_pcnt = clr_pcnt;
	}
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
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
	public String getIssu_dt() {
		return issu_dt;
	}
	public void setIssu_dt(String issu_dt) {
		this.issu_dt = issu_dt;
	}
	public String getMedi_cd() {
		return medi_cd;
	}
	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getPcnt() {
		return pcnt;
	}
	public void setPcnt(String pcnt) {
		this.pcnt = pcnt;
	}
	public String getPrt_dt() {
		return prt_dt;
	}
	public void setPrt_dt(String prt_dt) {
		this.prt_dt = prt_dt;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getQty_index() {
		return qty_index;
	}
	public void setQty_index(String qty_index) {
		this.qty_index = qty_index;
	}
	public String getRoute_clsf() {
		return route_clsf;
	}
	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}
	public String getSect_cd() {
		return sect_cd;
	}
	public void setSect_cd(String sect_cd) {
		this.sect_cd = sect_cd;
	}
	public String getSend_medi_cd() {
		return send_medi_cd;
	}
	public void setSend_medi_cd(String send_medi_cd) {
		this.send_medi_cd = send_medi_cd;
	}
	public String getSend_yn() {
		return send_yn;
	}
	public void setSend_yn(String send_yn) {
		this.send_yn = send_yn;
	}
	public String getClos_dt() {
		return clos_dt;
	}
	public void setClos_dt(String clos_dt) {
		this.clos_dt = clos_dt;
	}
	public String getClos_tm() {
		return clos_tm;
	}
	public void setClos_tm(String clos_tm) {
		this.clos_tm = clos_tm;
	}
	public String getYn() {
		return yn;
	}
	public void setYn(String yn) {
		this.yn = yn;
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 15:04:40 KST 2009 */