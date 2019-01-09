/***************************************************************************************************
* 파일명 : SE_SND_2440_ADM.java
* 기능 : 판매-발송관리-수송단가변경
* 작성일자 : 2009-02-20
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


public class SE_SND_2440_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd         	;
	public String mode				;
	public String chg_reg_dt		;
	public String chg_no			;
	public String aply_dt			;
	public String route_cnt			;
	public String resn				;
	public String remk				;
	public String decid_stat_clsf	;
	public String aply_yn			;
	public String mode_sub			;
	public String chg_reg_dt_sub	;
	public String chg_no_sub		;
	public String tran_uprc_cd		;
	public String tran_uprc_route_nm;
	public String tran_uprc_clas	;
	public String route_clsf		;
	public String route_cd			;
	public String prt_plac_cd		;
	public String load_wgt			;
	public String route_lgth		;
	public String rmks				;
	public String tran_cost			;
	public String tran_uprc_qty_clsf;
	public String mode_end			;
	public String chg_reg_dt_end	;
	public String chg_no_end		;
	public String tran_uprc_cd_end	;
	public String medi_cd			;
	public String sect_cd			;
	public String send_yn			;
	public String qty				;
	public String incmg_pers_ip   	;
	public String incmg_pers      	;

	public SE_SND_2440_ADM(){}
	public SE_SND_2440_ADM( String cmpy_cd, String mode,String chg_reg_dt, String chg_no, String aply_dt, String route_cnt, String resn, String remk, String decid_stat_clsf, String aply_yn, String mode_sub, String chg_reg_dt_sub, String chg_no_sub, String tran_uprc_cd, String tran_uprc_route_nm, String tran_uprc_clas, String route_clsf, String route_cd, String prt_plac_cd, String load_wgt, String route_lgth, String rmks, String tran_cost, String tran_uprc_qty_clsf, String mode_end, String chg_reg_dt_end, String chg_no_end, String tran_uprc_cd_end, String medi_cd, String sect_cd, String send_yn, String qty, String incmg_pers_ip, String incmg_pers ){
		this.cmpy_cd         	    = cmpy_cd         	;
		this.mode				    = mode				;
		this.chg_reg_dt		        = chg_reg_dt		;
		this.chg_no			        = chg_no			;
		this.aply_dt			    = aply_dt			;
		this.route_cnt			    = route_cnt			;
		this.resn				    = resn				;
		this.remk				    = remk				;
		this.decid_stat_clsf	    = decid_stat_clsf	;
		this.aply_yn			    = aply_yn			;
		this.mode_sub			    = mode_sub			;
		this.chg_reg_dt_sub	      	= chg_reg_dt_sub	;
		this.chg_no_sub		        = chg_no_sub		;
		this.tran_uprc_cd		    = tran_uprc_cd		;
		this.tran_uprc_route_nm   	= tran_uprc_route_nm;
		this.tran_uprc_clas	      	= tran_uprc_clas	;
		this.route_clsf		        = route_clsf		;
		this.route_cd			    = route_cd			;
		this.prt_plac_cd		    = prt_plac_cd		;
		this.load_wgt			    = load_wgt			;
		this.route_lgth		        = route_lgth		;
		this.rmks				    = rmks				;
		this.tran_cost			    = tran_cost			;
		this.tran_uprc_qty_clsf     = tran_uprc_qty_clsf;
		this.mode_end			    = mode_end			;
		this.chg_reg_dt_end	      	= chg_reg_dt_end	;
		this.chg_no_end		        = chg_no_end		;
		this.tran_uprc_cd_end	    = tran_uprc_cd_end	;
		this.medi_cd			    = medi_cd			;
		this.sect_cd			    = sect_cd			;
		this.send_yn			    = send_yn			;
		this.qty				    = qty				;
		this.incmg_pers_ip   	    = incmg_pers_ip   	;
		this.incmg_pers      		= incmg_pers    	;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_2440_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2440_ADM dm = (SE_SND_2440_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, cmpy_cd         	);
		cstmt.setString( 4, mode				);
		cstmt.setString( 5, chg_reg_dt		    );
		cstmt.setString( 6, chg_no			    );
		cstmt.setString( 7, aply_dt			    );
		cstmt.setString( 8, route_cnt			);
		cstmt.setString( 9, resn				);
		cstmt.setString(10, remk				);
		cstmt.setString(11, decid_stat_clsf	    );
		cstmt.setString(12, aply_yn			    );
		cstmt.setString(13, mode_sub			);
		cstmt.setString(14, chg_reg_dt_sub	    );
		cstmt.setString(15, chg_no_sub		    );
		cstmt.setString(16, tran_uprc_cd		);
		cstmt.setString(17, tran_uprc_route_nm  );
		cstmt.setString(18, tran_uprc_clas	    );
		cstmt.setString(19, route_clsf		    );
		cstmt.setString(20, route_cd			);
		cstmt.setString(21, prt_plac_cd		    );
		cstmt.setString(22, load_wgt			);
		cstmt.setString(23, route_lgth		    );
		cstmt.setString(24, rmks				);
		cstmt.setString(25, tran_cost			);
		cstmt.setString(26, tran_uprc_qty_clsf	);
		cstmt.setString(27, mode_end			);
		cstmt.setString(28, chg_reg_dt_end	    );
		cstmt.setString(29, chg_no_end		    );
		cstmt.setString(30, tran_uprc_cd_end	);
		cstmt.setString(31, medi_cd			    );
		cstmt.setString(32, sect_cd			    );
		cstmt.setString(33, send_yn			    );
		cstmt.setString(34, qty				    );
		cstmt.setString(35, incmg_pers_ip   	);
		cstmt.setString(36, incmg_pers      	);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2440_ADataSet();
	}
		
    public void print(){
    	System.out.println("cmpy_cd             = " + getCmpy_cd           ());
    	System.out.println("mode                = " + getMode              ());
    	System.out.println("chg_reg_dt          = " + getChg_reg_dt        ());
    	System.out.println("chg_no              = " + getChg_no            ());
    	System.out.println("aply_dt             = " + getAply_dt           ());
    	System.out.println("route_cnt           = " + getRoute_cnt         ());
    	System.out.println("resn                = " + getResn              ());
    	System.out.println("remk                = " + getRemk              ());
    	System.out.println("decid_stat_clsf     = " + getDecid_stat_clsf   ());
    	System.out.println("aply_yn             = " + getAply_yn           ());
    	System.out.println("mode_sub            = " + getMode_sub          ());
    	System.out.println("chg_reg_dt_sub      = " + getChg_reg_dt_sub    ());
    	System.out.println("chg_no_sub          = " + getChg_no_sub        ());
    	System.out.println("tran_uprc_cd        = " + getTran_uprc_cd      ());
    	System.out.println("tran_uprc_route_nm  = " + getTran_uprc_route_nm());
    	System.out.println("tran_uprc_clas      = " + getTran_uprc_clas    ());
    	System.out.println("route_clsf          = " + getRoute_clsf        ());
    	System.out.println("route_cd            = " + getRoute_cd          ());
    	System.out.println("prt_plac_cd         = " + getPrt_plac_cd       ());
    	System.out.println("load_wgt            = " + getLoad_wgt          ());
    	System.out.println("route_lgth          = " + getRoute_lgth        ());
    	System.out.println("rmks                = " + getRmks              ());
    	System.out.println("tran_cost           = " + getTran_cost         ());
    	System.out.println("tran_uprc_qty_clsf  = " + getTran_uprc_qty_clsf());
    	System.out.println("mode_end            = " + getMode_end          ());
    	System.out.println("chg_reg_dt_end      = " + getChg_reg_dt_end    ());
    	System.out.println("chg_no_end          = " + getChg_no_end        ());
    	System.out.println("tran_uprc_cd_end    = " + getTran_uprc_cd_end  ());
    	System.out.println("medi_cd             = " + getMedi_cd           ());
    	System.out.println("sect_cd             = " + getSect_cd           ());
    	System.out.println("send_yn             = " + getSend_yn           ());
    	System.out.println("qty                 = " + getQty               ());
    	System.out.println("incmg_pers_ip       = " + getIncmg_pers_ip     ());
    	System.out.println("incmg_pers          = " + getIncmg_pers        ());
    }
	public String getAply_dt() {
		return aply_dt;
	}
	public void setAply_dt(String aply_dt) {
		this.aply_dt = aply_dt;
	}
	public String getAply_yn() {
		return aply_yn;
	}
	public void setAply_yn(String aply_yn) {
		this.aply_yn = aply_yn;
	}
	public String getChg_no() {
		return chg_no;
	}
	public void setChg_no(String chg_no) {
		this.chg_no = chg_no;
	}
	public String getChg_no_end() {
		return chg_no_end;
	}
	public void setChg_no_end(String chg_no_end) {
		this.chg_no_end = chg_no_end;
	}
	public String getChg_no_sub() {
		return chg_no_sub;
	}
	public void setChg_no_sub(String chg_no_sub) {
		this.chg_no_sub = chg_no_sub;
	}
	public String getChg_reg_dt() {
		return chg_reg_dt;
	}
	public void setChg_reg_dt(String chg_reg_dt) {
		this.chg_reg_dt = chg_reg_dt;
	}
	public String getChg_reg_dt_end() {
		return chg_reg_dt_end;
	}
	public void setChg_reg_dt_end(String chg_reg_dt_end) {
		this.chg_reg_dt_end = chg_reg_dt_end;
	}
	public String getChg_reg_dt_sub() {
		return chg_reg_dt_sub;
	}
	public void setChg_reg_dt_sub(String chg_reg_dt_sub) {
		this.chg_reg_dt_sub = chg_reg_dt_sub;
	}
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
	public String getDecid_stat_clsf() {
		return decid_stat_clsf;
	}
	public void setDecid_stat_clsf(String decid_stat_clsf) {
		this.decid_stat_clsf = decid_stat_clsf;
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
	public String getLoad_wgt() {
		return load_wgt;
	}
	public void setLoad_wgt(String load_wgt) {
		this.load_wgt = load_wgt;
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
	public String getMode_end() {
		return mode_end;
	}
	public void setMode_end(String mode_end) {
		this.mode_end = mode_end;
	}
	public String getMode_sub() {
		return mode_sub;
	}
	public void setMode_sub(String mode_sub) {
		this.mode_sub = mode_sub;
	}
	public String getPrt_plac_cd() {
		return prt_plac_cd;
	}
	public void setPrt_plac_cd(String prt_plac_cd) {
		this.prt_plac_cd = prt_plac_cd;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getRemk() {
		return remk;
	}
	public void setRemk(String remk) {
		this.remk = remk;
	}
	public String getResn() {
		return resn;
	}
	public void setResn(String resn) {
		this.resn = resn;
	}
	public String getRmks() {
		return rmks;
	}
	public void setRmks(String rmks) {
		this.rmks = rmks;
	}
	public String getRoute_cd() {
		return route_cd;
	}
	public void setRoute_cd(String route_cd) {
		this.route_cd = route_cd;
	}
	public String getRoute_clsf() {
		return route_clsf;
	}
	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}
	public String getRoute_cnt() {
		return route_cnt;
	}
	public void setRoute_cnt(String route_cnt) {
		this.route_cnt = route_cnt;
	}
	public String getRoute_lgth() {
		return route_lgth;
	}
	public void setRoute_lgth(String route_lgth) {
		this.route_lgth = route_lgth;
	}
	public String getSect_cd() {
		return sect_cd;
	}
	public void setSect_cd(String sect_cd) {
		this.sect_cd = sect_cd;
	}
	public String getSend_yn() {
		return send_yn;
	}
	public void setSend_yn(String send_yn) {
		this.send_yn = send_yn;
	}
	public String getTran_cost() {
		return tran_cost;
	}
	public void setTran_cost(String tran_cost) {
		this.tran_cost = tran_cost;
	}
	public String getTran_uprc_cd() {
		return tran_uprc_cd;
	}
	public void setTran_uprc_cd(String tran_uprc_cd) {
		this.tran_uprc_cd = tran_uprc_cd;
	}
	public String getTran_uprc_cd_end() {
		return tran_uprc_cd_end;
	}
	public void setTran_uprc_cd_end(String tran_uprc_cd_end) {
		this.tran_uprc_cd_end = tran_uprc_cd_end;
	}
	public String getTran_uprc_clas() {
		return tran_uprc_clas;
	}
	public void setTran_uprc_clas(String tran_uprc_clas) {
		this.tran_uprc_clas = tran_uprc_clas;
	}
	public String getTran_uprc_qty_clsf() {
		return tran_uprc_qty_clsf;
	}
	public void setTran_uprc_qty_clsf(String tran_uprc_qty_clsf) {
		this.tran_uprc_qty_clsf = tran_uprc_qty_clsf;
	}
	public String getTran_uprc_route_nm() {
		return tran_uprc_route_nm;
	}
	public void setTran_uprc_route_nm(String tran_uprc_route_nm) {
		this.tran_uprc_route_nm = tran_uprc_route_nm;
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
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
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
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setRoute_clsf(route_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 17:16:24 KST 2009 */