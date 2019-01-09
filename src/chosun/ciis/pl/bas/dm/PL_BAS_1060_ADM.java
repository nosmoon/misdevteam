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


public class PL_BAS_1060_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String mode_arr;
	public String medi_cd_arr;
	public String medi_ser_no_arr;
	public String appndx_seq_arr;
	public String reg_dt_arr;
	public String appndx_nm_arr;
	public String appndx_qty_arr;
	public String wgt_arr;
	public String remk_arr;

	public PL_BAS_1060_ADM(){}
	public PL_BAS_1060_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String mode_arr, String medi_cd_arr, String medi_ser_no_arr, String appndx_seq_arr, String reg_dt_arr, String appndx_nm_arr, String appndx_qty_arr, String wgt_arr, String remk_arr){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.mode_arr = mode_arr;
		this.medi_cd_arr = medi_cd_arr;
		this.medi_ser_no_arr = medi_ser_no_arr;
		this.appndx_seq_arr = appndx_seq_arr;
		this.reg_dt_arr = reg_dt_arr;
		this.appndx_nm_arr = appndx_nm_arr;
		this.appndx_qty_arr = appndx_qty_arr;
		this.wgt_arr = wgt_arr;
		this.remk_arr = remk_arr;
	}

	public void setAcc_flag(String acc_flag){
		this.acc_flag = acc_flag;
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

	public void setMode_arr(String mode_arr){
		this.mode_arr = mode_arr;
	}

	public void setMedi_cd_arr(String medi_cd_arr){
		this.medi_cd_arr = medi_cd_arr;
	}

	public void setMedi_ser_no_arr(String medi_ser_no_arr){
		this.medi_ser_no_arr = medi_ser_no_arr;
	}

	public void setAppndx_seq_arr(String appndx_seq_arr){
		this.appndx_seq_arr = appndx_seq_arr;
	}

	public void setReg_dt_arr(String reg_dt_arr){
		this.reg_dt_arr = reg_dt_arr;
	}

	public void setAppndx_nm_arr(String appndx_nm_arr){
		this.appndx_nm_arr = appndx_nm_arr;
	}

	public void setAppndx_qty_arr(String appndx_qty_arr){
		this.appndx_qty_arr = appndx_qty_arr;
	}

	public void setWgt_arr(String wgt_arr){
		this.wgt_arr = wgt_arr;
	}

	public void setRemk_arr(String remk_arr){
		this.remk_arr = remk_arr;
	}

	public String getAcc_flag(){
		return this.acc_flag;
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

	public String getMode_arr(){
		return this.mode_arr;
	}

	public String getMedi_cd_arr(){
		return this.medi_cd_arr;
	}

	public String getMedi_ser_no_arr(){
		return this.medi_ser_no_arr;
	}

	public String getAppndx_seq_arr(){
		return this.appndx_seq_arr;
	}

	public String getReg_dt_arr(){
		return this.reg_dt_arr;
	}

	public String getAppndx_nm_arr(){
		return this.appndx_nm_arr;
	}

	public String getAppndx_qty_arr(){
		return this.appndx_qty_arr;
	}

	public String getWgt_arr(){
		return this.wgt_arr;
	}

	public String getRemk_arr(){
		return this.remk_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1060_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1060_ADM dm = (PL_BAS_1060_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.mode_arr);
		cstmt.setString(8, dm.medi_cd_arr);
		cstmt.setString(9, dm.medi_ser_no_arr);
		cstmt.setString(10, dm.appndx_seq_arr);
		cstmt.setString(11, dm.reg_dt_arr);
		cstmt.setString(12, dm.appndx_nm_arr);
		cstmt.setString(13, dm.appndx_qty_arr);
		cstmt.setString(14, dm.wgt_arr);
		cstmt.setString(15, dm.remk_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1060_ADataSet();
	}



    public void print(){
        System.out.println("acc_flag = " + getAcc_flag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("mode_arr = " + getMode_arr());
        System.out.println("medi_cd_arr = " + getMedi_cd_arr());
        System.out.println("medi_ser_no_arr = " + getMedi_ser_no_arr());
        System.out.println("appndx_seq_arr = " + getAppndx_seq_arr());
        System.out.println("reg_dt_arr = " + getReg_dt_arr());
        System.out.println("appndx_nm_arr = " + getAppndx_nm_arr());
        System.out.println("appndx_qty_arr = " + getAppndx_qty_arr());
        System.out.println("wgt_arr = " + getWgt_arr());
        System.out.println("remk_arr = " + getRemk_arr());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String acc_flag = req.getParameter("acc_flag");
if( acc_flag == null){
	System.out.println(this.toString+" : acc_flag is null" );
}else{
	System.out.println(this.toString+" : acc_flag is "+acc_flag );
}
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
String mode_arr = req.getParameter("mode_arr");
if( mode_arr == null){
	System.out.println(this.toString+" : mode_arr is null" );
}else{
	System.out.println(this.toString+" : mode_arr is "+mode_arr );
}
String medi_cd_arr = req.getParameter("medi_cd_arr");
if( medi_cd_arr == null){
	System.out.println(this.toString+" : medi_cd_arr is null" );
}else{
	System.out.println(this.toString+" : medi_cd_arr is "+medi_cd_arr );
}
String medi_ser_no_arr = req.getParameter("medi_ser_no_arr");
if( medi_ser_no_arr == null){
	System.out.println(this.toString+" : medi_ser_no_arr is null" );
}else{
	System.out.println(this.toString+" : medi_ser_no_arr is "+medi_ser_no_arr );
}
String appndx_seq_arr = req.getParameter("appndx_seq_arr");
if( appndx_seq_arr == null){
	System.out.println(this.toString+" : appndx_seq_arr is null" );
}else{
	System.out.println(this.toString+" : appndx_seq_arr is "+appndx_seq_arr );
}
String reg_dt_arr = req.getParameter("reg_dt_arr");
if( reg_dt_arr == null){
	System.out.println(this.toString+" : reg_dt_arr is null" );
}else{
	System.out.println(this.toString+" : reg_dt_arr is "+reg_dt_arr );
}
String appndx_nm_arr = req.getParameter("appndx_nm_arr");
if( appndx_nm_arr == null){
	System.out.println(this.toString+" : appndx_nm_arr is null" );
}else{
	System.out.println(this.toString+" : appndx_nm_arr is "+appndx_nm_arr );
}
String appndx_qty_arr = req.getParameter("appndx_qty_arr");
if( appndx_qty_arr == null){
	System.out.println(this.toString+" : appndx_qty_arr is null" );
}else{
	System.out.println(this.toString+" : appndx_qty_arr is "+appndx_qty_arr );
}
String wgt_arr = req.getParameter("wgt_arr");
if( wgt_arr == null){
	System.out.println(this.toString+" : wgt_arr is null" );
}else{
	System.out.println(this.toString+" : wgt_arr is "+wgt_arr );
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

String acc_flag = Util.checkString(req.getParameter("acc_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String mode_arr = Util.checkString(req.getParameter("mode_arr"));
String medi_cd_arr = Util.checkString(req.getParameter("medi_cd_arr"));
String medi_ser_no_arr = Util.checkString(req.getParameter("medi_ser_no_arr"));
String appndx_seq_arr = Util.checkString(req.getParameter("appndx_seq_arr"));
String reg_dt_arr = Util.checkString(req.getParameter("reg_dt_arr"));
String appndx_nm_arr = Util.checkString(req.getParameter("appndx_nm_arr"));
String appndx_qty_arr = Util.checkString(req.getParameter("appndx_qty_arr"));
String wgt_arr = Util.checkString(req.getParameter("wgt_arr"));
String remk_arr = Util.checkString(req.getParameter("remk_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String mode_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_arr")));
String medi_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_arr")));
String medi_ser_no_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no_arr")));
String appndx_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("appndx_seq_arr")));
String reg_dt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt_arr")));
String appndx_nm_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("appndx_nm_arr")));
String appndx_qty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("appndx_qty_arr")));
String wgt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("wgt_arr")));
String remk_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMode_arr(mode_arr);
dm.setMedi_cd_arr(medi_cd_arr);
dm.setMedi_ser_no_arr(medi_ser_no_arr);
dm.setAppndx_seq_arr(appndx_seq_arr);
dm.setReg_dt_arr(reg_dt_arr);
dm.setAppndx_nm_arr(appndx_nm_arr);
dm.setAppndx_qty_arr(appndx_qty_arr);
dm.setWgt_arr(wgt_arr);
dm.setRemk_arr(remk_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 20:13:04 KST 2009 */