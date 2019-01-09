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


public class PL_BAS_1250_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String mode_arr;
	public String dlco_cd_arr;
	public String dlco_seq_arr;
	public String send_plac_seq_arr;
	public String send_plac_nm_arr;
	public String magz_deal_yn_arr;
	public String sep_book_deal_yn_arr;
	public String vexc_dlco_cd_arr;
	public String tel_no_arr;
	public String fax_no_arr;
	public String zip_1_arr;
	public String zip_2_arr;
	public String addr_arr;
	public String dtls_addr_arr;
	public String remk_arr;

	public PL_BAS_1250_ADM(){}
	public PL_BAS_1250_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String mode_arr, String dlco_cd_arr, String dlco_seq_arr, String send_plac_seq_arr, String send_plac_nm_arr, String magz_deal_yn_arr, String sep_book_deal_yn_arr, String vexc_dlco_cd_arr, String tel_no_arr, String fax_no_arr, String zip_1_arr, String zip_2_arr, String addr_arr, String dtls_addr_arr, String remk_arr){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.mode_arr = mode_arr;
		this.dlco_cd_arr = dlco_cd_arr;
		this.dlco_seq_arr = dlco_seq_arr;
		this.send_plac_seq_arr = send_plac_seq_arr;
		this.send_plac_nm_arr = send_plac_nm_arr;
		this.magz_deal_yn_arr = magz_deal_yn_arr;
		this.sep_book_deal_yn_arr = sep_book_deal_yn_arr;
		this.vexc_dlco_cd_arr = vexc_dlco_cd_arr;
		this.tel_no_arr = tel_no_arr;
		this.fax_no_arr = fax_no_arr;
		this.zip_1_arr = zip_1_arr;
		this.zip_2_arr = zip_2_arr;
		this.addr_arr = addr_arr;
		this.dtls_addr_arr = dtls_addr_arr;
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

	public void setDlco_cd_arr(String dlco_cd_arr){
		this.dlco_cd_arr = dlco_cd_arr;
	}

	public void setDlco_seq_arr(String dlco_seq_arr){
		this.dlco_seq_arr = dlco_seq_arr;
	}

	public void setSend_plac_seq_arr(String send_plac_seq_arr){
		this.send_plac_seq_arr = send_plac_seq_arr;
	}

	public void setSend_plac_nm_arr(String send_plac_nm_arr){
		this.send_plac_nm_arr = send_plac_nm_arr;
	}

	public void setMagz_deal_yn_arr(String magz_deal_yn_arr){
		this.magz_deal_yn_arr = magz_deal_yn_arr;
	}

	public void setSep_book_deal_yn_arr(String sep_book_deal_yn_arr){
		this.sep_book_deal_yn_arr = sep_book_deal_yn_arr;
	}

	public void setVexc_dlco_cd_arr(String vexc_dlco_cd_arr){
		this.vexc_dlco_cd_arr = vexc_dlco_cd_arr;
	}

	public void setTel_no_arr(String tel_no_arr){
		this.tel_no_arr = tel_no_arr;
	}

	public void setFax_no_arr(String fax_no_arr){
		this.fax_no_arr = fax_no_arr;
	}

	public void setZip_1_arr(String zip_1_arr){
		this.zip_1_arr = zip_1_arr;
	}

	public void setZip_2_arr(String zip_2_arr){
		this.zip_2_arr = zip_2_arr;
	}

	public void setAddr_arr(String addr_arr){
		this.addr_arr = addr_arr;
	}

	public void setDtls_addr_arr(String dtls_addr_arr){
		this.dtls_addr_arr = dtls_addr_arr;
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

	public String getDlco_cd_arr(){
		return this.dlco_cd_arr;
	}

	public String getDlco_seq_arr(){
		return this.dlco_seq_arr;
	}

	public String getSend_plac_seq_arr(){
		return this.send_plac_seq_arr;
	}

	public String getSend_plac_nm_arr(){
		return this.send_plac_nm_arr;
	}

	public String getMagz_deal_yn_arr(){
		return this.magz_deal_yn_arr;
	}

	public String getSep_book_deal_yn_arr(){
		return this.sep_book_deal_yn_arr;
	}

	public String getVexc_dlco_cd_arr(){
		return this.vexc_dlco_cd_arr;
	}

	public String getTel_no_arr(){
		return this.tel_no_arr;
	}

	public String getFax_no_arr(){
		return this.fax_no_arr;
	}

	public String getZip_1_arr(){
		return this.zip_1_arr;
	}

	public String getZip_2_arr(){
		return this.zip_2_arr;
	}

	public String getAddr_arr(){
		return this.addr_arr;
	}

	public String getDtls_addr_arr(){
		return this.dtls_addr_arr;
	}

	public String getRemk_arr(){
		return this.remk_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1250_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1250_ADM dm = (PL_BAS_1250_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.mode_arr);
		cstmt.setString(8, dm.dlco_cd_arr);
		cstmt.setString(9, dm.dlco_seq_arr);
		cstmt.setString(10, dm.send_plac_seq_arr);
		cstmt.setString(11, dm.send_plac_nm_arr);
		cstmt.setString(12, dm.magz_deal_yn_arr);
		cstmt.setString(13, dm.sep_book_deal_yn_arr);
		cstmt.setString(14, dm.vexc_dlco_cd_arr);
		cstmt.setString(15, dm.tel_no_arr);
		cstmt.setString(16, dm.fax_no_arr);
		cstmt.setString(17, dm.zip_1_arr);
		cstmt.setString(18, dm.zip_2_arr);
		cstmt.setString(19, dm.addr_arr);
		cstmt.setString(20, dm.dtls_addr_arr);
		cstmt.setString(21, dm.remk_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1250_ADataSet();
	}



    public void print(){
        System.out.println("acc_flag = " + getAcc_flag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("mode_arr = " + getMode_arr());
        System.out.println("dlco_cd_arr = " + getDlco_cd_arr());
        System.out.println("dlco_seq_arr = " + getDlco_seq_arr());
        System.out.println("send_plac_seq_arr = " + getSend_plac_seq_arr());
        System.out.println("send_plac_nm_arr = " + getSend_plac_nm_arr());
        System.out.println("magz_deal_yn_arr = " + getMagz_deal_yn_arr());
        System.out.println("sep_book_deal_yn_arr = " + getSep_book_deal_yn_arr());
        System.out.println("vexc_dlco_cd_arr = " + getVexc_dlco_cd_arr());
        System.out.println("tel_no_arr = " + getTel_no_arr());
        System.out.println("fax_no_arr = " + getFax_no_arr());
        System.out.println("zip_1_arr = " + getZip_1_arr());
        System.out.println("zip_2_arr = " + getZip_2_arr());
        System.out.println("addr_arr = " + getAddr_arr());
        System.out.println("dtls_addr_arr = " + getDtls_addr_arr());
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
String send_plac_seq_arr = req.getParameter("send_plac_seq_arr");
if( send_plac_seq_arr == null){
	System.out.println(this.toString+" : send_plac_seq_arr is null" );
}else{
	System.out.println(this.toString+" : send_plac_seq_arr is "+send_plac_seq_arr );
}
String send_plac_nm_arr = req.getParameter("send_plac_nm_arr");
if( send_plac_nm_arr == null){
	System.out.println(this.toString+" : send_plac_nm_arr is null" );
}else{
	System.out.println(this.toString+" : send_plac_nm_arr is "+send_plac_nm_arr );
}
String magz_deal_yn_arr = req.getParameter("magz_deal_yn_arr");
if( magz_deal_yn_arr == null){
	System.out.println(this.toString+" : magz_deal_yn_arr is null" );
}else{
	System.out.println(this.toString+" : magz_deal_yn_arr is "+magz_deal_yn_arr );
}
String sep_book_deal_yn_arr = req.getParameter("sep_book_deal_yn_arr");
if( sep_book_deal_yn_arr == null){
	System.out.println(this.toString+" : sep_book_deal_yn_arr is null" );
}else{
	System.out.println(this.toString+" : sep_book_deal_yn_arr is "+sep_book_deal_yn_arr );
}
String vexc_dlco_cd_arr = req.getParameter("vexc_dlco_cd_arr");
if( vexc_dlco_cd_arr == null){
	System.out.println(this.toString+" : vexc_dlco_cd_arr is null" );
}else{
	System.out.println(this.toString+" : vexc_dlco_cd_arr is "+vexc_dlco_cd_arr );
}
String tel_no_arr = req.getParameter("tel_no_arr");
if( tel_no_arr == null){
	System.out.println(this.toString+" : tel_no_arr is null" );
}else{
	System.out.println(this.toString+" : tel_no_arr is "+tel_no_arr );
}
String fax_no_arr = req.getParameter("fax_no_arr");
if( fax_no_arr == null){
	System.out.println(this.toString+" : fax_no_arr is null" );
}else{
	System.out.println(this.toString+" : fax_no_arr is "+fax_no_arr );
}
String zip_1_arr = req.getParameter("zip_1_arr");
if( zip_1_arr == null){
	System.out.println(this.toString+" : zip_1_arr is null" );
}else{
	System.out.println(this.toString+" : zip_1_arr is "+zip_1_arr );
}
String zip_2_arr = req.getParameter("zip_2_arr");
if( zip_2_arr == null){
	System.out.println(this.toString+" : zip_2_arr is null" );
}else{
	System.out.println(this.toString+" : zip_2_arr is "+zip_2_arr );
}
String addr_arr = req.getParameter("addr_arr");
if( addr_arr == null){
	System.out.println(this.toString+" : addr_arr is null" );
}else{
	System.out.println(this.toString+" : addr_arr is "+addr_arr );
}
String dtls_addr_arr = req.getParameter("dtls_addr_arr");
if( dtls_addr_arr == null){
	System.out.println(this.toString+" : dtls_addr_arr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr_arr is "+dtls_addr_arr );
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
String dlco_cd_arr = Util.checkString(req.getParameter("dlco_cd_arr"));
String dlco_seq_arr = Util.checkString(req.getParameter("dlco_seq_arr"));
String send_plac_seq_arr = Util.checkString(req.getParameter("send_plac_seq_arr"));
String send_plac_nm_arr = Util.checkString(req.getParameter("send_plac_nm_arr"));
String magz_deal_yn_arr = Util.checkString(req.getParameter("magz_deal_yn_arr"));
String sep_book_deal_yn_arr = Util.checkString(req.getParameter("sep_book_deal_yn_arr"));
String vexc_dlco_cd_arr = Util.checkString(req.getParameter("vexc_dlco_cd_arr"));
String tel_no_arr = Util.checkString(req.getParameter("tel_no_arr"));
String fax_no_arr = Util.checkString(req.getParameter("fax_no_arr"));
String zip_1_arr = Util.checkString(req.getParameter("zip_1_arr"));
String zip_2_arr = Util.checkString(req.getParameter("zip_2_arr"));
String addr_arr = Util.checkString(req.getParameter("addr_arr"));
String dtls_addr_arr = Util.checkString(req.getParameter("dtls_addr_arr"));
String remk_arr = Util.checkString(req.getParameter("remk_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String mode_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_arr")));
String dlco_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_arr")));
String dlco_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq_arr")));
String send_plac_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq_arr")));
String send_plac_nm_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_nm_arr")));
String magz_deal_yn_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("magz_deal_yn_arr")));
String sep_book_deal_yn_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_book_deal_yn_arr")));
String vexc_dlco_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_dlco_cd_arr")));
String tel_no_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_arr")));
String fax_no_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no_arr")));
String zip_1_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1_arr")));
String zip_2_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2_arr")));
String addr_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_arr")));
String dtls_addr_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr_arr")));
String remk_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMode_arr(mode_arr);
dm.setDlco_cd_arr(dlco_cd_arr);
dm.setDlco_seq_arr(dlco_seq_arr);
dm.setSend_plac_seq_arr(send_plac_seq_arr);
dm.setSend_plac_nm_arr(send_plac_nm_arr);
dm.setMagz_deal_yn_arr(magz_deal_yn_arr);
dm.setSep_book_deal_yn_arr(sep_book_deal_yn_arr);
dm.setVexc_dlco_cd_arr(vexc_dlco_cd_arr);
dm.setTel_no_arr(tel_no_arr);
dm.setFax_no_arr(fax_no_arr);
dm.setZip_1_arr(zip_1_arr);
dm.setZip_2_arr(zip_2_arr);
dm.setAddr_arr(addr_arr);
dm.setDtls_addr_arr(dtls_addr_arr);
dm.setRemk_arr(remk_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 21:45:18 KST 2009 */