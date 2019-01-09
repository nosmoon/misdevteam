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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1020_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String onl_memb_idx;
	public String onl_memb_cd;
	public String onl_prms_idx;
	public String onl_prms_cd;
	public String onl_pmnt_idx;
	public String onl_pmnt_cd;
	public String name;
	public String anymus;
	public String tel_no;
	public String regno;
	public String memb_g_cd;
	public String brtd_type;
	public String brt_dt;
	public String dept;
	public String title;
	public String phone;
	public String post_clsf;
	public String use_addr;
	public String addr_type;
	public String zip;
	public String addr;
	public String dtl_addr;
	public String email;
	public String email2;
	public String paswd;
	public String memb_memo;
	public String rltn_info;
	public String dept_idx;
	public String prms_dt;
	public String fnd_type;
	public String fnd_idx;
	public String spprt_type;
	public String spprt_idx;
	public String use_orgnl;
	public String cntor_memo;
	public String prms_memo;
	public String prms_amt;
	public String pmnth_cd;
	public String pmnth_type;
	public String prtn_type;
	public String mon_pay_day;
	public String mon_pay_amt;
	public String prtn_cnt;
	public String pay_frdt;
	public String pay_todt;
	public String cms_bnk_cd;
	public String cms_bnk_acnt;
	public String cms_bnk_owner;
	public String cms_regno;
	public String card_cmpy;
	public String card_num;
	public String card_yymm;
	public String mobl_aprv_nm;
	public String mobl_aprv_cmpy;
	public String mobl_aprv_num;
	public String mobl_aprv_prn;
	public String trns_dt;
	public String pay_dt;
	public String pay_amt;
	public String fee;
	public String payth_cd;
	public String payth_type;
	public String memb_cd;
	public String prms_cd;
	public String pmnt_cd;
	public String memb_idx;
	public String prms_idx;
	public String pmnt_idx;
	public String purp_memo;
	public String pre_memb_cd;
	public String pre_prms_cd;
	public String pre_pmnt_cd;
	public String pre_memb_idx;
	public String pre_prms_idx;
	public String pre_pmnt_idx;

	public TN_LNK_1020_SDataSet(){}
	public TN_LNK_1020_SDataSet(String errcode, String errmsg, String onl_memb_idx, String onl_memb_cd, String onl_prms_idx, String onl_prms_cd, String onl_pmnt_idx, String onl_pmnt_cd, String name, String anymus, String tel_no, String regno, String memb_g_cd, String brtd_type, String brt_dt, String dept, String title, String phone, String post_clsf, String use_addr, String addr_type, String zip, String addr, String dtl_addr, String email, String email2, String paswd, String memb_memo, String rltn_info, String dept_idx, String prms_dt, String fnd_type, String fnd_idx, String spprt_type, String spprt_idx, String use_orgnl, String cntor_memo, String prms_memo, String prms_amt, String pmnth_cd, String pmnth_type, String prtn_type, String mon_pay_day, String mon_pay_amt, String prtn_cnt, String pay_frdt, String pay_todt, String cms_bnk_cd, String cms_bnk_acnt, String cms_bnk_owner, String cms_regno, String card_cmpy, String card_num, String card_yymm, String mobl_aprv_nm, String mobl_aprv_cmpy, String mobl_aprv_num, String mobl_aprv_prn, String trns_dt, String pay_dt, String pay_amt, String fee, String payth_cd, String payth_type, String memb_cd, String prms_cd, String pmnt_cd, String memb_idx, String prms_idx, String pmnt_idx, String purp_memo, String pre_memb_cd, String pre_prms_cd, String pre_pmnt_cd, String pre_memb_idx, String pre_prms_idx, String pre_pmnt_idx){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.onl_memb_idx = onl_memb_idx;
		this.onl_memb_cd = onl_memb_cd;
		this.onl_prms_idx = onl_prms_idx;
		this.onl_prms_cd = onl_prms_cd;
		this.onl_pmnt_idx = onl_pmnt_idx;
		this.onl_pmnt_cd = onl_pmnt_cd;
		this.name = name;
		this.anymus = anymus;
		this.tel_no = tel_no;
		this.regno = regno;
		this.memb_g_cd = memb_g_cd;
		this.brtd_type = brtd_type;
		this.brt_dt = brt_dt;
		this.dept = dept;
		this.title = title;
		this.phone = phone;
		this.post_clsf = post_clsf;
		this.use_addr = use_addr;
		this.addr_type = addr_type;
		this.zip = zip;
		this.addr = addr;
		this.dtl_addr = dtl_addr;
		this.email = email;
		this.email2 = email2;
		this.paswd = paswd;
		this.memb_memo = memb_memo;
		this.rltn_info = rltn_info;
		this.dept_idx = dept_idx;
		this.prms_dt = prms_dt;
		this.fnd_type = fnd_type;
		this.fnd_idx = fnd_idx;
		this.spprt_type = spprt_type;
		this.spprt_idx = spprt_idx;
		this.use_orgnl = use_orgnl;
		this.cntor_memo = cntor_memo;
		this.prms_memo = prms_memo;
		this.prms_amt = prms_amt;
		this.pmnth_cd = pmnth_cd;
		this.pmnth_type = pmnth_type;
		this.prtn_type = prtn_type;
		this.mon_pay_day = mon_pay_day;
		this.mon_pay_amt = mon_pay_amt;
		this.prtn_cnt = prtn_cnt;
		this.pay_frdt = pay_frdt;
		this.pay_todt = pay_todt;
		this.cms_bnk_cd = cms_bnk_cd;
		this.cms_bnk_acnt = cms_bnk_acnt;
		this.cms_bnk_owner = cms_bnk_owner;
		this.cms_regno = cms_regno;
		this.card_cmpy = card_cmpy;
		this.card_num = card_num;
		this.card_yymm = card_yymm;
		this.mobl_aprv_nm = mobl_aprv_nm;
		this.mobl_aprv_cmpy = mobl_aprv_cmpy;
		this.mobl_aprv_num = mobl_aprv_num;
		this.mobl_aprv_prn = mobl_aprv_prn;
		this.trns_dt = trns_dt;
		this.pay_dt = pay_dt;
		this.pay_amt = pay_amt;
		this.fee = fee;
		this.payth_cd = payth_cd;
		this.payth_type = payth_type;
		this.memb_cd = memb_cd;
		this.prms_cd = prms_cd;
		this.pmnt_cd = pmnt_cd;
		this.memb_idx = memb_idx;
		this.prms_idx = prms_idx;
		this.pmnt_idx = pmnt_idx;
		this.purp_memo = purp_memo;
		this.pre_memb_cd = pre_memb_cd;
		this.pre_prms_cd = pre_prms_cd;
		this.pre_pmnt_cd = pre_pmnt_cd;
		this.pre_memb_idx = pre_memb_idx;
		this.pre_prms_idx = pre_prms_idx;
		this.pre_pmnt_idx = pre_pmnt_idx;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setOnl_memb_idx(String onl_memb_idx){
		this.onl_memb_idx = onl_memb_idx;
	}

	public void setOnl_memb_cd(String onl_memb_cd){
		this.onl_memb_cd = onl_memb_cd;
	}

	public void setOnl_prms_idx(String onl_prms_idx){
		this.onl_prms_idx = onl_prms_idx;
	}

	public void setOnl_prms_cd(String onl_prms_cd){
		this.onl_prms_cd = onl_prms_cd;
	}

	public void setOnl_pmnt_idx(String onl_pmnt_idx){
		this.onl_pmnt_idx = onl_pmnt_idx;
	}

	public void setOnl_pmnt_cd(String onl_pmnt_cd){
		this.onl_pmnt_cd = onl_pmnt_cd;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAnymus(String anymus){
		this.anymus = anymus;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setMemb_g_cd(String memb_g_cd){
		this.memb_g_cd = memb_g_cd;
	}

	public void setBrtd_type(String brtd_type){
		this.brtd_type = brtd_type;
	}

	public void setBrt_dt(String brt_dt){
		this.brt_dt = brt_dt;
	}

	public void setDept(String dept){
		this.dept = dept;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public void setPost_clsf(String post_clsf){
		this.post_clsf = post_clsf;
	}

	public void setUse_addr(String use_addr){
		this.use_addr = use_addr;
	}

	public void setAddr_type(String addr_type){
		this.addr_type = addr_type;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtl_addr(String dtl_addr){
		this.dtl_addr = dtl_addr;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setEmail2(String email2){
		this.email2 = email2;
	}

	public void setPaswd(String paswd){
		this.paswd = paswd;
	}

	public void setMemb_memo(String memb_memo){
		this.memb_memo = memb_memo;
	}

	public void setRltn_info(String rltn_info){
		this.rltn_info = rltn_info;
	}

	public void setDept_idx(String dept_idx){
		this.dept_idx = dept_idx;
	}

	public void setPrms_dt(String prms_dt){
		this.prms_dt = prms_dt;
	}

	public void setFnd_type(String fnd_type){
		this.fnd_type = fnd_type;
	}

	public void setFnd_idx(String fnd_idx){
		this.fnd_idx = fnd_idx;
	}

	public void setSpprt_type(String spprt_type){
		this.spprt_type = spprt_type;
	}

	public void setSpprt_idx(String spprt_idx){
		this.spprt_idx = spprt_idx;
	}

	public void setUse_orgnl(String use_orgnl){
		this.use_orgnl = use_orgnl;
	}

	public void setCntor_memo(String cntor_memo){
		this.cntor_memo = cntor_memo;
	}

	public void setPrms_memo(String prms_memo){
		this.prms_memo = prms_memo;
	}

	public void setPrms_amt(String prms_amt){
		this.prms_amt = prms_amt;
	}

	public void setPmnth_cd(String pmnth_cd){
		this.pmnth_cd = pmnth_cd;
	}

	public void setPmnth_type(String pmnth_type){
		this.pmnth_type = pmnth_type;
	}

	public void setPrtn_type(String prtn_type){
		this.prtn_type = prtn_type;
	}

	public void setMon_pay_day(String mon_pay_day){
		this.mon_pay_day = mon_pay_day;
	}

	public void setMon_pay_amt(String mon_pay_amt){
		this.mon_pay_amt = mon_pay_amt;
	}

	public void setPrtn_cnt(String prtn_cnt){
		this.prtn_cnt = prtn_cnt;
	}

	public void setPay_frdt(String pay_frdt){
		this.pay_frdt = pay_frdt;
	}

	public void setPay_todt(String pay_todt){
		this.pay_todt = pay_todt;
	}

	public void setCms_bnk_cd(String cms_bnk_cd){
		this.cms_bnk_cd = cms_bnk_cd;
	}

	public void setCms_bnk_acnt(String cms_bnk_acnt){
		this.cms_bnk_acnt = cms_bnk_acnt;
	}

	public void setCms_bnk_owner(String cms_bnk_owner){
		this.cms_bnk_owner = cms_bnk_owner;
	}

	public void setCms_regno(String cms_regno){
		this.cms_regno = cms_regno;
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

	public void setTrns_dt(String trns_dt){
		this.trns_dt = trns_dt;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setPayth_cd(String payth_cd){
		this.payth_cd = payth_cd;
	}

	public void setPayth_type(String payth_type){
		this.payth_type = payth_type;
	}

	public void setMemb_cd(String memb_cd){
		this.memb_cd = memb_cd;
	}

	public void setPrms_cd(String prms_cd){
		this.prms_cd = prms_cd;
	}

	public void setPmnt_cd(String pmnt_cd){
		this.pmnt_cd = pmnt_cd;
	}

	public void setMemb_idx(String memb_idx){
		this.memb_idx = memb_idx;
	}

	public void setPrms_idx(String prms_idx){
		this.prms_idx = prms_idx;
	}

	public void setPmnt_idx(String pmnt_idx){
		this.pmnt_idx = pmnt_idx;
	}

	public void setPurp_memo(String purp_memo){
		this.purp_memo = purp_memo;
	}

	public void setPre_memb_cd(String pre_memb_cd){
		this.pre_memb_cd = pre_memb_cd;
	}

	public void setPre_prms_cd(String pre_prms_cd){
		this.pre_prms_cd = pre_prms_cd;
	}

	public void setPre_pmnt_cd(String pre_pmnt_cd){
		this.pre_pmnt_cd = pre_pmnt_cd;
	}

	public void setPre_memb_idx(String pre_memb_idx){
		this.pre_memb_idx = pre_memb_idx;
	}

	public void setPre_prms_idx(String pre_prms_idx){
		this.pre_prms_idx = pre_prms_idx;
	}

	public void setPre_pmnt_idx(String pre_pmnt_idx){
		this.pre_pmnt_idx = pre_pmnt_idx;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getOnl_memb_idx(){
		return this.onl_memb_idx;
	}

	public String getOnl_memb_cd(){
		return this.onl_memb_cd;
	}

	public String getOnl_prms_idx(){
		return this.onl_prms_idx;
	}

	public String getOnl_prms_cd(){
		return this.onl_prms_cd;
	}

	public String getOnl_pmnt_idx(){
		return this.onl_pmnt_idx;
	}

	public String getOnl_pmnt_cd(){
		return this.onl_pmnt_cd;
	}

	public String getName(){
		return this.name;
	}

	public String getAnymus(){
		return this.anymus;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getMemb_g_cd(){
		return this.memb_g_cd;
	}

	public String getBrtd_type(){
		return this.brtd_type;
	}

	public String getBrt_dt(){
		return this.brt_dt;
	}

	public String getDept(){
		return this.dept;
	}

	public String getTitle(){
		return this.title;
	}

	public String getPhone(){
		return this.phone;
	}

	public String getPost_clsf(){
		return this.post_clsf;
	}

	public String getUse_addr(){
		return this.use_addr;
	}

	public String getAddr_type(){
		return this.addr_type;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtl_addr(){
		return this.dtl_addr;
	}

	public String getEmail(){
		return this.email;
	}

	public String getEmail2(){
		return this.email2;
	}

	public String getPaswd(){
		return this.paswd;
	}

	public String getMemb_memo(){
		return this.memb_memo;
	}

	public String getRltn_info(){
		return this.rltn_info;
	}

	public String getDept_idx(){
		return this.dept_idx;
	}

	public String getPrms_dt(){
		return this.prms_dt;
	}

	public String getFnd_type(){
		return this.fnd_type;
	}

	public String getFnd_idx(){
		return this.fnd_idx;
	}

	public String getSpprt_type(){
		return this.spprt_type;
	}

	public String getSpprt_idx(){
		return this.spprt_idx;
	}

	public String getUse_orgnl(){
		return this.use_orgnl;
	}

	public String getCntor_memo(){
		return this.cntor_memo;
	}

	public String getPrms_memo(){
		return this.prms_memo;
	}

	public String getPrms_amt(){
		return this.prms_amt;
	}

	public String getPmnth_cd(){
		return this.pmnth_cd;
	}

	public String getPmnth_type(){
		return this.pmnth_type;
	}

	public String getPrtn_type(){
		return this.prtn_type;
	}

	public String getMon_pay_day(){
		return this.mon_pay_day;
	}

	public String getMon_pay_amt(){
		return this.mon_pay_amt;
	}

	public String getPrtn_cnt(){
		return this.prtn_cnt;
	}

	public String getPay_frdt(){
		return this.pay_frdt;
	}

	public String getPay_todt(){
		return this.pay_todt;
	}

	public String getCms_bnk_cd(){
		return this.cms_bnk_cd;
	}

	public String getCms_bnk_acnt(){
		return this.cms_bnk_acnt;
	}

	public String getCms_bnk_owner(){
		return this.cms_bnk_owner;
	}

	public String getCms_regno(){
		return this.cms_regno;
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

	public String getTrns_dt(){
		return this.trns_dt;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getFee(){
		return this.fee;
	}

	public String getPayth_cd(){
		return this.payth_cd;
	}

	public String getPayth_type(){
		return this.payth_type;
	}

	public String getMemb_cd(){
		return this.memb_cd;
	}

	public String getPrms_cd(){
		return this.prms_cd;
	}

	public String getPmnt_cd(){
		return this.pmnt_cd;
	}

	public String getMemb_idx(){
		return this.memb_idx;
	}

	public String getPrms_idx(){
		return this.prms_idx;
	}

	public String getPmnt_idx(){
		return this.pmnt_idx;
	}

	public String getPurp_memo(){
		return this.purp_memo;
	}

	public String getPre_memb_cd(){
		return this.pre_memb_cd;
	}

	public String getPre_prms_cd(){
		return this.pre_prms_cd;
	}

	public String getPre_pmnt_cd(){
		return this.pre_pmnt_cd;
	}

	public String getPre_memb_idx(){
		return this.pre_memb_idx;
	}

	public String getPre_prms_idx(){
		return this.pre_prms_idx;
	}

	public String getPre_pmnt_idx(){
		return this.pre_pmnt_idx;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.onl_memb_idx = Util.checkString(cstmt.getString(7));
		this.onl_memb_cd = Util.checkString(cstmt.getString(8));
		this.onl_prms_idx = Util.checkString(cstmt.getString(9));
		this.onl_prms_cd = Util.checkString(cstmt.getString(10));
		this.onl_pmnt_idx = Util.checkString(cstmt.getString(11));
		this.onl_pmnt_cd = Util.checkString(cstmt.getString(12));
		this.name = Util.checkString(cstmt.getString(13));
		this.anymus = Util.checkString(cstmt.getString(14));
		this.tel_no = Util.checkString(cstmt.getString(15));
		this.regno = Util.checkString(cstmt.getString(16));
		this.memb_g_cd = Util.checkString(cstmt.getString(17));
		this.brtd_type = Util.checkString(cstmt.getString(18));
		this.brt_dt = Util.checkString(cstmt.getString(19));
		this.dept = Util.checkString(cstmt.getString(20));
		this.title = Util.checkString(cstmt.getString(21));
		this.phone = Util.checkString(cstmt.getString(22));
		this.post_clsf = Util.checkString(cstmt.getString(23));
		this.use_addr = Util.checkString(cstmt.getString(24));
		this.addr_type = Util.checkString(cstmt.getString(25));
		this.zip = Util.checkString(cstmt.getString(26));
		this.addr = Util.checkString(cstmt.getString(27));
		this.dtl_addr = Util.checkString(cstmt.getString(28));
		this.email = Util.checkString(cstmt.getString(29));
		this.email2 = Util.checkString(cstmt.getString(30));
		this.paswd = Util.checkString(cstmt.getString(31));
		this.memb_memo = Util.checkString(cstmt.getString(32));
		this.rltn_info = Util.checkString(cstmt.getString(33));
		this.dept_idx = Util.checkString(cstmt.getString(34));
		this.prms_dt = Util.checkString(cstmt.getString(35));
		this.fnd_type = Util.checkString(cstmt.getString(36));
		this.fnd_idx = Util.checkString(cstmt.getString(37));
		this.spprt_type = Util.checkString(cstmt.getString(38));
		this.spprt_idx = Util.checkString(cstmt.getString(39));
		this.use_orgnl = Util.checkString(cstmt.getString(40));
		this.cntor_memo = Util.checkString(cstmt.getString(41));
		this.prms_memo = Util.checkString(cstmt.getString(42));
		this.prms_amt = Util.checkString(cstmt.getString(43));
		this.pmnth_cd = Util.checkString(cstmt.getString(44));
		this.pmnth_type = Util.checkString(cstmt.getString(45));
		this.prtn_type = Util.checkString(cstmt.getString(46));
		this.mon_pay_day = Util.checkString(cstmt.getString(47));
		this.mon_pay_amt = Util.checkString(cstmt.getString(48));
		this.prtn_cnt = Util.checkString(cstmt.getString(49));
		this.pay_frdt = Util.checkString(cstmt.getString(50));
		this.pay_todt = Util.checkString(cstmt.getString(51));
		this.cms_bnk_cd = Util.checkString(cstmt.getString(52));
		this.cms_bnk_acnt = Util.checkString(cstmt.getString(53));
		this.cms_bnk_owner = Util.checkString(cstmt.getString(54));
		this.cms_regno = Util.checkString(cstmt.getString(55));
		this.card_cmpy = Util.checkString(cstmt.getString(56));
		this.card_num = Util.checkString(cstmt.getString(57));
		this.card_yymm = Util.checkString(cstmt.getString(58));
		this.mobl_aprv_nm = Util.checkString(cstmt.getString(59));
		this.mobl_aprv_cmpy = Util.checkString(cstmt.getString(60));
		this.mobl_aprv_num = Util.checkString(cstmt.getString(61));
		this.mobl_aprv_prn = Util.checkString(cstmt.getString(62));
		this.trns_dt = Util.checkString(cstmt.getString(63));
		this.pay_dt = Util.checkString(cstmt.getString(64));
		this.pay_amt = Util.checkString(cstmt.getString(65));
		this.fee = Util.checkString(cstmt.getString(66));
		this.payth_cd = Util.checkString(cstmt.getString(67));
		this.payth_type = Util.checkString(cstmt.getString(68));
		this.memb_cd = Util.checkString(cstmt.getString(69));
		this.prms_cd = Util.checkString(cstmt.getString(70));
		this.pmnt_cd = Util.checkString(cstmt.getString(71));
		this.memb_idx = Util.checkString(cstmt.getString(72));
		this.prms_idx = Util.checkString(cstmt.getString(73));
		this.pmnt_idx = Util.checkString(cstmt.getString(74));
		this.purp_memo = Util.checkString(cstmt.getString(75));
		this.pre_memb_cd = Util.checkString(cstmt.getString(76));
		this.pre_prms_cd = Util.checkString(cstmt.getString(77));
		this.pre_pmnt_cd = Util.checkString(cstmt.getString(78));
		this.pre_memb_idx = Util.checkString(cstmt.getString(79));
		this.pre_prms_idx = Util.checkString(cstmt.getString(80));
		this.pre_pmnt_idx = Util.checkString(cstmt.getString(81));
		ResultSet rset0 = (ResultSet) cstmt.getObject(82);
		while(rset0.next()){
			TN_LNK_1020_SCURLISTRecord rec = new TN_LNK_1020_SCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.idx = Util.checkString(rset0.getString("idx"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_1020_SDataSet ds = (TN_LNK_1020_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_1020_SCURLISTRecord curlistRec = (TN_LNK_1020_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getOnl_memb_idx()%>
<%= ds.getOnl_memb_cd()%>
<%= ds.getOnl_prms_idx()%>
<%= ds.getOnl_prms_cd()%>
<%= ds.getOnl_pmnt_idx()%>
<%= ds.getOnl_pmnt_cd()%>
<%= ds.getName()%>
<%= ds.getAnymus()%>
<%= ds.getTel_no()%>
<%= ds.getRegno()%>
<%= ds.getMemb_g_cd()%>
<%= ds.getBrtd_type()%>
<%= ds.getBrt_dt()%>
<%= ds.getDept()%>
<%= ds.getTitle()%>
<%= ds.getPhone()%>
<%= ds.getPost_clsf()%>
<%= ds.getUse_addr()%>
<%= ds.getAddr_type()%>
<%= ds.getZip()%>
<%= ds.getAddr()%>
<%= ds.getDtl_addr()%>
<%= ds.getEmail()%>
<%= ds.getEmail2()%>
<%= ds.getPaswd()%>
<%= ds.getMemb_memo()%>
<%= ds.getRltn_info()%>
<%= ds.getDept_idx()%>
<%= ds.getPrms_dt()%>
<%= ds.getFnd_type()%>
<%= ds.getFnd_idx()%>
<%= ds.getSpprt_type()%>
<%= ds.getSpprt_idx()%>
<%= ds.getUse_orgnl()%>
<%= ds.getCntor_memo()%>
<%= ds.getPrms_memo()%>
<%= ds.getPrms_amt()%>
<%= ds.getPmnth_cd()%>
<%= ds.getPmnth_type()%>
<%= ds.getPrtn_type()%>
<%= ds.getMon_pay_day()%>
<%= ds.getMon_pay_amt()%>
<%= ds.getPrtn_cnt()%>
<%= ds.getPay_frdt()%>
<%= ds.getPay_todt()%>
<%= ds.getCms_bnk_cd()%>
<%= ds.getCms_bnk_acnt()%>
<%= ds.getCms_bnk_owner()%>
<%= ds.getCms_regno()%>
<%= ds.getCard_cmpy()%>
<%= ds.getCard_num()%>
<%= ds.getCard_yymm()%>
<%= ds.getMobl_aprv_nm()%>
<%= ds.getMobl_aprv_cmpy()%>
<%= ds.getMobl_aprv_num()%>
<%= ds.getMobl_aprv_prn()%>
<%= ds.getTrns_dt()%>
<%= ds.getPay_dt()%>
<%= ds.getPay_amt()%>
<%= ds.getFee()%>
<%= ds.getPayth_cd()%>
<%= ds.getPayth_type()%>
<%= ds.getMemb_cd()%>
<%= ds.getPrms_cd()%>
<%= ds.getPmnt_cd()%>
<%= ds.getMemb_idx()%>
<%= ds.getPrms_idx()%>
<%= ds.getPmnt_idx()%>
<%= ds.getPurp_memo()%>
<%= ds.getPre_memb_cd()%>
<%= ds.getPre_prms_cd()%>
<%= ds.getPre_pmnt_cd()%>
<%= ds.getPre_memb_idx()%>
<%= ds.getPre_prms_idx()%>
<%= ds.getPre_pmnt_idx()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.idx%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 24 16:01:40 KST 2016 */