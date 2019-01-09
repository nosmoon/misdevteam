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


package chosun.ciis.as.artmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.artmgr.ds.*;
import chosun.ciis.as.artmgr.rec.*;

/**
 * 
 */


public class AS_ARTMGR_1003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String art_prod_nm;
	public String art_prod_no;
	public String author;
	public String art_prod_size;
	public String fram_size;
	public String fram_yn;
	public String make_yymm;
	public String get_dt;
	public String get_resn;
	public String ap_amt;
	public String aset_no;
	public String dlco_nm;
	public String dlco_tel;
	public String keep_plac;
	public String keep_dt;
	public String art_prod_evlu;
	public String last_chk_dt;
	public String art_prod_remk;
	public String remk;
	public String dnt_clsf;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String file_size;
	public byte[] up_phot_img;
	public String mode_tm;
	public String chg_dt;
	public String chg_remk;
	public String art_prod_seq;

	public AS_ARTMGR_1003_ADM(){}
	public AS_ARTMGR_1003_ADM(String mode, String cmpy_cd, String art_prod_nm, String art_prod_no, String author, String art_prod_size, String fram_size, String fram_yn, String make_yymm, String get_dt, String get_resn, String ap_amt, String aset_no, String dlco_nm, String dlco_tel, String keep_plac, String keep_dt, String art_prod_evlu, String last_chk_dt, String art_prod_remk, String remk, String dnt_clsf, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String file_size, byte[] up_phot_img, String mode_tm, String chg_dt, String chg_remk, String art_prod_seq){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.art_prod_nm = art_prod_nm;
		this.art_prod_no = art_prod_no;
		this.author = author;
		this.art_prod_size = art_prod_size;
		this.fram_size = fram_size;
		this.fram_yn = fram_yn;
		this.make_yymm = make_yymm;
		this.get_dt = get_dt;
		this.get_resn = get_resn;
		this.ap_amt = ap_amt;
		this.aset_no = aset_no;
		this.dlco_nm = dlco_nm;
		this.dlco_tel = dlco_tel;
		this.keep_plac = keep_plac;
		this.keep_dt = keep_dt;
		this.art_prod_evlu = art_prod_evlu;
		this.last_chk_dt = last_chk_dt;
		this.art_prod_remk = art_prod_remk;
		this.remk = remk;
		this.dnt_clsf = dnt_clsf;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.file_size = file_size;
		this.up_phot_img = up_phot_img;
		this.mode_tm = mode_tm;
		this.chg_dt = chg_dt;
		this.chg_remk = chg_remk;
		this.art_prod_seq = art_prod_seq;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setArt_prod_nm(String art_prod_nm){
		this.art_prod_nm = art_prod_nm;
	}

	public void setArt_prod_no(String art_prod_no){
		this.art_prod_no = art_prod_no;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setArt_prod_size(String art_prod_size){
		this.art_prod_size = art_prod_size;
	}

	public void setFram_size(String fram_size){
		this.fram_size = fram_size;
	}

	public void setFram_yn(String fram_yn){
		this.fram_yn = fram_yn;
	}

	public void setMake_yymm(String make_yymm){
		this.make_yymm = make_yymm;
	}

	public void setGet_dt(String get_dt){
		this.get_dt = get_dt;
	}

	public void setGet_resn(String get_resn){
		this.get_resn = get_resn;
	}

	public void setAp_amt(String ap_amt){
		this.ap_amt = ap_amt;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_tel(String dlco_tel){
		this.dlco_tel = dlco_tel;
	}

	public void setKeep_plac(String keep_plac){
		this.keep_plac = keep_plac;
	}

	public void setKeep_dt(String keep_dt){
		this.keep_dt = keep_dt;
	}

	public void setArt_prod_evlu(String art_prod_evlu){
		this.art_prod_evlu = art_prod_evlu;
	}

	public void setLast_chk_dt(String last_chk_dt){
		this.last_chk_dt = last_chk_dt;
	}

	public void setArt_prod_remk(String art_prod_remk){
		this.art_prod_remk = art_prod_remk;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDnt_clsf(String dnt_clsf){
		this.dnt_clsf = dnt_clsf;
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

	public void setFile_size(String file_size){
		this.file_size = file_size;
	}

	public void setUp_phot_img(byte[] up_phot_img){
		this.up_phot_img = up_phot_img;
	}

	public void setMode_tm(String mode_tm){
		this.mode_tm = mode_tm;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setChg_remk(String chg_remk){
		this.chg_remk = chg_remk;
	}

	public void setArt_prod_seq(String art_prod_seq){
		this.art_prod_seq = art_prod_seq;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getArt_prod_nm(){
		return this.art_prod_nm;
	}

	public String getArt_prod_no(){
		return this.art_prod_no;
	}

	public String getAuthor(){
		return this.author;
	}

	public String getArt_prod_size(){
		return this.art_prod_size;
	}

	public String getFram_size(){
		return this.fram_size;
	}

	public String getFram_yn(){
		return this.fram_yn;
	}

	public String getMake_yymm(){
		return this.make_yymm;
	}

	public String getGet_dt(){
		return this.get_dt;
	}

	public String getGet_resn(){
		return this.get_resn;
	}

	public String getAp_amt(){
		return this.ap_amt;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_tel(){
		return this.dlco_tel;
	}

	public String getKeep_plac(){
		return this.keep_plac;
	}

	public String getKeep_dt(){
		return this.keep_dt;
	}

	public String getArt_prod_evlu(){
		return this.art_prod_evlu;
	}

	public String getLast_chk_dt(){
		return this.last_chk_dt;
	}

	public String getArt_prod_remk(){
		return this.art_prod_remk;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDnt_clsf(){
		return this.dnt_clsf;
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

	public String getMode_tm(){
		return this.mode_tm;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getChg_remk(){
		return this.chg_remk;
	}

	public String getArt_prod_seq(){
		return this.art_prod_seq;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ARTMGR_1003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ARTMGR_1003_ADM dm = (AS_ARTMGR_1003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.art_prod_nm);
		cstmt.setString(6, dm.art_prod_no);
		cstmt.setString(7, dm.author);
		cstmt.setString(8, dm.art_prod_size);
		cstmt.setString(9, dm.fram_size);
		cstmt.setString(10, dm.fram_yn);
		cstmt.setString(11, dm.make_yymm);
		cstmt.setString(12, dm.get_dt);
		cstmt.setString(13, dm.get_resn);
		cstmt.setString(14, dm.ap_amt);
		cstmt.setString(15, dm.aset_no);
		cstmt.setString(16, dm.dlco_nm);
		cstmt.setString(17, dm.dlco_tel);
		cstmt.setString(18, dm.keep_plac);
		cstmt.setString(19, dm.keep_dt);
		cstmt.setString(20, dm.art_prod_evlu);
		cstmt.setString(21, dm.last_chk_dt);
		cstmt.setString(22, dm.art_prod_remk);
		cstmt.setString(23, dm.remk);
		cstmt.setString(24, dm.dnt_clsf);
		cstmt.setString(25, dm.incmg_pers_ipadd);
		cstmt.setString(26, dm.incmg_pers);
		cstmt.setString(27, dm.chg_pers);
		cstmt.setString(28, dm.file_size);
		cstmt.setBytes(29, dm.up_phot_img);
		cstmt.setString(30, dm.mode_tm);
		cstmt.setString(31, dm.chg_dt);
		cstmt.setString(32, dm.chg_remk);
		cstmt.setString(33, dm.art_prod_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.artmgr.ds.AS_ARTMGR_1003_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("art_prod_nm = " + getArt_prod_nm());
        System.out.println("art_prod_no = " + getArt_prod_no());
        System.out.println("author = " + getAuthor());
        System.out.println("art_prod_size = " + getArt_prod_size());
        System.out.println("fram_size = " + getFram_size());
        System.out.println("fram_yn = " + getFram_yn());
        System.out.println("make_yymm = " + getMake_yymm());
        System.out.println("get_dt = " + getGet_dt());
        System.out.println("get_resn = " + getGet_resn());
        System.out.println("ap_amt = " + getAp_amt());
        System.out.println("aset_no = " + getAset_no());
        System.out.println("dlco_nm = " + getDlco_nm());
        System.out.println("dlco_tel = " + getDlco_tel());
        System.out.println("keep_plac = " + getKeep_plac());
        System.out.println("keep_dt = " + getKeep_dt());
        System.out.println("art_prod_evlu = " + getArt_prod_evlu());
        System.out.println("last_chk_dt = " + getLast_chk_dt());
        System.out.println("art_prod_remk = " + getArt_prod_remk());
        System.out.println("remk = " + getRemk());
        System.out.println("dnt_clsf = " + getDnt_clsf());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("file_size = " + getFile_size());
        System.out.println("up_phot_img = " + getUp_phot_img());
        System.out.println("mode_tm = " + getMode_tm());
        System.out.println("chg_dt = " + getChg_dt());
        System.out.println("chg_remk = " + getChg_remk());
        System.out.println("art_prod_seq = " + getArt_prod_seq());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String art_prod_nm = req.getParameter("art_prod_nm");
if( art_prod_nm == null){
	System.out.println(this.toString+" : art_prod_nm is null" );
}else{
	System.out.println(this.toString+" : art_prod_nm is "+art_prod_nm );
}
String art_prod_no = req.getParameter("art_prod_no");
if( art_prod_no == null){
	System.out.println(this.toString+" : art_prod_no is null" );
}else{
	System.out.println(this.toString+" : art_prod_no is "+art_prod_no );
}
String author = req.getParameter("author");
if( author == null){
	System.out.println(this.toString+" : author is null" );
}else{
	System.out.println(this.toString+" : author is "+author );
}
String art_prod_size = req.getParameter("art_prod_size");
if( art_prod_size == null){
	System.out.println(this.toString+" : art_prod_size is null" );
}else{
	System.out.println(this.toString+" : art_prod_size is "+art_prod_size );
}
String fram_size = req.getParameter("fram_size");
if( fram_size == null){
	System.out.println(this.toString+" : fram_size is null" );
}else{
	System.out.println(this.toString+" : fram_size is "+fram_size );
}
String fram_yn = req.getParameter("fram_yn");
if( fram_yn == null){
	System.out.println(this.toString+" : fram_yn is null" );
}else{
	System.out.println(this.toString+" : fram_yn is "+fram_yn );
}
String make_yymm = req.getParameter("make_yymm");
if( make_yymm == null){
	System.out.println(this.toString+" : make_yymm is null" );
}else{
	System.out.println(this.toString+" : make_yymm is "+make_yymm );
}
String get_dt = req.getParameter("get_dt");
if( get_dt == null){
	System.out.println(this.toString+" : get_dt is null" );
}else{
	System.out.println(this.toString+" : get_dt is "+get_dt );
}
String get_resn = req.getParameter("get_resn");
if( get_resn == null){
	System.out.println(this.toString+" : get_resn is null" );
}else{
	System.out.println(this.toString+" : get_resn is "+get_resn );
}
String ap_amt = req.getParameter("ap_amt");
if( ap_amt == null){
	System.out.println(this.toString+" : ap_amt is null" );
}else{
	System.out.println(this.toString+" : ap_amt is "+ap_amt );
}
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String dlco_tel = req.getParameter("dlco_tel");
if( dlco_tel == null){
	System.out.println(this.toString+" : dlco_tel is null" );
}else{
	System.out.println(this.toString+" : dlco_tel is "+dlco_tel );
}
String keep_plac = req.getParameter("keep_plac");
if( keep_plac == null){
	System.out.println(this.toString+" : keep_plac is null" );
}else{
	System.out.println(this.toString+" : keep_plac is "+keep_plac );
}
String keep_dt = req.getParameter("keep_dt");
if( keep_dt == null){
	System.out.println(this.toString+" : keep_dt is null" );
}else{
	System.out.println(this.toString+" : keep_dt is "+keep_dt );
}
String art_prod_evlu = req.getParameter("art_prod_evlu");
if( art_prod_evlu == null){
	System.out.println(this.toString+" : art_prod_evlu is null" );
}else{
	System.out.println(this.toString+" : art_prod_evlu is "+art_prod_evlu );
}
String last_chk_dt = req.getParameter("last_chk_dt");
if( last_chk_dt == null){
	System.out.println(this.toString+" : last_chk_dt is null" );
}else{
	System.out.println(this.toString+" : last_chk_dt is "+last_chk_dt );
}
String art_prod_remk = req.getParameter("art_prod_remk");
if( art_prod_remk == null){
	System.out.println(this.toString+" : art_prod_remk is null" );
}else{
	System.out.println(this.toString+" : art_prod_remk is "+art_prod_remk );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String dnt_clsf = req.getParameter("dnt_clsf");
if( dnt_clsf == null){
	System.out.println(this.toString+" : dnt_clsf is null" );
}else{
	System.out.println(this.toString+" : dnt_clsf is "+dnt_clsf );
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
String file_size = req.getParameter("file_size");
if( file_size == null){
	System.out.println(this.toString+" : file_size is null" );
}else{
	System.out.println(this.toString+" : file_size is "+file_size );
}
String up_phot_img = req.getParameter("up_phot_img");
if( up_phot_img == null){
	System.out.println(this.toString+" : up_phot_img is null" );
}else{
	System.out.println(this.toString+" : up_phot_img is "+up_phot_img );
}
String mode_tm = req.getParameter("mode_tm");
if( mode_tm == null){
	System.out.println(this.toString+" : mode_tm is null" );
}else{
	System.out.println(this.toString+" : mode_tm is "+mode_tm );
}
String chg_dt = req.getParameter("chg_dt");
if( chg_dt == null){
	System.out.println(this.toString+" : chg_dt is null" );
}else{
	System.out.println(this.toString+" : chg_dt is "+chg_dt );
}
String chg_remk = req.getParameter("chg_remk");
if( chg_remk == null){
	System.out.println(this.toString+" : chg_remk is null" );
}else{
	System.out.println(this.toString+" : chg_remk is "+chg_remk );
}
String art_prod_seq = req.getParameter("art_prod_seq");
if( art_prod_seq == null){
	System.out.println(this.toString+" : art_prod_seq is null" );
}else{
	System.out.println(this.toString+" : art_prod_seq is "+art_prod_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String art_prod_nm = Util.checkString(req.getParameter("art_prod_nm"));
String art_prod_no = Util.checkString(req.getParameter("art_prod_no"));
String author = Util.checkString(req.getParameter("author"));
String art_prod_size = Util.checkString(req.getParameter("art_prod_size"));
String fram_size = Util.checkString(req.getParameter("fram_size"));
String fram_yn = Util.checkString(req.getParameter("fram_yn"));
String make_yymm = Util.checkString(req.getParameter("make_yymm"));
String get_dt = Util.checkString(req.getParameter("get_dt"));
String get_resn = Util.checkString(req.getParameter("get_resn"));
String ap_amt = Util.checkString(req.getParameter("ap_amt"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String dlco_tel = Util.checkString(req.getParameter("dlco_tel"));
String keep_plac = Util.checkString(req.getParameter("keep_plac"));
String keep_dt = Util.checkString(req.getParameter("keep_dt"));
String art_prod_evlu = Util.checkString(req.getParameter("art_prod_evlu"));
String last_chk_dt = Util.checkString(req.getParameter("last_chk_dt"));
String art_prod_remk = Util.checkString(req.getParameter("art_prod_remk"));
String remk = Util.checkString(req.getParameter("remk"));
String dnt_clsf = Util.checkString(req.getParameter("dnt_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String file_size = Util.checkString(req.getParameter("file_size"));
String up_phot_img = Util.checkString(req.getParameter("up_phot_img"));
String mode_tm = Util.checkString(req.getParameter("mode_tm"));
String chg_dt = Util.checkString(req.getParameter("chg_dt"));
String chg_remk = Util.checkString(req.getParameter("chg_remk"));
String art_prod_seq = Util.checkString(req.getParameter("art_prod_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String art_prod_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("art_prod_nm")));
String art_prod_no = Util.Uni2Ksc(Util.checkString(req.getParameter("art_prod_no")));
String author = Util.Uni2Ksc(Util.checkString(req.getParameter("author")));
String art_prod_size = Util.Uni2Ksc(Util.checkString(req.getParameter("art_prod_size")));
String fram_size = Util.Uni2Ksc(Util.checkString(req.getParameter("fram_size")));
String fram_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fram_yn")));
String make_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("make_yymm")));
String get_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("get_dt")));
String get_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("get_resn")));
String ap_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ap_amt")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String dlco_tel = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_tel")));
String keep_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("keep_plac")));
String keep_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("keep_dt")));
String art_prod_evlu = Util.Uni2Ksc(Util.checkString(req.getParameter("art_prod_evlu")));
String last_chk_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_chk_dt")));
String art_prod_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("art_prod_remk")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String dnt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dnt_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String file_size = Util.Uni2Ksc(Util.checkString(req.getParameter("file_size")));
String up_phot_img = Util.Uni2Ksc(Util.checkString(req.getParameter("up_phot_img")));
String mode_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_tm")));
String chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt")));
String chg_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_remk")));
String art_prod_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("art_prod_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setArt_prod_nm(art_prod_nm);
dm.setArt_prod_no(art_prod_no);
dm.setAuthor(author);
dm.setArt_prod_size(art_prod_size);
dm.setFram_size(fram_size);
dm.setFram_yn(fram_yn);
dm.setMake_yymm(make_yymm);
dm.setGet_dt(get_dt);
dm.setGet_resn(get_resn);
dm.setAp_amt(ap_amt);
dm.setAset_no(aset_no);
dm.setDlco_nm(dlco_nm);
dm.setDlco_tel(dlco_tel);
dm.setKeep_plac(keep_plac);
dm.setKeep_dt(keep_dt);
dm.setArt_prod_evlu(art_prod_evlu);
dm.setLast_chk_dt(last_chk_dt);
dm.setArt_prod_remk(art_prod_remk);
dm.setRemk(remk);
dm.setDnt_clsf(dnt_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFile_size(file_size);
dm.setUp_phot_img(up_phot_img);
dm.setMode_tm(mode_tm);
dm.setChg_dt(chg_dt);
dm.setChg_remk(chg_remk);
dm.setArt_prod_seq(art_prod_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 23 15:58:43 KST 2009 */