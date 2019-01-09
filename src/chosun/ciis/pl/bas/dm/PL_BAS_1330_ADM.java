/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.ds.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1330_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String medi_cd_arr;
	public String dlco_cd_arr;
	public String dlco_seq_arr;
	public String deal_yn_arr;
	public String no_val_exne_arr;
	public String dcrate_arr;
	public String wh_cd_arr;
	public String sendclsf_arr;
	public String remk_arr;

	public PL_BAS_1330_ADM(){}
	public PL_BAS_1330_ADM(String cmpy_cd, String incmg_pers, String incmg_pers_ip, String medi_cd_arr, String dlco_cd_arr, String dlco_seq_arr, String deal_yn_arr, String no_val_exne_arr, String dcrate_arr, String wh_cd_arr, String sendclsf_arr, String remk_arr){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.medi_cd_arr = medi_cd_arr;
		this.dlco_cd_arr = dlco_cd_arr;
		this.dlco_seq_arr = dlco_seq_arr;
		this.deal_yn_arr = deal_yn_arr;
		this.no_val_exne_arr = no_val_exne_arr;
		this.dcrate_arr = dcrate_arr;
		this.wh_cd_arr = wh_cd_arr;
		this.sendclsf_arr = sendclsf_arr;
		this.remk_arr = remk_arr;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setMedi_cd_arr(String medi_cd_arr){
		this.medi_cd_arr = medi_cd_arr;
	}

	public void setDlco_cd_arr(String dlco_cd_arr){
		this.dlco_cd_arr = dlco_cd_arr;
	}

	public void setDlco_seq_arr(String dlco_seq_arr){
		this.dlco_seq_arr = dlco_seq_arr;
	}

	public void setDeal_yn_arr(String deal_yn_arr){
		this.deal_yn_arr = deal_yn_arr;
	}

	public void setNo_val_exne_arr(String no_val_exne_arr){
		this.no_val_exne_arr = no_val_exne_arr;
	}

	public void setDcrate_arr(String dcrate_arr){
		this.dcrate_arr = dcrate_arr;
	}

	public void setWh_cd_arr(String wh_cd_arr){
		this.wh_cd_arr = wh_cd_arr;
	}

	public void setSendclsf_arr(String sendclsf_arr){
		this.sendclsf_arr = sendclsf_arr;
	}

	public void setRemk_arr(String remk_arr){
		this.remk_arr = remk_arr;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getMedi_cd_arr(){
		return this.medi_cd_arr;
	}

	public String getDlco_cd_arr(){
		return this.dlco_cd_arr;
	}

	public String getDlco_seq_arr(){
		return this.dlco_seq_arr;
	}

	public String getDeal_yn_arr(){
		return this.deal_yn_arr;
	}

	public String getNo_val_exne_arr(){
		return this.no_val_exne_arr;
	}

	public String getDcrate_arr(){
		return this.dcrate_arr;
	}

	public String getWh_cd_arr(){
		return this.wh_cd_arr;
	}

	public String getSendclsf_arr(){
		return this.sendclsf_arr;
	}

	public String getRemk_arr(){
		return this.remk_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1330_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1330_ADM dm = (PL_BAS_1330_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ip);
		cstmt.setString(6, dm.medi_cd_arr);
		cstmt.setString(7, dm.dlco_cd_arr);
		cstmt.setString(8, dm.dlco_seq_arr);
		cstmt.setString(9, dm.deal_yn_arr);
		cstmt.setString(10, dm.no_val_exne_arr);
		cstmt.setString(11, dm.dcrate_arr);
		cstmt.setString(12, dm.wh_cd_arr);
		cstmt.setString(13, dm.sendclsf_arr);
		cstmt.setString(14, dm.remk_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1330_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("medi_cd_arr = " + getMedi_cd_arr());
        System.out.println("dlco_cd_arr = " + getDlco_cd_arr());
        System.out.println("dlco_seq_arr = " + getDlco_seq_arr());
        System.out.println("deal_yn_arr = " + getDeal_yn_arr());
        System.out.println("no_val_exne_arr = " + getNo_val_exne_arr());
        System.out.println("dcrate_arr = " + getDcrate_arr());
        System.out.println("wh_cd_arr = " + getWh_cd_arr());
        System.out.println("sendclsf_arr = " + getSendclsf_arr());
        System.out.println("remk_arr = " + getRemk_arr());
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
String medi_cd_arr = req.getParameter("medi_cd_arr");
if( medi_cd_arr == null){
	System.out.println(this.toString+" : medi_cd_arr is null" );
}else{
	System.out.println(this.toString+" : medi_cd_arr is "+medi_cd_arr );
}
String dlco_cd_arr = req.getParameter("dlco_cd_arr");
if( dlco_cd_arr == null){
	System.out.println(this.toString+" : dlco_cd_arr is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_arr is "+dlco_cd_arr );
}
String dlco_seq_arr = req.getParameter("dlco_seq_arr");
if( dlco_seq_arr == null){
	System.out.println(this.toString+" : dlco_seq_arr is null" );
}else{
	System.out.println(this.toString+" : dlco_seq_arr is "+dlco_seq_arr );
}
String deal_yn_arr = req.getParameter("deal_yn_arr");
if( deal_yn_arr == null){
	System.out.println(this.toString+" : deal_yn_arr is null" );
}else{
	System.out.println(this.toString+" : deal_yn_arr is "+deal_yn_arr );
}
String no_val_exne_arr = req.getParameter("no_val_exne_arr");
if( no_val_exne_arr == null){
	System.out.println(this.toString+" : no_val_exne_arr is null" );
}else{
	System.out.println(this.toString+" : no_val_exne_arr is "+no_val_exne_arr );
}
String dcrate_arr = req.getParameter("dcrate_arr");
if( dcrate_arr == null){
	System.out.println(this.toString+" : dcrate_arr is null" );
}else{
	System.out.println(this.toString+" : dcrate_arr is "+dcrate_arr );
}
String wh_cd_arr = req.getParameter("wh_cd_arr");
if( wh_cd_arr == null){
	System.out.println(this.toString+" : wh_cd_arr is null" );
}else{
	System.out.println(this.toString+" : wh_cd_arr is "+wh_cd_arr );
}
String sendclsf_arr = req.getParameter("sendclsf_arr");
if( sendclsf_arr == null){
	System.out.println(this.toString+" : sendclsf_arr is null" );
}else{
	System.out.println(this.toString+" : sendclsf_arr is "+sendclsf_arr );
}
String remk_arr = req.getParameter("remk_arr");
if( remk_arr == null){
	System.out.println(this.toString+" : remk_arr is null" );
}else{
	System.out.println(this.toString+" : remk_arr is "+remk_arr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String medi_cd_arr = Util.checkString(req.getParameter("medi_cd_arr"));
String dlco_cd_arr = Util.checkString(req.getParameter("dlco_cd_arr"));
String dlco_seq_arr = Util.checkString(req.getParameter("dlco_seq_arr"));
String deal_yn_arr = Util.checkString(req.getParameter("deal_yn_arr"));
String no_val_exne_arr = Util.checkString(req.getParameter("no_val_exne_arr"));
String dcrate_arr = Util.checkString(req.getParameter("dcrate_arr"));
String wh_cd_arr = Util.checkString(req.getParameter("wh_cd_arr"));
String sendclsf_arr = Util.checkString(req.getParameter("sendclsf_arr"));
String remk_arr = Util.checkString(req.getParameter("remk_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String medi_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_arr")));
String dlco_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_arr")));
String dlco_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq_arr")));
String deal_yn_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_yn_arr")));
String no_val_exne_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("no_val_exne_arr")));
String dcrate_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate_arr")));
String wh_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd_arr")));
String sendclsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("sendclsf_arr")));
String remk_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMedi_cd_arr(medi_cd_arr);
dm.setDlco_cd_arr(dlco_cd_arr);
dm.setDlco_seq_arr(dlco_seq_arr);
dm.setDeal_yn_arr(deal_yn_arr);
dm.setNo_val_exne_arr(no_val_exne_arr);
dm.setDcrate_arr(dcrate_arr);
dm.setWh_cd_arr(wh_cd_arr);
dm.setSendclsf_arr(sendclsf_arr);
dm.setRemk_arr(remk_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 20:13:04 KST 2009 */