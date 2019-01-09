/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2007-05-22
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_1120_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String medi_cd;
	public String tms;
	public String mode_ar;
	public String bo_cd_ar;
	public String bo_seq_ar;
	public String gnr_enty_qty_ar;
	public String isenty_qty_ar;
	public String isicdc_qty_ar;
	public String rdr_extn_enty_qty_ar;
	public String val_movm_qty_ar;
	public String val_icdc_qty_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_QTY_1120_UDM(){}
	public SE_QTY_1120_UDM(String cmpy_cd, String yymm, String medi_cd, String tms, String mode_ar, String bo_cd_ar, String bo_seq_ar, String gnr_enty_qty_ar, String isenty_qty_ar, String isicdc_qty_ar, String rdr_extn_enty_qty_ar, String val_movm_qty_ar, String val_icdc_qty_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.medi_cd = medi_cd;
		this.tms = tms;
		this.mode_ar = mode_ar;
		this.bo_cd_ar = bo_cd_ar;
		this.bo_seq_ar = bo_seq_ar;
		this.gnr_enty_qty_ar = gnr_enty_qty_ar;
		this.isenty_qty_ar = isenty_qty_ar;
		this.isicdc_qty_ar = isicdc_qty_ar;
		this.rdr_extn_enty_qty_ar = rdr_extn_enty_qty_ar;
		this.val_movm_qty_ar = val_movm_qty_ar;
		this.val_icdc_qty_ar = val_icdc_qty_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setBo_cd_ar(String bo_cd_ar){
		this.bo_cd_ar = bo_cd_ar;
	}

	public void setBo_seq_ar(String bo_seq_ar){
		this.bo_seq_ar = bo_seq_ar;
	}

	public void setGnr_enty_qty_ar(String gnr_enty_qty_ar){
		this.gnr_enty_qty_ar = gnr_enty_qty_ar;
	}

	public void setIsenty_qty_ar(String isenty_qty_ar){
		this.isenty_qty_ar = isenty_qty_ar;
	}

	public void setIsicdc_qty_ar(String isicdc_qty_ar){
		this.isicdc_qty_ar = isicdc_qty_ar;
	}

	public void setRdr_extn_enty_qty_ar(String rdr_extn_enty_qty_ar){
		this.rdr_extn_enty_qty_ar = rdr_extn_enty_qty_ar;
	}

	public void setVal_movm_qty_ar(String val_movm_qty_ar){
		this.val_movm_qty_ar = val_movm_qty_ar;
	}

	public void setVal_icdc_qty_ar(String val_icdc_qty_ar){
		this.val_icdc_qty_ar = val_icdc_qty_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getBo_cd_ar(){
		return this.bo_cd_ar;
	}

	public String getBo_seq_ar(){
		return this.bo_seq_ar;
	}

	public String getGnr_enty_qty_ar(){
		return this.gnr_enty_qty_ar;
	}

	public String getIsenty_qty_ar(){
		return this.isenty_qty_ar;
	}

	public String getIsicdc_qty_ar(){
		return this.isicdc_qty_ar;
	}

	public String getRdr_extn_enty_qty_ar(){
		return this.rdr_extn_enty_qty_ar;
	}

	public String getVal_movm_qty_ar(){
		return this.val_movm_qty_ar;
	}

	public String getVal_icdc_qty_ar(){
		return this.val_icdc_qty_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_QTY_1120_U( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_1120_UDM dm = (SE_QTY_1120_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.tms);
		cstmt.setString(7, dm.mode_ar);
		cstmt.setString(8, dm.bo_cd_ar);
		cstmt.setString(9, dm.bo_seq_ar);
		cstmt.setString(10, dm.gnr_enty_qty_ar);
		cstmt.setString(11, dm.isenty_qty_ar);
		cstmt.setString(12, dm.isicdc_qty_ar);
		cstmt.setString(13, dm.rdr_extn_enty_qty_ar);
		cstmt.setString(14, dm.val_movm_qty_ar);
		cstmt.setString(15, dm.val_icdc_qty_ar);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_1120_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yymm = " + getYymm());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("tms = " + getTms());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("bo_cd_ar = " + getBo_cd_ar());
        System.out.println("bo_seq_ar = " + getBo_seq_ar());
        System.out.println("gnr_enty_qty_ar = " + getGnr_enty_qty_ar());
        System.out.println("isenty_qty_ar = " + getIsenty_qty_ar());
        System.out.println("isicdc_qty_ar = " + getIsicdc_qty_ar());
        System.out.println("rdr_extn_enty_qty_ar = " + getRdr_extn_enty_qty_ar());
        System.out.println("val_movm_qty_ar = " + getVal_movm_qty_ar());
        System.out.println("val_icdc_qty_ar = " + getVal_icdc_qty_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String bo_cd_ar = req.getParameter("bo_cd_ar");
if( bo_cd_ar == null){
	System.out.println(this.toString+" : bo_cd_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cd_ar is "+bo_cd_ar );
}
String bo_seq_ar = req.getParameter("bo_seq_ar");
if( bo_seq_ar == null){
	System.out.println(this.toString+" : bo_seq_ar is null" );
}else{
	System.out.println(this.toString+" : bo_seq_ar is "+bo_seq_ar );
}
String gnr_enty_qty_ar = req.getParameter("gnr_enty_qty_ar");
if( gnr_enty_qty_ar == null){
	System.out.println(this.toString+" : gnr_enty_qty_ar is null" );
}else{
	System.out.println(this.toString+" : gnr_enty_qty_ar is "+gnr_enty_qty_ar );
}
String isenty_qty_ar = req.getParameter("isenty_qty_ar");
if( isenty_qty_ar == null){
	System.out.println(this.toString+" : isenty_qty_ar is null" );
}else{
	System.out.println(this.toString+" : isenty_qty_ar is "+isenty_qty_ar );
}
String isicdc_qty_ar = req.getParameter("isicdc_qty_ar");
if( isicdc_qty_ar == null){
	System.out.println(this.toString+" : isicdc_qty_ar is null" );
}else{
	System.out.println(this.toString+" : isicdc_qty_ar is "+isicdc_qty_ar );
}
String rdr_extn_enty_qty_ar = req.getParameter("rdr_extn_enty_qty_ar");
if( rdr_extn_enty_qty_ar == null){
	System.out.println(this.toString+" : rdr_extn_enty_qty_ar is null" );
}else{
	System.out.println(this.toString+" : rdr_extn_enty_qty_ar is "+rdr_extn_enty_qty_ar );
}
String val_movm_qty_ar = req.getParameter("val_movm_qty_ar");
if( val_movm_qty_ar == null){
	System.out.println(this.toString+" : val_movm_qty_ar is null" );
}else{
	System.out.println(this.toString+" : val_movm_qty_ar is "+val_movm_qty_ar );
}
String val_icdc_qty_ar = req.getParameter("val_icdc_qty_ar");
if( val_icdc_qty_ar == null){
	System.out.println(this.toString+" : val_icdc_qty_ar is null" );
}else{
	System.out.println(this.toString+" : val_icdc_qty_ar is "+val_icdc_qty_ar );
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
String yymm = Util.checkString(req.getParameter("yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String tms = Util.checkString(req.getParameter("tms"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String bo_cd_ar = Util.checkString(req.getParameter("bo_cd_ar"));
String bo_seq_ar = Util.checkString(req.getParameter("bo_seq_ar"));
String gnr_enty_qty_ar = Util.checkString(req.getParameter("gnr_enty_qty_ar"));
String isenty_qty_ar = Util.checkString(req.getParameter("isenty_qty_ar"));
String isicdc_qty_ar = Util.checkString(req.getParameter("isicdc_qty_ar"));
String rdr_extn_enty_qty_ar = Util.checkString(req.getParameter("rdr_extn_enty_qty_ar"));
String val_movm_qty_ar = Util.checkString(req.getParameter("val_movm_qty_ar"));
String val_icdc_qty_ar = Util.checkString(req.getParameter("val_icdc_qty_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String bo_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd_ar")));
String bo_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq_ar")));
String gnr_enty_qty_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("gnr_enty_qty_ar")));
String isenty_qty_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("isenty_qty_ar")));
String isicdc_qty_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("isicdc_qty_ar")));
String rdr_extn_enty_qty_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extn_enty_qty_ar")));
String val_movm_qty_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("val_movm_qty_ar")));
String val_icdc_qty_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("val_icdc_qty_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setMedi_cd(medi_cd);
dm.setTms(tms);
dm.setMode_ar(mode_ar);
dm.setBo_cd_ar(bo_cd_ar);
dm.setBo_seq_ar(bo_seq_ar);
dm.setGnr_enty_qty_ar(gnr_enty_qty_ar);
dm.setIsenty_qty_ar(isenty_qty_ar);
dm.setIsicdc_qty_ar(isicdc_qty_ar);
dm.setRdr_extn_enty_qty_ar(rdr_extn_enty_qty_ar);
dm.setVal_movm_qty_ar(val_movm_qty_ar);
dm.setVal_icdc_qty_ar(val_icdc_qty_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 13 10:03:05 KST 2009 */