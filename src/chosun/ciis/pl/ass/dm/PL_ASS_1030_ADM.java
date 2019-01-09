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


package chosun.ciis.pl.ass.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.ass.ds.*;
import chosun.ciis.pl.ass.rec.*;

/**
 * 
 */


public class PL_ASS_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String medi_cd;
	public String medi_ser_no;
	public String ref_ser_no_1;
	public String ref_ser_no_2;
	public String basi_bgn_ser_no;
	public String basi_end_ser_no;
	public String prd;
	public String remk;
	public String mode_arr;
	public String dlco_cd_arr;
	public String dlco_seq_arr;
	public String send_plac_seq_arr;
	public String sale_clsf_arr;
	public String sendclsf_arr;
	public String sell_type_arr;
	public String wh_cd_arr;
	public String asin_qty_arr;
	public String dcrate_arr;
	public String calc_qty_arr;
	public String tot_deli_qty_arr;
	public String avg_deli_qty_arr;
	public String tot_sell_qty_arr;
	public String tot_rtgqty_arr;
	public String avg_sell_qty_arr;
	public String ocpy_rate_arr;
	public String ref_deli_qty_1_arr;
	public String ref_sell_qty_1_arr;
	public String ref_deli_qty_2_arr;
	public String ref_sell_qty_2_arr;
	public String appndx_1_arr;
	public String appndx_2_arr;
	public String appndx_3_arr;
	public String remk_arr;

	public PL_ASS_1030_ADM(){}
	public PL_ASS_1030_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String medi_cd, String medi_ser_no, String ref_ser_no_1, String ref_ser_no_2, String basi_bgn_ser_no, String basi_end_ser_no, String prd, String remk, String mode_arr, String dlco_cd_arr, String dlco_seq_arr, String send_plac_seq_arr, String sale_clsf_arr, String sendclsf_arr, String sell_type_arr, String wh_cd_arr, String asin_qty_arr, String dcrate_arr, String calc_qty_arr, String tot_deli_qty_arr, String avg_deli_qty_arr, String tot_sell_qty_arr, String tot_rtgqty_arr, String avg_sell_qty_arr, String ocpy_rate_arr, String ref_deli_qty_1_arr, String ref_sell_qty_1_arr, String ref_deli_qty_2_arr, String ref_sell_qty_2_arr, String appndx_1_arr, String appndx_2_arr, String appndx_3_arr, String remk_arr){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.medi_cd = medi_cd;
		this.medi_ser_no = medi_ser_no;
		this.ref_ser_no_1 = ref_ser_no_1;
		this.ref_ser_no_2 = ref_ser_no_2;
		this.basi_bgn_ser_no = basi_bgn_ser_no;
		this.basi_end_ser_no = basi_end_ser_no;
		this.prd = prd;
		this.remk = remk;
		this.mode_arr = mode_arr;
		this.dlco_cd_arr = dlco_cd_arr;
		this.dlco_seq_arr = dlco_seq_arr;
		this.send_plac_seq_arr = send_plac_seq_arr;
		this.sale_clsf_arr = sale_clsf_arr;
		this.sendclsf_arr = sendclsf_arr;
		this.sell_type_arr = sell_type_arr;
		this.wh_cd_arr = wh_cd_arr;
		this.asin_qty_arr = asin_qty_arr;
		this.dcrate_arr = dcrate_arr;
		this.calc_qty_arr = calc_qty_arr;
		this.tot_deli_qty_arr = tot_deli_qty_arr;
		this.avg_deli_qty_arr = avg_deli_qty_arr;
		this.tot_sell_qty_arr = tot_sell_qty_arr;
		this.tot_rtgqty_arr = tot_rtgqty_arr;
		this.avg_sell_qty_arr = avg_sell_qty_arr;
		this.ocpy_rate_arr = ocpy_rate_arr;
		this.ref_deli_qty_1_arr = ref_deli_qty_1_arr;
		this.ref_sell_qty_1_arr = ref_sell_qty_1_arr;
		this.ref_deli_qty_2_arr = ref_deli_qty_2_arr;
		this.ref_sell_qty_2_arr = ref_sell_qty_2_arr;
		this.appndx_1_arr = appndx_1_arr;
		this.appndx_2_arr = appndx_2_arr;
		this.appndx_3_arr = appndx_3_arr;
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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setRef_ser_no_1(String ref_ser_no_1){
		this.ref_ser_no_1 = ref_ser_no_1;
	}

	public void setRef_ser_no_2(String ref_ser_no_2){
		this.ref_ser_no_2 = ref_ser_no_2;
	}

	public void setBasi_bgn_ser_no(String basi_bgn_ser_no){
		this.basi_bgn_ser_no = basi_bgn_ser_no;
	}

	public void setBasi_end_ser_no(String basi_end_ser_no){
		this.basi_end_ser_no = basi_end_ser_no;
	}

	public void setPrd(String prd){
		this.prd = prd;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public void setSale_clsf_arr(String sale_clsf_arr){
		this.sale_clsf_arr = sale_clsf_arr;
	}

	public void setSendclsf_arr(String sendclsf_arr){
		this.sendclsf_arr = sendclsf_arr;
	}

	public void setSell_type_arr(String sell_type_arr){
		this.sell_type_arr = sell_type_arr;
	}

	public void setWh_cd_arr(String wh_cd_arr){
		this.wh_cd_arr = wh_cd_arr;
	}

	public void setAsin_qty_arr(String asin_qty_arr){
		this.asin_qty_arr = asin_qty_arr;
	}

	public void setDcrate_arr(String dcrate_arr){
		this.dcrate_arr = dcrate_arr;
	}

	public void setCalc_qty_arr(String calc_qty_arr){
		this.calc_qty_arr = calc_qty_arr;
	}

	public void setTot_deli_qty_arr(String tot_deli_qty_arr){
		this.tot_deli_qty_arr = tot_deli_qty_arr;
	}

	public void setAvg_deli_qty_arr(String avg_deli_qty_arr){
		this.avg_deli_qty_arr = avg_deli_qty_arr;
	}

	public void setTot_sell_qty_arr(String tot_sell_qty_arr){
		this.tot_sell_qty_arr = tot_sell_qty_arr;
	}

	public void setTot_rtgqty_arr(String tot_rtgqty_arr){
		this.tot_rtgqty_arr = tot_rtgqty_arr;
	}

	public void setAvg_sell_qty_arr(String avg_sell_qty_arr){
		this.avg_sell_qty_arr = avg_sell_qty_arr;
	}

	public void setOcpy_rate_arr(String ocpy_rate_arr){
		this.ocpy_rate_arr = ocpy_rate_arr;
	}

	public void setRef_deli_qty_1_arr(String ref_deli_qty_1_arr){
		this.ref_deli_qty_1_arr = ref_deli_qty_1_arr;
	}

	public void setRef_sell_qty_1_arr(String ref_sell_qty_1_arr){
		this.ref_sell_qty_1_arr = ref_sell_qty_1_arr;
	}

	public void setRef_deli_qty_2_arr(String ref_deli_qty_2_arr){
		this.ref_deli_qty_2_arr = ref_deli_qty_2_arr;
	}

	public void setRef_sell_qty_2_arr(String ref_sell_qty_2_arr){
		this.ref_sell_qty_2_arr = ref_sell_qty_2_arr;
	}

	public void setAppndx_1_arr(String appndx_1_arr){
		this.appndx_1_arr = appndx_1_arr;
	}

	public void setAppndx_2_arr(String appndx_2_arr){
		this.appndx_2_arr = appndx_2_arr;
	}

	public void setAppndx_3_arr(String appndx_3_arr){
		this.appndx_3_arr = appndx_3_arr;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getRef_ser_no_1(){
		return this.ref_ser_no_1;
	}

	public String getRef_ser_no_2(){
		return this.ref_ser_no_2;
	}

	public String getBasi_bgn_ser_no(){
		return this.basi_bgn_ser_no;
	}

	public String getBasi_end_ser_no(){
		return this.basi_end_ser_no;
	}

	public String getPrd(){
		return this.prd;
	}

	public String getRemk(){
		return this.remk;
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

	public String getSale_clsf_arr(){
		return this.sale_clsf_arr;
	}

	public String getSendclsf_arr(){
		return this.sendclsf_arr;
	}

	public String getSell_type_arr(){
		return this.sell_type_arr;
	}

	public String getWh_cd_arr(){
		return this.wh_cd_arr;
	}

	public String getAsin_qty_arr(){
		return this.asin_qty_arr;
	}

	public String getDcrate_arr(){
		return this.dcrate_arr;
	}

	public String getCalc_qty_arr(){
		return this.calc_qty_arr;
	}

	public String getTot_deli_qty_arr(){
		return this.tot_deli_qty_arr;
	}

	public String getAvg_deli_qty_arr(){
		return this.avg_deli_qty_arr;
	}

	public String getTot_sell_qty_arr(){
		return this.tot_sell_qty_arr;
	}

	public String getTot_rtgqty_arr(){
		return this.tot_rtgqty_arr;
	}

	public String getAvg_sell_qty_arr(){
		return this.avg_sell_qty_arr;
	}

	public String getOcpy_rate_arr(){
		return this.ocpy_rate_arr;
	}

	public String getRef_deli_qty_1_arr(){
		return this.ref_deli_qty_1_arr;
	}

	public String getRef_sell_qty_1_arr(){
		return this.ref_sell_qty_1_arr;
	}

	public String getRef_deli_qty_2_arr(){
		return this.ref_deli_qty_2_arr;
	}

	public String getRef_sell_qty_2_arr(){
		return this.ref_sell_qty_2_arr;
	}

	public String getAppndx_1_arr(){
		return this.appndx_1_arr;
	}

	public String getAppndx_2_arr(){
		return this.appndx_2_arr;
	}

	public String getAppndx_3_arr(){
		return this.appndx_3_arr;
	}

	public String getRemk_arr(){
		return this.remk_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_ASS_1030_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_ASS_1030_ADM dm = (PL_ASS_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.medi_ser_no);
		cstmt.setString(9, dm.ref_ser_no_1);
		cstmt.setString(10, dm.ref_ser_no_2);
		cstmt.setString(11, dm.basi_bgn_ser_no);
		cstmt.setString(12, dm.basi_end_ser_no);
		cstmt.setString(13, dm.prd);
		cstmt.setString(14, dm.remk);
		cstmt.setString(15, dm.mode_arr);
		cstmt.setString(16, dm.dlco_cd_arr);
		cstmt.setString(17, dm.dlco_seq_arr);
		cstmt.setString(18, dm.send_plac_seq_arr);
		cstmt.setString(19, dm.sale_clsf_arr);
		cstmt.setString(20, dm.sendclsf_arr);
		cstmt.setString(21, dm.sell_type_arr);
		cstmt.setString(22, dm.wh_cd_arr);
		cstmt.setString(23, dm.asin_qty_arr);
		cstmt.setString(24, dm.dcrate_arr);
		cstmt.setString(25, dm.calc_qty_arr);
		cstmt.setString(26, dm.tot_deli_qty_arr);
		cstmt.setString(27, dm.avg_deli_qty_arr);
		cstmt.setString(28, dm.tot_sell_qty_arr);
		cstmt.setString(29, dm.tot_rtgqty_arr);
		cstmt.setString(30, dm.avg_sell_qty_arr);
		cstmt.setString(31, dm.ocpy_rate_arr);
		cstmt.setString(32, dm.ref_deli_qty_1_arr);
		cstmt.setString(33, dm.ref_sell_qty_1_arr);
		cstmt.setString(34, dm.ref_deli_qty_2_arr);
		cstmt.setString(35, dm.ref_sell_qty_2_arr);
		cstmt.setString(36, dm.appndx_1_arr);
		cstmt.setString(37, dm.appndx_2_arr);
		cstmt.setString(38, dm.appndx_3_arr);
		cstmt.setString(39, dm.remk_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.ass.ds.PL_ASS_1030_ADataSet();
	}



    public void print(){
        System.out.println("acc_flag = " + getAcc_flag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("medi_ser_no = " + getMedi_ser_no());
        System.out.println("ref_ser_no_1 = " + getRef_ser_no_1());
        System.out.println("ref_ser_no_2 = " + getRef_ser_no_2());
        System.out.println("basi_bgn_ser_no = " + getBasi_bgn_ser_no());
        System.out.println("basi_end_ser_no = " + getBasi_end_ser_no());
        System.out.println("prd = " + getPrd());
        System.out.println("remk = " + getRemk());
        System.out.println("mode_arr = " + getMode_arr());
        System.out.println("dlco_cd_arr = " + getDlco_cd_arr());
        System.out.println("dlco_seq_arr = " + getDlco_seq_arr());
        System.out.println("send_plac_seq_arr = " + getSend_plac_seq_arr());
        System.out.println("sale_clsf_arr = " + getSale_clsf_arr());
        System.out.println("sendclsf_arr = " + getSendclsf_arr());
        System.out.println("sell_type_arr = " + getSell_type_arr());
        System.out.println("wh_cd_arr = " + getWh_cd_arr());
        System.out.println("asin_qty_arr = " + getAsin_qty_arr());
        System.out.println("dcrate_arr = " + getDcrate_arr());
        System.out.println("calc_qty_arr = " + getCalc_qty_arr());
        System.out.println("tot_deli_qty_arr = " + getTot_deli_qty_arr());
        System.out.println("avg_deli_qty_arr = " + getAvg_deli_qty_arr());
        System.out.println("tot_sell_qty_arr = " + getTot_sell_qty_arr());
        System.out.println("tot_rtgqty_arr = " + getTot_rtgqty_arr());
        System.out.println("avg_sell_qty_arr = " + getAvg_sell_qty_arr());
        System.out.println("ocpy_rate_arr = " + getOcpy_rate_arr());
        System.out.println("ref_deli_qty_1_arr = " + getRef_deli_qty_1_arr());
        System.out.println("ref_sell_qty_1_arr = " + getRef_sell_qty_1_arr());
        System.out.println("ref_deli_qty_2_arr = " + getRef_deli_qty_2_arr());
        System.out.println("ref_sell_qty_2_arr = " + getRef_sell_qty_2_arr());
        System.out.println("appndx_1_arr = " + getAppndx_1_arr());
        System.out.println("appndx_2_arr = " + getAppndx_2_arr());
        System.out.println("appndx_3_arr = " + getAppndx_3_arr());
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String medi_ser_no = req.getParameter("medi_ser_no");
if( medi_ser_no == null){
	System.out.println(this.toString+" : medi_ser_no is null" );
}else{
	System.out.println(this.toString+" : medi_ser_no is "+medi_ser_no );
}
String ref_ser_no_1 = req.getParameter("ref_ser_no_1");
if( ref_ser_no_1 == null){
	System.out.println(this.toString+" : ref_ser_no_1 is null" );
}else{
	System.out.println(this.toString+" : ref_ser_no_1 is "+ref_ser_no_1 );
}
String ref_ser_no_2 = req.getParameter("ref_ser_no_2");
if( ref_ser_no_2 == null){
	System.out.println(this.toString+" : ref_ser_no_2 is null" );
}else{
	System.out.println(this.toString+" : ref_ser_no_2 is "+ref_ser_no_2 );
}
String basi_bgn_ser_no = req.getParameter("basi_bgn_ser_no");
if( basi_bgn_ser_no == null){
	System.out.println(this.toString+" : basi_bgn_ser_no is null" );
}else{
	System.out.println(this.toString+" : basi_bgn_ser_no is "+basi_bgn_ser_no );
}
String basi_end_ser_no = req.getParameter("basi_end_ser_no");
if( basi_end_ser_no == null){
	System.out.println(this.toString+" : basi_end_ser_no is null" );
}else{
	System.out.println(this.toString+" : basi_end_ser_no is "+basi_end_ser_no );
}
String prd = req.getParameter("prd");
if( prd == null){
	System.out.println(this.toString+" : prd is null" );
}else{
	System.out.println(this.toString+" : prd is "+prd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String sale_clsf_arr = req.getParameter("sale_clsf_arr");
if( sale_clsf_arr == null){
	System.out.println(this.toString+" : sale_clsf_arr is null" );
}else{
	System.out.println(this.toString+" : sale_clsf_arr is "+sale_clsf_arr );
}
String sendclsf_arr = req.getParameter("sendclsf_arr");
if( sendclsf_arr == null){
	System.out.println(this.toString+" : sendclsf_arr is null" );
}else{
	System.out.println(this.toString+" : sendclsf_arr is "+sendclsf_arr );
}
String sell_type_arr = req.getParameter("sell_type_arr");
if( sell_type_arr == null){
	System.out.println(this.toString+" : sell_type_arr is null" );
}else{
	System.out.println(this.toString+" : sell_type_arr is "+sell_type_arr );
}
String wh_cd_arr = req.getParameter("wh_cd_arr");
if( wh_cd_arr == null){
	System.out.println(this.toString+" : wh_cd_arr is null" );
}else{
	System.out.println(this.toString+" : wh_cd_arr is "+wh_cd_arr );
}
String asin_qty_arr = req.getParameter("asin_qty_arr");
if( asin_qty_arr == null){
	System.out.println(this.toString+" : asin_qty_arr is null" );
}else{
	System.out.println(this.toString+" : asin_qty_arr is "+asin_qty_arr );
}
String dcrate_arr = req.getParameter("dcrate_arr");
if( dcrate_arr == null){
	System.out.println(this.toString+" : dcrate_arr is null" );
}else{
	System.out.println(this.toString+" : dcrate_arr is "+dcrate_arr );
}
String calc_qty_arr = req.getParameter("calc_qty_arr");
if( calc_qty_arr == null){
	System.out.println(this.toString+" : calc_qty_arr is null" );
}else{
	System.out.println(this.toString+" : calc_qty_arr is "+calc_qty_arr );
}
String tot_deli_qty_arr = req.getParameter("tot_deli_qty_arr");
if( tot_deli_qty_arr == null){
	System.out.println(this.toString+" : tot_deli_qty_arr is null" );
}else{
	System.out.println(this.toString+" : tot_deli_qty_arr is "+tot_deli_qty_arr );
}
String avg_deli_qty_arr = req.getParameter("avg_deli_qty_arr");
if( avg_deli_qty_arr == null){
	System.out.println(this.toString+" : avg_deli_qty_arr is null" );
}else{
	System.out.println(this.toString+" : avg_deli_qty_arr is "+avg_deli_qty_arr );
}
String tot_sell_qty_arr = req.getParameter("tot_sell_qty_arr");
if( tot_sell_qty_arr == null){
	System.out.println(this.toString+" : tot_sell_qty_arr is null" );
}else{
	System.out.println(this.toString+" : tot_sell_qty_arr is "+tot_sell_qty_arr );
}
String tot_rtgqty_arr = req.getParameter("tot_rtgqty_arr");
if( tot_rtgqty_arr == null){
	System.out.println(this.toString+" : tot_rtgqty_arr is null" );
}else{
	System.out.println(this.toString+" : tot_rtgqty_arr is "+tot_rtgqty_arr );
}
String avg_sell_qty_arr = req.getParameter("avg_sell_qty_arr");
if( avg_sell_qty_arr == null){
	System.out.println(this.toString+" : avg_sell_qty_arr is null" );
}else{
	System.out.println(this.toString+" : avg_sell_qty_arr is "+avg_sell_qty_arr );
}
String ocpy_rate_arr = req.getParameter("ocpy_rate_arr");
if( ocpy_rate_arr == null){
	System.out.println(this.toString+" : ocpy_rate_arr is null" );
}else{
	System.out.println(this.toString+" : ocpy_rate_arr is "+ocpy_rate_arr );
}
String ref_deli_qty_1_arr = req.getParameter("ref_deli_qty_1_arr");
if( ref_deli_qty_1_arr == null){
	System.out.println(this.toString+" : ref_deli_qty_1_arr is null" );
}else{
	System.out.println(this.toString+" : ref_deli_qty_1_arr is "+ref_deli_qty_1_arr );
}
String ref_sell_qty_1_arr = req.getParameter("ref_sell_qty_1_arr");
if( ref_sell_qty_1_arr == null){
	System.out.println(this.toString+" : ref_sell_qty_1_arr is null" );
}else{
	System.out.println(this.toString+" : ref_sell_qty_1_arr is "+ref_sell_qty_1_arr );
}
String ref_deli_qty_2_arr = req.getParameter("ref_deli_qty_2_arr");
if( ref_deli_qty_2_arr == null){
	System.out.println(this.toString+" : ref_deli_qty_2_arr is null" );
}else{
	System.out.println(this.toString+" : ref_deli_qty_2_arr is "+ref_deli_qty_2_arr );
}
String ref_sell_qty_2_arr = req.getParameter("ref_sell_qty_2_arr");
if( ref_sell_qty_2_arr == null){
	System.out.println(this.toString+" : ref_sell_qty_2_arr is null" );
}else{
	System.out.println(this.toString+" : ref_sell_qty_2_arr is "+ref_sell_qty_2_arr );
}
String appndx_1_arr = req.getParameter("appndx_1_arr");
if( appndx_1_arr == null){
	System.out.println(this.toString+" : appndx_1_arr is null" );
}else{
	System.out.println(this.toString+" : appndx_1_arr is "+appndx_1_arr );
}
String appndx_2_arr = req.getParameter("appndx_2_arr");
if( appndx_2_arr == null){
	System.out.println(this.toString+" : appndx_2_arr is null" );
}else{
	System.out.println(this.toString+" : appndx_2_arr is "+appndx_2_arr );
}
String appndx_3_arr = req.getParameter("appndx_3_arr");
if( appndx_3_arr == null){
	System.out.println(this.toString+" : appndx_3_arr is null" );
}else{
	System.out.println(this.toString+" : appndx_3_arr is "+appndx_3_arr );
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
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
String ref_ser_no_1 = Util.checkString(req.getParameter("ref_ser_no_1"));
String ref_ser_no_2 = Util.checkString(req.getParameter("ref_ser_no_2"));
String basi_bgn_ser_no = Util.checkString(req.getParameter("basi_bgn_ser_no"));
String basi_end_ser_no = Util.checkString(req.getParameter("basi_end_ser_no"));
String prd = Util.checkString(req.getParameter("prd"));
String remk = Util.checkString(req.getParameter("remk"));
String mode_arr = Util.checkString(req.getParameter("mode_arr"));
String dlco_cd_arr = Util.checkString(req.getParameter("dlco_cd_arr"));
String dlco_seq_arr = Util.checkString(req.getParameter("dlco_seq_arr"));
String send_plac_seq_arr = Util.checkString(req.getParameter("send_plac_seq_arr"));
String sale_clsf_arr = Util.checkString(req.getParameter("sale_clsf_arr"));
String sendclsf_arr = Util.checkString(req.getParameter("sendclsf_arr"));
String sell_type_arr = Util.checkString(req.getParameter("sell_type_arr"));
String wh_cd_arr = Util.checkString(req.getParameter("wh_cd_arr"));
String asin_qty_arr = Util.checkString(req.getParameter("asin_qty_arr"));
String dcrate_arr = Util.checkString(req.getParameter("dcrate_arr"));
String calc_qty_arr = Util.checkString(req.getParameter("calc_qty_arr"));
String tot_deli_qty_arr = Util.checkString(req.getParameter("tot_deli_qty_arr"));
String avg_deli_qty_arr = Util.checkString(req.getParameter("avg_deli_qty_arr"));
String tot_sell_qty_arr = Util.checkString(req.getParameter("tot_sell_qty_arr"));
String tot_rtgqty_arr = Util.checkString(req.getParameter("tot_rtgqty_arr"));
String avg_sell_qty_arr = Util.checkString(req.getParameter("avg_sell_qty_arr"));
String ocpy_rate_arr = Util.checkString(req.getParameter("ocpy_rate_arr"));
String ref_deli_qty_1_arr = Util.checkString(req.getParameter("ref_deli_qty_1_arr"));
String ref_sell_qty_1_arr = Util.checkString(req.getParameter("ref_sell_qty_1_arr"));
String ref_deli_qty_2_arr = Util.checkString(req.getParameter("ref_deli_qty_2_arr"));
String ref_sell_qty_2_arr = Util.checkString(req.getParameter("ref_sell_qty_2_arr"));
String appndx_1_arr = Util.checkString(req.getParameter("appndx_1_arr"));
String appndx_2_arr = Util.checkString(req.getParameter("appndx_2_arr"));
String appndx_3_arr = Util.checkString(req.getParameter("appndx_3_arr"));
String remk_arr = Util.checkString(req.getParameter("remk_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));
String ref_ser_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_ser_no_1")));
String ref_ser_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_ser_no_2")));
String basi_bgn_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_bgn_ser_no")));
String basi_end_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_end_ser_no")));
String prd = Util.Uni2Ksc(Util.checkString(req.getParameter("prd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String mode_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_arr")));
String dlco_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_arr")));
String dlco_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq_arr")));
String send_plac_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq_arr")));
String sale_clsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf_arr")));
String sendclsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("sendclsf_arr")));
String sell_type_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_type_arr")));
String wh_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd_arr")));
String asin_qty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("asin_qty_arr")));
String dcrate_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate_arr")));
String calc_qty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("calc_qty_arr")));
String tot_deli_qty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_deli_qty_arr")));
String avg_deli_qty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("avg_deli_qty_arr")));
String tot_sell_qty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_sell_qty_arr")));
String tot_rtgqty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_rtgqty_arr")));
String avg_sell_qty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("avg_sell_qty_arr")));
String ocpy_rate_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("ocpy_rate_arr")));
String ref_deli_qty_1_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_deli_qty_1_arr")));
String ref_sell_qty_1_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_sell_qty_1_arr")));
String ref_deli_qty_2_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_deli_qty_2_arr")));
String ref_sell_qty_2_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_sell_qty_2_arr")));
String appndx_1_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("appndx_1_arr")));
String appndx_2_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("appndx_2_arr")));
String appndx_3_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("appndx_3_arr")));
String remk_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMedi_cd(medi_cd);
dm.setMedi_ser_no(medi_ser_no);
dm.setRef_ser_no_1(ref_ser_no_1);
dm.setRef_ser_no_2(ref_ser_no_2);
dm.setBasi_bgn_ser_no(basi_bgn_ser_no);
dm.setBasi_end_ser_no(basi_end_ser_no);
dm.setPrd(prd);
dm.setRemk(remk);
dm.setMode_arr(mode_arr);
dm.setDlco_cd_arr(dlco_cd_arr);
dm.setDlco_seq_arr(dlco_seq_arr);
dm.setSend_plac_seq_arr(send_plac_seq_arr);
dm.setSale_clsf_arr(sale_clsf_arr);
dm.setSendclsf_arr(sendclsf_arr);
dm.setSell_type_arr(sell_type_arr);
dm.setWh_cd_arr(wh_cd_arr);
dm.setAsin_qty_arr(asin_qty_arr);
dm.setDcrate_arr(dcrate_arr);
dm.setCalc_qty_arr(calc_qty_arr);
dm.setTot_deli_qty_arr(tot_deli_qty_arr);
dm.setAvg_deli_qty_arr(avg_deli_qty_arr);
dm.setTot_sell_qty_arr(tot_sell_qty_arr);
dm.setTot_rtgqty_arr(tot_rtgqty_arr);
dm.setAvg_sell_qty_arr(avg_sell_qty_arr);
dm.setOcpy_rate_arr(ocpy_rate_arr);
dm.setRef_deli_qty_1_arr(ref_deli_qty_1_arr);
dm.setRef_sell_qty_1_arr(ref_sell_qty_1_arr);
dm.setRef_deli_qty_2_arr(ref_deli_qty_2_arr);
dm.setRef_sell_qty_2_arr(ref_sell_qty_2_arr);
dm.setAppndx_1_arr(appndx_1_arr);
dm.setAppndx_2_arr(appndx_2_arr);
dm.setAppndx_3_arr(appndx_3_arr);
dm.setRemk_arr(remk_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 20:13:04 KST 2009 */