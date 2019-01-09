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


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1152_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_idx;
	public String excl_type;
	public String title;
	public String flag;
	public String excl_pmnt_idx;
	public String excl_pmnt_dtl_idx;
	public String add_file_nm;
	public String add_file_size;
	public byte[] add_file;
	public String mode;
	public String row_num;
	public String input_type;
	public String memb_cd;
	public String name;
	public String memb_type;
	public String memb_ctgr_cd;
	public String ern;
	public String prsd_nm;
	public String cell_no;
	public String phone;
	public String zip_cd;
	public String addr;
	public String memb_memo;
	public String prms_dt;
	public String prms_amt;
	public String use_orign;
	public String fund_idx;
	public String suprt_idx;
	public String paymth_cd;
	public String cms_ownr_yn;
	public String cms_bank_cd;
	public String cms_acct_no;
	public String cms_ownr_nm;
	public String cms_ern;
	public String card_cmpy;
	public String card_num;
	public String card_yymm;
	public String card_idntt;
	public String card_owner;
	public String mobl_aprv_nm;
	public String mobl_aprv_cmpy;
	public String mobl_aprv_num;
	public String mobl_aprv_prn;
	public String prttn_type;
	public String mon_pay_dt;
	public String mon_pay_amt;
	public String pay_frdt;
	public String prttn_cnt;
	public String prms_memo;
	public String pay_dt;
	public String pay_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public TN_LNK_1152_ADM(){}
	public TN_LNK_1152_ADM(String cmpy_cd, String dept_idx, String excl_type, String title, String flag, String excl_pmnt_idx, String excl_pmnt_dtl_idx, String add_file_nm, String add_file_size, byte[] add_file, String mode, String row_num, String input_type, String memb_cd, String name, String memb_type, String memb_ctgr_cd, String ern, String prsd_nm, String cell_no, String phone, String zip_cd, String addr, String memb_memo, String prms_dt, String prms_amt, String use_orign, String fund_idx, String suprt_idx, String paymth_cd, String cms_ownr_yn, String cms_bank_cd, String cms_acct_no, String cms_ownr_nm, String cms_ern, String card_cmpy, String card_num, String card_yymm, String card_idntt, String card_owner, String mobl_aprv_nm, String mobl_aprv_cmpy, String mobl_aprv_num, String mobl_aprv_prn, String prttn_type, String mon_pay_dt, String mon_pay_amt, String pay_frdt, String prttn_cnt, String prms_memo, String pay_dt, String pay_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dept_idx = dept_idx;
		this.excl_type = excl_type;
		this.title = title;
		this.flag = flag;
		this.excl_pmnt_idx = excl_pmnt_idx;
		this.excl_pmnt_dtl_idx = excl_pmnt_dtl_idx;
		this.add_file_nm = add_file_nm;
		this.add_file_size = add_file_size;
		this.add_file = add_file;
		this.mode = mode;
		this.row_num = row_num;
		this.input_type = input_type;
		this.memb_cd = memb_cd;
		this.name = name;
		this.memb_type = memb_type;
		this.memb_ctgr_cd = memb_ctgr_cd;
		this.ern = ern;
		this.prsd_nm = prsd_nm;
		this.cell_no = cell_no;
		this.phone = phone;
		this.zip_cd = zip_cd;
		this.addr = addr;
		this.memb_memo = memb_memo;
		this.prms_dt = prms_dt;
		this.prms_amt = prms_amt;
		this.use_orign = use_orign;
		this.fund_idx = fund_idx;
		this.suprt_idx = suprt_idx;
		this.paymth_cd = paymth_cd;
		this.cms_ownr_yn = cms_ownr_yn;
		this.cms_bank_cd = cms_bank_cd;
		this.cms_acct_no = cms_acct_no;
		this.cms_ownr_nm = cms_ownr_nm;
		this.cms_ern = cms_ern;
		this.card_cmpy = card_cmpy;
		this.card_num = card_num;
		this.card_yymm = card_yymm;
		this.card_idntt = card_idntt;
		this.card_owner = card_owner;
		this.mobl_aprv_nm = mobl_aprv_nm;
		this.mobl_aprv_cmpy = mobl_aprv_cmpy;
		this.mobl_aprv_num = mobl_aprv_num;
		this.mobl_aprv_prn = mobl_aprv_prn;
		this.prttn_type = prttn_type;
		this.mon_pay_dt = mon_pay_dt;
		this.mon_pay_amt = mon_pay_amt;
		this.pay_frdt = pay_frdt;
		this.prttn_cnt = prttn_cnt;
		this.prms_memo = prms_memo;
		this.pay_dt = pay_dt;
		this.pay_amt = pay_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_idx(String dept_idx){
		this.dept_idx = dept_idx;
	}

	public void setExcl_type(String excl_type){
		this.excl_type = excl_type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setExcl_pmnt_idx(String excl_pmnt_idx){
		this.excl_pmnt_idx = excl_pmnt_idx;
	}

	public void setExcl_pmnt_dtl_idx(String excl_pmnt_dtl_idx){
		this.excl_pmnt_dtl_idx = excl_pmnt_dtl_idx;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public void setAdd_file_size(String add_file_size){
		this.add_file_size = add_file_size;
	}

	public void setAdd_file(byte[] add_file){
		this.add_file = add_file;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setRow_num(String row_num){
		this.row_num = row_num;
	}

	public void setInput_type(String input_type){
		this.input_type = input_type;
	}

	public void setMemb_cd(String memb_cd){
		this.memb_cd = memb_cd;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setMemb_type(String memb_type){
		this.memb_type = memb_type;
	}

	public void setMemb_ctgr_cd(String memb_ctgr_cd){
		this.memb_ctgr_cd = memb_ctgr_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPrsd_nm(String prsd_nm){
		this.prsd_nm = prsd_nm;
	}

	public void setCell_no(String cell_no){
		this.cell_no = cell_no;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public void setZip_cd(String zip_cd){
		this.zip_cd = zip_cd;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setMemb_memo(String memb_memo){
		this.memb_memo = memb_memo;
	}

	public void setPrms_dt(String prms_dt){
		this.prms_dt = prms_dt;
	}

	public void setPrms_amt(String prms_amt){
		this.prms_amt = prms_amt;
	}

	public void setUse_orign(String use_orign){
		this.use_orign = use_orign;
	}

	public void setFund_idx(String fund_idx){
		this.fund_idx = fund_idx;
	}

	public void setSuprt_idx(String suprt_idx){
		this.suprt_idx = suprt_idx;
	}

	public void setPaymth_cd(String paymth_cd){
		this.paymth_cd = paymth_cd;
	}

	public void setCms_ownr_yn(String cms_ownr_yn){
		this.cms_ownr_yn = cms_ownr_yn;
	}

	public void setCms_bank_cd(String cms_bank_cd){
		this.cms_bank_cd = cms_bank_cd;
	}

	public void setCms_acct_no(String cms_acct_no){
		this.cms_acct_no = cms_acct_no;
	}

	public void setCms_ownr_nm(String cms_ownr_nm){
		this.cms_ownr_nm = cms_ownr_nm;
	}

	public void setCms_ern(String cms_ern){
		this.cms_ern = cms_ern;
	}

	public void setCard_cmpy(String card_cmpy){
		this.card_cmpy = card_cmpy;
	}

	public void setCard_num(String card_num){
		this.card_num = card_num;
	}

	public void setCard_yymm(String card_yymm){
		this.card_yymm = card_yymm;
	}

	public void setCard_idntt(String card_idntt){
		this.card_idntt = card_idntt;
	}

	public void setCard_owner(String card_owner){
		this.card_owner = card_owner;
	}

	public void setMobl_aprv_nm(String mobl_aprv_nm){
		this.mobl_aprv_nm = mobl_aprv_nm;
	}

	public void setMobl_aprv_cmpy(String mobl_aprv_cmpy){
		this.mobl_aprv_cmpy = mobl_aprv_cmpy;
	}

	public void setMobl_aprv_num(String mobl_aprv_num){
		this.mobl_aprv_num = mobl_aprv_num;
	}

	public void setMobl_aprv_prn(String mobl_aprv_prn){
		this.mobl_aprv_prn = mobl_aprv_prn;
	}

	public void setPrttn_type(String prttn_type){
		this.prttn_type = prttn_type;
	}

	public void setMon_pay_dt(String mon_pay_dt){
		this.mon_pay_dt = mon_pay_dt;
	}

	public void setMon_pay_amt(String mon_pay_amt){
		this.mon_pay_amt = mon_pay_amt;
	}

	public void setPay_frdt(String pay_frdt){
		this.pay_frdt = pay_frdt;
	}

	public void setPrttn_cnt(String prttn_cnt){
		this.prttn_cnt = prttn_cnt;
	}

	public void setPrms_memo(String prms_memo){
		this.prms_memo = prms_memo;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_idx(){
		return this.dept_idx;
	}

	public String getExcl_type(){
		return this.excl_type;
	}

	public String getTitle(){
		return this.title;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getExcl_pmnt_idx(){
		return this.excl_pmnt_idx;
	}

	public String getExcl_pmnt_dtl_idx(){
		return this.excl_pmnt_dtl_idx;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}

	public String getAdd_file_size(){
		return this.add_file_size;
	}

	public byte[] getAdd_file(){
		return this.add_file;
	}

	public String getMode(){
		return this.mode;
	}

	public String getRow_num(){
		return this.row_num;
	}

	public String getInput_type(){
		return this.input_type;
	}

	public String getMemb_cd(){
		return this.memb_cd;
	}

	public String getName(){
		return this.name;
	}

	public String getMemb_type(){
		return this.memb_type;
	}

	public String getMemb_ctgr_cd(){
		return this.memb_ctgr_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPrsd_nm(){
		return this.prsd_nm;
	}

	public String getCell_no(){
		return this.cell_no;
	}

	public String getPhone(){
		return this.phone;
	}

	public String getZip_cd(){
		return this.zip_cd;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getMemb_memo(){
		return this.memb_memo;
	}

	public String getPrms_dt(){
		return this.prms_dt;
	}

	public String getPrms_amt(){
		return this.prms_amt;
	}

	public String getUse_orign(){
		return this.use_orign;
	}

	public String getFund_idx(){
		return this.fund_idx;
	}

	public String getSuprt_idx(){
		return this.suprt_idx;
	}

	public String getPaymth_cd(){
		return this.paymth_cd;
	}

	public String getCms_ownr_yn(){
		return this.cms_ownr_yn;
	}

	public String getCms_bank_cd(){
		return this.cms_bank_cd;
	}

	public String getCms_acct_no(){
		return this.cms_acct_no;
	}

	public String getCms_ownr_nm(){
		return this.cms_ownr_nm;
	}

	public String getCms_ern(){
		return this.cms_ern;
	}

	public String getCard_cmpy(){
		return this.card_cmpy;
	}

	public String getCard_num(){
		return this.card_num;
	}

	public String getCard_yymm(){
		return this.card_yymm;
	}

	public String getCard_idntt(){
		return this.card_idntt;
	}

	public String getCard_owner(){
		return this.card_owner;
	}

	public String getMobl_aprv_nm(){
		return this.mobl_aprv_nm;
	}

	public String getMobl_aprv_cmpy(){
		return this.mobl_aprv_cmpy;
	}

	public String getMobl_aprv_num(){
		return this.mobl_aprv_num;
	}

	public String getMobl_aprv_prn(){
		return this.mobl_aprv_prn;
	}

	public String getPrttn_type(){
		return this.prttn_type;
	}

	public String getMon_pay_dt(){
		return this.mon_pay_dt;
	}

	public String getMon_pay_amt(){
		return this.mon_pay_amt;
	}

	public String getPay_frdt(){
		return this.pay_frdt;
	}

	public String getPrttn_cnt(){
		return this.prttn_cnt;
	}

	public String getPrms_memo(){
		return this.prms_memo;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_1152_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1152_ADM dm = (TN_LNK_1152_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_idx);
		cstmt.setString(5, dm.excl_type);
		cstmt.setString(6, dm.title);
		cstmt.setString(7, dm.flag);
		cstmt.setString(8, dm.excl_pmnt_idx);
		cstmt.setString(9, dm.excl_pmnt_dtl_idx);
		cstmt.setString(10, dm.add_file_nm);
		cstmt.setString(11, dm.add_file_size);
		cstmt.setString(13, dm.mode);
		cstmt.setString(14, dm.row_num);
		cstmt.setString(15, dm.input_type);
		cstmt.setString(16, dm.memb_cd);
		cstmt.setString(17, dm.name);
		cstmt.setString(18, dm.memb_type);
		cstmt.setString(19, dm.memb_ctgr_cd);
		cstmt.setString(20, dm.ern);
		cstmt.setString(21, dm.prsd_nm);
		cstmt.setString(22, dm.cell_no);
		cstmt.setString(23, dm.phone);
		cstmt.setString(24, dm.zip_cd);
		cstmt.setString(25, dm.addr);
		cstmt.setString(26, dm.memb_memo);
		cstmt.setString(27, dm.prms_dt);
		cstmt.setString(28, dm.prms_amt);
		cstmt.setString(29, dm.use_orign);
		cstmt.setString(30, dm.fund_idx);
		cstmt.setString(31, dm.suprt_idx);
		cstmt.setString(32, dm.paymth_cd);
		cstmt.setString(33, dm.cms_ownr_yn);
		cstmt.setString(34, dm.cms_bank_cd);
		cstmt.setString(35, dm.cms_acct_no);
		cstmt.setString(36, dm.cms_ownr_nm);
		cstmt.setString(37, dm.cms_ern);
		cstmt.setString(38, dm.card_cmpy);
		cstmt.setString(39, dm.card_num);
		cstmt.setString(40, dm.card_yymm);
		cstmt.setString(41, dm.card_idntt);
		cstmt.setString(42, dm.card_owner);
		cstmt.setString(43, dm.mobl_aprv_nm);
		cstmt.setString(44, dm.mobl_aprv_cmpy);
		cstmt.setString(45, dm.mobl_aprv_num);
		cstmt.setString(46, dm.mobl_aprv_prn);
		cstmt.setString(47, dm.prttn_type);
		cstmt.setString(48, dm.mon_pay_dt);
		cstmt.setString(49, dm.mon_pay_amt);
		cstmt.setString(50, dm.pay_frdt);
		cstmt.setString(51, dm.prttn_cnt);
		cstmt.setString(52, dm.prms_memo);
		cstmt.setString(53, dm.pay_dt);
		cstmt.setString(54, dm.pay_amt);
		cstmt.setString(55, dm.incmg_pers_ip);
		cstmt.setString(56, dm.incmg_pers);
		cstmt.registerOutParameter(57, Types.VARCHAR);
		cstmt.registerOutParameter(58, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1152_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_idx = [" + getDept_idx() + "]");
		System.out.println("excl_type = [" + getExcl_type() + "]");
		System.out.println("title = [" + getTitle() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("excl_pmnt_idx = [" + getExcl_pmnt_idx() + "]");
		System.out.println("excl_pmnt_dtl_idx = [" + getExcl_pmnt_dtl_idx() + "]");
		System.out.println("add_file_nm = [" + getAdd_file_nm() + "]");
		System.out.println("add_file_size = [" + getAdd_file_size() + "]");
		System.out.println("add_file = [" + getAdd_file() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("row_num = [" + getRow_num() + "]");
		System.out.println("input_type = [" + getInput_type() + "]");
		System.out.println("memb_cd = [" + getMemb_cd() + "]");
		System.out.println("name = [" + getName() + "]");
		System.out.println("memb_type = [" + getMemb_type() + "]");
		System.out.println("memb_ctgr_cd = [" + getMemb_ctgr_cd() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("prsd_nm = [" + getPrsd_nm() + "]");
		System.out.println("cell_no = [" + getCell_no() + "]");
		System.out.println("phone = [" + getPhone() + "]");
		System.out.println("zip_cd = [" + getZip_cd() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("memb_memo = [" + getMemb_memo() + "]");
		System.out.println("prms_dt = [" + getPrms_dt() + "]");
		System.out.println("prms_amt = [" + getPrms_amt() + "]");
		System.out.println("use_orign = [" + getUse_orign() + "]");
		System.out.println("fund_idx = [" + getFund_idx() + "]");
		System.out.println("suprt_idx = [" + getSuprt_idx() + "]");
		System.out.println("paymth_cd = [" + getPaymth_cd() + "]");
		System.out.println("cms_ownr_yn = [" + getCms_ownr_yn() + "]");
		System.out.println("cms_bank_cd = [" + getCms_bank_cd() + "]");
		System.out.println("cms_acct_no = [" + getCms_acct_no() + "]");
		System.out.println("cms_ownr_nm = [" + getCms_ownr_nm() + "]");
		System.out.println("cms_ern = [" + getCms_ern() + "]");
		System.out.println("card_cmpy = [" + getCard_cmpy() + "]");
		System.out.println("card_num = [" + getCard_num() + "]");
		System.out.println("card_yymm = [" + getCard_yymm() + "]");
		System.out.println("card_idntt = [" + getCard_idntt() + "]");
		System.out.println("card_owner = [" + getCard_owner() + "]");
		System.out.println("mobl_aprv_nm = [" + getMobl_aprv_nm() + "]");
		System.out.println("mobl_aprv_cmpy = [" + getMobl_aprv_cmpy() + "]");
		System.out.println("mobl_aprv_num = [" + getMobl_aprv_num() + "]");
		System.out.println("mobl_aprv_prn = [" + getMobl_aprv_prn() + "]");
		System.out.println("prttn_type = [" + getPrttn_type() + "]");
		System.out.println("mon_pay_dt = [" + getMon_pay_dt() + "]");
		System.out.println("mon_pay_amt = [" + getMon_pay_amt() + "]");
		System.out.println("pay_frdt = [" + getPay_frdt() + "]");
		System.out.println("prttn_cnt = [" + getPrttn_cnt() + "]");
		System.out.println("prms_memo = [" + getPrms_memo() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("pay_amt = [" + getPay_amt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String dept_idx = req.getParameter("dept_idx");
if( dept_idx == null){
	System.out.println(this.toString+" : dept_idx is null" );
}else{
	System.out.println(this.toString+" : dept_idx is "+dept_idx );
}
String excl_type = req.getParameter("excl_type");
if( excl_type == null){
	System.out.println(this.toString+" : excl_type is null" );
}else{
	System.out.println(this.toString+" : excl_type is "+excl_type );
}
String title = req.getParameter("title");
if( title == null){
	System.out.println(this.toString+" : title is null" );
}else{
	System.out.println(this.toString+" : title is "+title );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String excl_pmnt_idx = req.getParameter("excl_pmnt_idx");
if( excl_pmnt_idx == null){
	System.out.println(this.toString+" : excl_pmnt_idx is null" );
}else{
	System.out.println(this.toString+" : excl_pmnt_idx is "+excl_pmnt_idx );
}
String excl_pmnt_dtl_idx = req.getParameter("excl_pmnt_dtl_idx");
if( excl_pmnt_dtl_idx == null){
	System.out.println(this.toString+" : excl_pmnt_dtl_idx is null" );
}else{
	System.out.println(this.toString+" : excl_pmnt_dtl_idx is "+excl_pmnt_dtl_idx );
}
String add_file_nm = req.getParameter("add_file_nm");
if( add_file_nm == null){
	System.out.println(this.toString+" : add_file_nm is null" );
}else{
	System.out.println(this.toString+" : add_file_nm is "+add_file_nm );
}
String add_file_size = req.getParameter("add_file_size");
if( add_file_size == null){
	System.out.println(this.toString+" : add_file_size is null" );
}else{
	System.out.println(this.toString+" : add_file_size is "+add_file_size );
}
String add_file = req.getParameter("add_file");
if( add_file == null){
	System.out.println(this.toString+" : add_file is null" );
}else{
	System.out.println(this.toString+" : add_file is "+add_file );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String row_num = req.getParameter("row_num");
if( row_num == null){
	System.out.println(this.toString+" : row_num is null" );
}else{
	System.out.println(this.toString+" : row_num is "+row_num );
}
String input_type = req.getParameter("input_type");
if( input_type == null){
	System.out.println(this.toString+" : input_type is null" );
}else{
	System.out.println(this.toString+" : input_type is "+input_type );
}
String memb_cd = req.getParameter("memb_cd");
if( memb_cd == null){
	System.out.println(this.toString+" : memb_cd is null" );
}else{
	System.out.println(this.toString+" : memb_cd is "+memb_cd );
}
String name = req.getParameter("name");
if( name == null){
	System.out.println(this.toString+" : name is null" );
}else{
	System.out.println(this.toString+" : name is "+name );
}
String memb_type = req.getParameter("memb_type");
if( memb_type == null){
	System.out.println(this.toString+" : memb_type is null" );
}else{
	System.out.println(this.toString+" : memb_type is "+memb_type );
}
String memb_ctgr_cd = req.getParameter("memb_ctgr_cd");
if( memb_ctgr_cd == null){
	System.out.println(this.toString+" : memb_ctgr_cd is null" );
}else{
	System.out.println(this.toString+" : memb_ctgr_cd is "+memb_ctgr_cd );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String prsd_nm = req.getParameter("prsd_nm");
if( prsd_nm == null){
	System.out.println(this.toString+" : prsd_nm is null" );
}else{
	System.out.println(this.toString+" : prsd_nm is "+prsd_nm );
}
String cell_no = req.getParameter("cell_no");
if( cell_no == null){
	System.out.println(this.toString+" : cell_no is null" );
}else{
	System.out.println(this.toString+" : cell_no is "+cell_no );
}
String phone = req.getParameter("phone");
if( phone == null){
	System.out.println(this.toString+" : phone is null" );
}else{
	System.out.println(this.toString+" : phone is "+phone );
}
String zip_cd = req.getParameter("zip_cd");
if( zip_cd == null){
	System.out.println(this.toString+" : zip_cd is null" );
}else{
	System.out.println(this.toString+" : zip_cd is "+zip_cd );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String memb_memo = req.getParameter("memb_memo");
if( memb_memo == null){
	System.out.println(this.toString+" : memb_memo is null" );
}else{
	System.out.println(this.toString+" : memb_memo is "+memb_memo );
}
String prms_dt = req.getParameter("prms_dt");
if( prms_dt == null){
	System.out.println(this.toString+" : prms_dt is null" );
}else{
	System.out.println(this.toString+" : prms_dt is "+prms_dt );
}
String prms_amt = req.getParameter("prms_amt");
if( prms_amt == null){
	System.out.println(this.toString+" : prms_amt is null" );
}else{
	System.out.println(this.toString+" : prms_amt is "+prms_amt );
}
String use_orign = req.getParameter("use_orign");
if( use_orign == null){
	System.out.println(this.toString+" : use_orign is null" );
}else{
	System.out.println(this.toString+" : use_orign is "+use_orign );
}
String fund_idx = req.getParameter("fund_idx");
if( fund_idx == null){
	System.out.println(this.toString+" : fund_idx is null" );
}else{
	System.out.println(this.toString+" : fund_idx is "+fund_idx );
}
String suprt_idx = req.getParameter("suprt_idx");
if( suprt_idx == null){
	System.out.println(this.toString+" : suprt_idx is null" );
}else{
	System.out.println(this.toString+" : suprt_idx is "+suprt_idx );
}
String paymth_cd = req.getParameter("paymth_cd");
if( paymth_cd == null){
	System.out.println(this.toString+" : paymth_cd is null" );
}else{
	System.out.println(this.toString+" : paymth_cd is "+paymth_cd );
}
String cms_ownr_yn = req.getParameter("cms_ownr_yn");
if( cms_ownr_yn == null){
	System.out.println(this.toString+" : cms_ownr_yn is null" );
}else{
	System.out.println(this.toString+" : cms_ownr_yn is "+cms_ownr_yn );
}
String cms_bank_cd = req.getParameter("cms_bank_cd");
if( cms_bank_cd == null){
	System.out.println(this.toString+" : cms_bank_cd is null" );
}else{
	System.out.println(this.toString+" : cms_bank_cd is "+cms_bank_cd );
}
String cms_acct_no = req.getParameter("cms_acct_no");
if( cms_acct_no == null){
	System.out.println(this.toString+" : cms_acct_no is null" );
}else{
	System.out.println(this.toString+" : cms_acct_no is "+cms_acct_no );
}
String cms_ownr_nm = req.getParameter("cms_ownr_nm");
if( cms_ownr_nm == null){
	System.out.println(this.toString+" : cms_ownr_nm is null" );
}else{
	System.out.println(this.toString+" : cms_ownr_nm is "+cms_ownr_nm );
}
String cms_ern = req.getParameter("cms_ern");
if( cms_ern == null){
	System.out.println(this.toString+" : cms_ern is null" );
}else{
	System.out.println(this.toString+" : cms_ern is "+cms_ern );
}
String card_cmpy = req.getParameter("card_cmpy");
if( card_cmpy == null){
	System.out.println(this.toString+" : card_cmpy is null" );
}else{
	System.out.println(this.toString+" : card_cmpy is "+card_cmpy );
}
String card_num = req.getParameter("card_num");
if( card_num == null){
	System.out.println(this.toString+" : card_num is null" );
}else{
	System.out.println(this.toString+" : card_num is "+card_num );
}
String card_yymm = req.getParameter("card_yymm");
if( card_yymm == null){
	System.out.println(this.toString+" : card_yymm is null" );
}else{
	System.out.println(this.toString+" : card_yymm is "+card_yymm );
}
String card_idntt = req.getParameter("card_idntt");
if( card_idntt == null){
	System.out.println(this.toString+" : card_idntt is null" );
}else{
	System.out.println(this.toString+" : card_idntt is "+card_idntt );
}
String card_owner = req.getParameter("card_owner");
if( card_owner == null){
	System.out.println(this.toString+" : card_owner is null" );
}else{
	System.out.println(this.toString+" : card_owner is "+card_owner );
}
String mobl_aprv_nm = req.getParameter("mobl_aprv_nm");
if( mobl_aprv_nm == null){
	System.out.println(this.toString+" : mobl_aprv_nm is null" );
}else{
	System.out.println(this.toString+" : mobl_aprv_nm is "+mobl_aprv_nm );
}
String mobl_aprv_cmpy = req.getParameter("mobl_aprv_cmpy");
if( mobl_aprv_cmpy == null){
	System.out.println(this.toString+" : mobl_aprv_cmpy is null" );
}else{
	System.out.println(this.toString+" : mobl_aprv_cmpy is "+mobl_aprv_cmpy );
}
String mobl_aprv_num = req.getParameter("mobl_aprv_num");
if( mobl_aprv_num == null){
	System.out.println(this.toString+" : mobl_aprv_num is null" );
}else{
	System.out.println(this.toString+" : mobl_aprv_num is "+mobl_aprv_num );
}
String mobl_aprv_prn = req.getParameter("mobl_aprv_prn");
if( mobl_aprv_prn == null){
	System.out.println(this.toString+" : mobl_aprv_prn is null" );
}else{
	System.out.println(this.toString+" : mobl_aprv_prn is "+mobl_aprv_prn );
}
String prttn_type = req.getParameter("prttn_type");
if( prttn_type == null){
	System.out.println(this.toString+" : prttn_type is null" );
}else{
	System.out.println(this.toString+" : prttn_type is "+prttn_type );
}
String mon_pay_dt = req.getParameter("mon_pay_dt");
if( mon_pay_dt == null){
	System.out.println(this.toString+" : mon_pay_dt is null" );
}else{
	System.out.println(this.toString+" : mon_pay_dt is "+mon_pay_dt );
}
String mon_pay_amt = req.getParameter("mon_pay_amt");
if( mon_pay_amt == null){
	System.out.println(this.toString+" : mon_pay_amt is null" );
}else{
	System.out.println(this.toString+" : mon_pay_amt is "+mon_pay_amt );
}
String pay_frdt = req.getParameter("pay_frdt");
if( pay_frdt == null){
	System.out.println(this.toString+" : pay_frdt is null" );
}else{
	System.out.println(this.toString+" : pay_frdt is "+pay_frdt );
}
String prttn_cnt = req.getParameter("prttn_cnt");
if( prttn_cnt == null){
	System.out.println(this.toString+" : prttn_cnt is null" );
}else{
	System.out.println(this.toString+" : prttn_cnt is "+prttn_cnt );
}
String prms_memo = req.getParameter("prms_memo");
if( prms_memo == null){
	System.out.println(this.toString+" : prms_memo is null" );
}else{
	System.out.println(this.toString+" : prms_memo is "+prms_memo );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String dept_idx = Util.checkString(req.getParameter("dept_idx"));
String excl_type = Util.checkString(req.getParameter("excl_type"));
String title = Util.checkString(req.getParameter("title"));
String flag = Util.checkString(req.getParameter("flag"));
String excl_pmnt_idx = Util.checkString(req.getParameter("excl_pmnt_idx"));
String excl_pmnt_dtl_idx = Util.checkString(req.getParameter("excl_pmnt_dtl_idx"));
String add_file_nm = Util.checkString(req.getParameter("add_file_nm"));
String add_file_size = Util.checkString(req.getParameter("add_file_size"));
String add_file = Util.checkString(req.getParameter("add_file"));
String mode = Util.checkString(req.getParameter("mode"));
String row_num = Util.checkString(req.getParameter("row_num"));
String input_type = Util.checkString(req.getParameter("input_type"));
String memb_cd = Util.checkString(req.getParameter("memb_cd"));
String name = Util.checkString(req.getParameter("name"));
String memb_type = Util.checkString(req.getParameter("memb_type"));
String memb_ctgr_cd = Util.checkString(req.getParameter("memb_ctgr_cd"));
String ern = Util.checkString(req.getParameter("ern"));
String prsd_nm = Util.checkString(req.getParameter("prsd_nm"));
String cell_no = Util.checkString(req.getParameter("cell_no"));
String phone = Util.checkString(req.getParameter("phone"));
String zip_cd = Util.checkString(req.getParameter("zip_cd"));
String addr = Util.checkString(req.getParameter("addr"));
String memb_memo = Util.checkString(req.getParameter("memb_memo"));
String prms_dt = Util.checkString(req.getParameter("prms_dt"));
String prms_amt = Util.checkString(req.getParameter("prms_amt"));
String use_orign = Util.checkString(req.getParameter("use_orign"));
String fund_idx = Util.checkString(req.getParameter("fund_idx"));
String suprt_idx = Util.checkString(req.getParameter("suprt_idx"));
String paymth_cd = Util.checkString(req.getParameter("paymth_cd"));
String cms_ownr_yn = Util.checkString(req.getParameter("cms_ownr_yn"));
String cms_bank_cd = Util.checkString(req.getParameter("cms_bank_cd"));
String cms_acct_no = Util.checkString(req.getParameter("cms_acct_no"));
String cms_ownr_nm = Util.checkString(req.getParameter("cms_ownr_nm"));
String cms_ern = Util.checkString(req.getParameter("cms_ern"));
String card_cmpy = Util.checkString(req.getParameter("card_cmpy"));
String card_num = Util.checkString(req.getParameter("card_num"));
String card_yymm = Util.checkString(req.getParameter("card_yymm"));
String card_idntt = Util.checkString(req.getParameter("card_idntt"));
String card_owner = Util.checkString(req.getParameter("card_owner"));
String mobl_aprv_nm = Util.checkString(req.getParameter("mobl_aprv_nm"));
String mobl_aprv_cmpy = Util.checkString(req.getParameter("mobl_aprv_cmpy"));
String mobl_aprv_num = Util.checkString(req.getParameter("mobl_aprv_num"));
String mobl_aprv_prn = Util.checkString(req.getParameter("mobl_aprv_prn"));
String prttn_type = Util.checkString(req.getParameter("prttn_type"));
String mon_pay_dt = Util.checkString(req.getParameter("mon_pay_dt"));
String mon_pay_amt = Util.checkString(req.getParameter("mon_pay_amt"));
String pay_frdt = Util.checkString(req.getParameter("pay_frdt"));
String prttn_cnt = Util.checkString(req.getParameter("prttn_cnt"));
String prms_memo = Util.checkString(req.getParameter("prms_memo"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_idx")));
String excl_type = Util.Uni2Ksc(Util.checkString(req.getParameter("excl_type")));
String title = Util.Uni2Ksc(Util.checkString(req.getParameter("title")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String excl_pmnt_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("excl_pmnt_idx")));
String excl_pmnt_dtl_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("excl_pmnt_dtl_idx")));
String add_file_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_nm")));
String add_file_size = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_size")));
String add_file = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String row_num = Util.Uni2Ksc(Util.checkString(req.getParameter("row_num")));
String input_type = Util.Uni2Ksc(Util.checkString(req.getParameter("input_type")));
String memb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_cd")));
String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));
String memb_type = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_type")));
String memb_ctgr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_ctgr_cd")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String prsd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("prsd_nm")));
String cell_no = Util.Uni2Ksc(Util.checkString(req.getParameter("cell_no")));
String phone = Util.Uni2Ksc(Util.checkString(req.getParameter("phone")));
String zip_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_cd")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String memb_memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_memo")));
String prms_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prms_dt")));
String prms_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prms_amt")));
String use_orign = Util.Uni2Ksc(Util.checkString(req.getParameter("use_orign")));
String fund_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_idx")));
String suprt_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("suprt_idx")));
String paymth_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("paymth_cd")));
String cms_ownr_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("cms_ownr_yn")));
String cms_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cms_bank_cd")));
String cms_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("cms_acct_no")));
String cms_ownr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cms_ownr_nm")));
String cms_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("cms_ern")));
String card_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("card_cmpy")));
String card_num = Util.Uni2Ksc(Util.checkString(req.getParameter("card_num")));
String card_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("card_yymm")));
String card_idntt = Util.Uni2Ksc(Util.checkString(req.getParameter("card_idntt")));
String card_owner = Util.Uni2Ksc(Util.checkString(req.getParameter("card_owner")));
String mobl_aprv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mobl_aprv_nm")));
String mobl_aprv_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("mobl_aprv_cmpy")));
String mobl_aprv_num = Util.Uni2Ksc(Util.checkString(req.getParameter("mobl_aprv_num")));
String mobl_aprv_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("mobl_aprv_prn")));
String prttn_type = Util.Uni2Ksc(Util.checkString(req.getParameter("prttn_type")));
String mon_pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mon_pay_dt")));
String mon_pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mon_pay_amt")));
String pay_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_frdt")));
String prttn_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("prttn_cnt")));
String prms_memo = Util.Uni2Ksc(Util.checkString(req.getParameter("prms_memo")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_idx(dept_idx);
dm.setExcl_type(excl_type);
dm.setTitle(title);
dm.setFlag(flag);
dm.setExcl_pmnt_idx(excl_pmnt_idx);
dm.setExcl_pmnt_dtl_idx(excl_pmnt_dtl_idx);
dm.setAdd_file_nm(add_file_nm);
dm.setAdd_file_size(add_file_size);
dm.setAdd_file(add_file);
dm.setMode(mode);
dm.setRow_num(row_num);
dm.setInput_type(input_type);
dm.setMemb_cd(memb_cd);
dm.setName(name);
dm.setMemb_type(memb_type);
dm.setMemb_ctgr_cd(memb_ctgr_cd);
dm.setErn(ern);
dm.setPrsd_nm(prsd_nm);
dm.setCell_no(cell_no);
dm.setPhone(phone);
dm.setZip_cd(zip_cd);
dm.setAddr(addr);
dm.setMemb_memo(memb_memo);
dm.setPrms_dt(prms_dt);
dm.setPrms_amt(prms_amt);
dm.setUse_orign(use_orign);
dm.setFund_idx(fund_idx);
dm.setSuprt_idx(suprt_idx);
dm.setPaymth_cd(paymth_cd);
dm.setCms_ownr_yn(cms_ownr_yn);
dm.setCms_bank_cd(cms_bank_cd);
dm.setCms_acct_no(cms_acct_no);
dm.setCms_ownr_nm(cms_ownr_nm);
dm.setCms_ern(cms_ern);
dm.setCard_cmpy(card_cmpy);
dm.setCard_num(card_num);
dm.setCard_yymm(card_yymm);
dm.setCard_idntt(card_idntt);
dm.setCard_owner(card_owner);
dm.setMobl_aprv_nm(mobl_aprv_nm);
dm.setMobl_aprv_cmpy(mobl_aprv_cmpy);
dm.setMobl_aprv_num(mobl_aprv_num);
dm.setMobl_aprv_prn(mobl_aprv_prn);
dm.setPrttn_type(prttn_type);
dm.setMon_pay_dt(mon_pay_dt);
dm.setMon_pay_amt(mon_pay_amt);
dm.setPay_frdt(pay_frdt);
dm.setPrttn_cnt(prttn_cnt);
dm.setPrms_memo(prms_memo);
dm.setPay_dt(pay_dt);
dm.setPay_amt(pay_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 17 11:01:28 KST 2016 */