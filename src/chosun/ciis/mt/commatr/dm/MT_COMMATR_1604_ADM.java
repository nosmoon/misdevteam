/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

import chosun.ciis.co.base.util.Base64Util;
import chosun.ciis.co.base.util.StreamUtil;
/**
 * 
 */


public class MT_COMMATR_1604_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String part_cd;
	public String file_size;
	public byte[] up_phot_img;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public MT_COMMATR_1604_ADM(){}
	public MT_COMMATR_1604_ADM(String gubun, String cmpy_cd, String part_cd, String file_size, byte[] up_phot_img, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.part_cd = part_cd;
		this.file_size = file_size;
		this.up_phot_img = up_phot_img;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setFile_size(String file_size){
		this.file_size = file_size;
	}
	
	public void setUp_phot_img(byte[] up_phot_img){
		this.up_phot_img = up_phot_img;
	}
	
	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getFile_size(){
		return this.file_size;
	}

	public byte[] getUp_phot_img(){
		return this.up_phot_img;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_1604_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_1604_ADM dm = (MT_COMMATR_1604_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.part_cd);
		cstmt.setString(6, dm.file_size);
		cstmt.setBytes(7, dm.getUp_phot_img());
		cstmt.setString(8, dm.incmg_pers_ipadd);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_1604_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("file_size = [" + getFile_size() + "]");
        System.out.println("phot_img = " + getUp_phot_img());
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String part_nm = req.getParameter("part_nm");
if( part_nm == null){
	System.out.println(this.toString+" : part_nm is null" );
}else{
	System.out.println(this.toString+" : part_nm is "+part_nm );
}
String part_dtl_nm = req.getParameter("part_dtl_nm");
if( part_dtl_nm == null){
	System.out.println(this.toString+" : part_dtl_nm is null" );
}else{
	System.out.println(this.toString+" : part_dtl_nm is "+part_dtl_nm );
}
String part_clas1 = req.getParameter("part_clas1");
if( part_clas1 == null){
	System.out.println(this.toString+" : part_clas1 is null" );
}else{
	System.out.println(this.toString+" : part_clas1 is "+part_clas1 );
}
String part_clas2 = req.getParameter("part_clas2");
if( part_clas2 == null){
	System.out.println(this.toString+" : part_clas2 is null" );
}else{
	System.out.println(this.toString+" : part_clas2 is "+part_clas2 );
}
String purc_uprc = req.getParameter("purc_uprc");
if( purc_uprc == null){
	System.out.println(this.toString+" : purc_uprc is null" );
}else{
	System.out.println(this.toString+" : purc_uprc is "+purc_uprc );
}
String std_modl = req.getParameter("std_modl");
if( std_modl == null){
	System.out.println(this.toString+" : std_modl is null" );
}else{
	System.out.println(this.toString+" : std_modl is "+std_modl );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String prt_seq = req.getParameter("prt_seq");
if( prt_seq == null){
	System.out.println(this.toString+" : prt_seq is null" );
}else{
	System.out.println(this.toString+" : prt_seq is "+prt_seq );
}
String usag = req.getParameter("usag");
if( usag == null){
	System.out.println(this.toString+" : usag is null" );
}else{
	System.out.println(this.toString+" : usag is "+usag );
}
String purc_info = req.getParameter("purc_info");
if( purc_info == null){
	System.out.println(this.toString+" : purc_info is null" );
}else{
	System.out.println(this.toString+" : purc_info is "+purc_info );
}
String barcode = req.getParameter("barcode");
if( barcode == null){
	System.out.println(this.toString+" : barcode is null" );
}else{
	System.out.println(this.toString+" : barcode is "+barcode );
}
String maker = req.getParameter("maker");
if( maker == null){
	System.out.println(this.toString+" : maker is null" );
}else{
	System.out.println(this.toString+" : maker is "+maker );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String stok_10 = req.getParameter("stok_10");
if( stok_10 == null){
	System.out.println(this.toString+" : stok_10 is null" );
}else{
	System.out.println(this.toString+" : stok_10 is "+stok_10 );
}
String stok_22 = req.getParameter("stok_22");
if( stok_22 == null){
	System.out.println(this.toString+" : stok_22 is null" );
}else{
	System.out.println(this.toString+" : stok_22 is "+stok_22 );
}
String stok_25 = req.getParameter("stok_25");
if( stok_25 == null){
	System.out.println(this.toString+" : stok_25 is null" );
}else{
	System.out.println(this.toString+" : stok_25 is "+stok_25 );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String part_nm = Util.checkString(req.getParameter("part_nm"));
String part_dtl_nm = Util.checkString(req.getParameter("part_dtl_nm"));
String part_clas1 = Util.checkString(req.getParameter("part_clas1"));
String part_clas2 = Util.checkString(req.getParameter("part_clas2"));
String purc_uprc = Util.checkString(req.getParameter("purc_uprc"));
String std_modl = Util.checkString(req.getParameter("std_modl"));
String unit = Util.checkString(req.getParameter("unit"));
String prt_seq = Util.checkString(req.getParameter("prt_seq"));
String usag = Util.checkString(req.getParameter("usag"));
String purc_info = Util.checkString(req.getParameter("purc_info"));
String barcode = Util.checkString(req.getParameter("barcode"));
String maker = Util.checkString(req.getParameter("maker"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String mode = Util.checkString(req.getParameter("mode"));
String stok_10 = Util.checkString(req.getParameter("stok_10"));
String stok_22 = Util.checkString(req.getParameter("stok_22"));
String stok_25 = Util.checkString(req.getParameter("stok_25"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String part_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("part_nm")));
String part_dtl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("part_dtl_nm")));
String part_clas1 = Util.Uni2Ksc(Util.checkString(req.getParameter("part_clas1")));
String part_clas2 = Util.Uni2Ksc(Util.checkString(req.getParameter("part_clas2")));
String purc_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_uprc")));
String std_modl = Util.Uni2Ksc(Util.checkString(req.getParameter("std_modl")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String prt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_seq")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
String purc_info = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_info")));
String barcode = Util.Uni2Ksc(Util.checkString(req.getParameter("barcode")));
String maker = Util.Uni2Ksc(Util.checkString(req.getParameter("maker")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String stok_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("stok_10")));
String stok_22 = Util.Uni2Ksc(Util.checkString(req.getParameter("stok_22")));
String stok_25 = Util.Uni2Ksc(Util.checkString(req.getParameter("stok_25")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setPart_cd(part_cd);
dm.setPart_nm(part_nm);
dm.setPart_dtl_nm(part_dtl_nm);
dm.setPart_clas1(part_clas1);
dm.setPart_clas2(part_clas2);
dm.setPurc_uprc(purc_uprc);
dm.setStd_modl(std_modl);
dm.setUnit(unit);
dm.setPrt_seq(prt_seq);
dm.setUsag(usag);
dm.setPurc_info(purc_info);
dm.setBarcode(barcode);
dm.setMaker(maker);
dm.setUse_yn(use_yn);
dm.setMode(mode);
dm.setStok_10(stok_10);
dm.setStok_22(stok_22);
dm.setStok_25(stok_25);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 03 17:02:20 KST 2015 */