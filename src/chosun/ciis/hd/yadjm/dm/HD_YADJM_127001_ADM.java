

package chosun.ciis.hd.yadjm.dm;

import java.sql.*;

import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_127001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String add_file_nm1;
	public byte[] add_file1;
	public String flag;
	
	 

	public String doc_type;	
	public String seq;
	public String att_year;
	public String form_cd;	
	public String resid;
	public String name;
	public String dat_cd;
	public String busnid;
	public String trade_nm;
	public String acc_no;
	public String use_place_cd;
	public String donation_cd;
	public String course_cd;
	public String subject_nm;
	public String start_dt;
	public String end_dt;
	public String com_cd;
	public String pension_cd;
	public String goods_nm;
	public String lend_dt;
	public String lend_kd;
	public String house_take_dt;
	public String mort_setup_dt;
	public String repay_years;
	public String lend_goods_nm;
	public String debt;
	public String fixed_rate_debt;
	public String not_defer_debt;
	public String this_year_rede_amt;
	public String saving_gubn;
	public String reg_dt;
	public String pay_method;
	public String insu1_resid;
	public String insu1_nm;
	public String insu2_resid1;
	public String insu2_nm1;
	public String insu2_resid2;
	public String insu2_nm2;
	public String insu2_resid3;
	public String insu2_nm3;
	public String amt;
	public String sum;
	public String mm;
	public String dd;
	public String fix_cd;
	public String date;
	public String annual;
	public String sum_y1;
	public String sum_y2;
	public String sum_y3;
	public String ddct;
	public byte[] add_file;
	
	
	
	
	
	public HD_YADJM_127001_ADM(){}
	public HD_YADJM_127001_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String incmg_pers, String incmg_pers_ip, String add_file_nm1, byte[] add_file1, String xml, String flag, String doc_type, String seq, String att_year, String form_cd,	String resid, String name, String dat_cd, String busnid, String trade_nm, String acc_no, String use_place_cd, String donation_cd, String course_cd, String subject_nm, String start_dt, String end_dt, String com_cd, String pension_cd, String goods_nm, String lend_dt, String lend_kd, String house_take_dt, String mort_setup_dt, String repay_years, String lend_goods_nm, String debt, String fixed_rate_debt, String not_defer_debt, String this_year_rede_amt, String saving_gubn, String reg_dt, String pay_method, String insu1_resid, String insu1_nm, String insu2_resid1, String insu2_nm1, String insu2_resid2, String insu2_nm2, String insu2_resid3, String insu2_nm3, String amt, String sum, String mm, String dd, String fix_cd, String date, String annual,String sum_y1, String sum_y2, String sum_y3, String ddct, byte[] add_file){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.add_file_nm1 = add_file_nm1;
		this.add_file1 = add_file1;
		this.flag = flag;
		this.doc_type = doc_type;
		this.seq = seq;
		this.att_year = att_year;
		this.form_cd = form_cd;
		this.resid = resid;
		this.name = name;
		this.dat_cd = dat_cd;
		this.busnid	= busnid;
		this.trade_nm = trade_nm;
		this.acc_no = acc_no;
		this.use_place_cd = use_place_cd;
		this.donation_cd = donation_cd;
		this.course_cd = course_cd;
		this.subject_nm = subject_nm;
		this.start_dt = start_dt;
		this.end_dt = end_dt;
		this.com_cd = com_cd;
		this.pension_cd = pension_cd;
		this.goods_nm = goods_nm;
		this.lend_dt = lend_dt;
		this.lend_kd = lend_kd;
		this.house_take_dt = house_take_dt;
		this.mort_setup_dt = mort_setup_dt;
		this.repay_years = repay_years;
		this.lend_goods_nm = lend_goods_nm;
		this.debt = debt;
		this.fixed_rate_debt = fixed_rate_debt;
		this.not_defer_debt = not_defer_debt;
		this.this_year_rede_amt = this_year_rede_amt;
		this.saving_gubn = saving_gubn;
		this.reg_dt = reg_dt;
		this.pay_method = pay_method;
		this.insu1_resid = insu1_resid;
		this.insu1_nm = insu1_nm;
		this.insu2_resid1 = insu2_resid1;
		this.insu2_nm1 = insu2_nm1;
		this.insu2_resid2 = insu2_resid2;
		this.insu2_nm2 = insu2_nm2;
		this.insu2_resid3 = insu2_resid3;
		this.insu2_nm3 = insu2_nm3;
		this.amt = amt;
		this.sum = sum;
		this.mm = mm;
		this.dd = dd;
		this.fix_cd = fix_cd;
		this.date = date;
		this.annual = annual;
		this.sum_y1 = sum_y1;
		this.sum_y2 = sum_y2;
		this.sum_y3 = sum_y3;
		this.ddct = ddct;
		this.add_file = add_file;
		
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}
	
	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAdd_file_nm1(String add_file_nm1){
		this.add_file_nm1 = add_file_nm1;
	}

	public void setAdd_file1(byte[] add_file1){
		this.add_file1 = add_file1;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}
	
	public void setDoc_type(String doc_type){
		this.doc_type = doc_type;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAtt_year(String att_year){
		this.att_year = att_year;
	}

	public void setForm_cd(String form_cd){
		this.form_cd = form_cd;
	}

	public void setResid(String resid){
		this.resid = resid;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setDat_cd(String dat_cd){
		this.dat_cd = dat_cd;
	}

	public void setBusnid(String busnid){
		this.busnid = busnid;
	}

	public void setTrade_nm(String trade_nm){
		this.trade_nm = trade_nm;
	}
	
	public void setAcc_no(String acc_no){
		this.acc_no = acc_no;
	}

	public void setUse_place_cd(String use_place_cd){
		this.use_place_cd = use_place_cd;
	}

	public void setDonation_cd(String donation_cd){
		this.donation_cd = donation_cd;
	}

	public void setCourse_cd(String course_cd){
		this.course_cd = course_cd;
	}

	public void setSubject_nm(String subject_nm){
		this.subject_nm = subject_nm;
	}

	public void setStart_dt(String start_dt){
		this.start_dt = start_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setCom_cd(String com_cd){
		this.com_cd = com_cd;
	}

	public void setPension_cd(String pension_cd){
		this.pension_cd = pension_cd;
	}

	public void setGoods_nm(String goods_nm){
		this.goods_nm = goods_nm;
	}

	public void setLend_dt(String lend_dt){
		this.lend_dt = lend_dt;
	}

	public void setLend_kd(String lend_kd){
		this.lend_kd = lend_kd;
	}

	public void setHouse_take_dt(String house_take_dt){
		this.house_take_dt = house_take_dt;
	}

	public void setMort_setup_dt(String mort_setup_dt){
		this.mort_setup_dt = mort_setup_dt;
	}

	public void setRepay_years(String repay_years){
		this.repay_years = repay_years;
	}

	public void setLend_goods_nm(String lend_goods_nm){
		this.lend_goods_nm = lend_goods_nm;
	}

	public void setDebt(String debt){
		this.debt = debt;
	}

	public void setFixed_rate_debt(String fixed_rate_debt){
		this.fixed_rate_debt = fixed_rate_debt;
	}

	public void setNot_defer_debt(String not_defer_debt){
		this.not_defer_debt = not_defer_debt;
	}

	public void setThis_year_rede_amt(String this_year_rede_amt){
		this.this_year_rede_amt = this_year_rede_amt;
	}

	public void setSaving_gubn(String saving_gubn){
		this.saving_gubn = saving_gubn;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setPay_method(String pay_method){
		this.pay_method = pay_method;
	}

	public void setInsu1_resid(String insu1_resid){
		this.insu1_resid = insu1_resid;
	}

	public void setInsu1_nm(String insu1_nm){
		this.insu1_nm = insu1_nm;
	}

	public void setInsu2_resid1(String insu2_resid1){
		this.insu2_resid1 = insu2_resid1;
	}

	public void setInsu2_nm1(String insu2_nm1){
		this.insu2_nm1 = insu2_nm1;
	}

	public void setInsu2_resid2(String insu2_resid2){
		this.insu2_resid2 = insu2_resid2;
	}

	public void setInsu2_nm2(String insu2_nm2){
		this.insu2_nm2 = insu2_nm2;
	}
	
	public void setInsu2_resid3(String insu2_resid3){
		this.insu2_resid3 = insu2_resid3;
	}

	public void setInsu2_nm3(String insu2_nm3){
		this.insu2_nm3 = insu2_nm3;
	}
	
	public void setAmt(String amt){
		this.amt = amt;
	}
	
	public void setSum(String sum){
		this.sum = sum;
	}

	public void setMm(String mm){
		this.mm = mm;
	}

	public void setDd(String dd){
		this.dd = dd;
	}
	
	public void setFix_cd(String fix_cd){
		this.fix_cd = fix_cd;
	}
	
	public void setDate(String date){
		this.date = date;
	}

	public void setAnnual(String annual){
		this.annual = annual;
	}
	
	public void setSum_y1(String sum_y1){
		this.sum_y1 = sum_y1;
	}

	public void setSum_y2(String sum_y2){
		this.sum_y2 = sum_y2;
	}

	public void setSum_y3(String sum_y3){
		this.sum_y3 = sum_y3;
	}

	public void setDdct(String ddct){
		this.ddct = ddct;
	}

	public void setAdd_file(byte[] add_file){
		this.add_file = add_file;
	}
	
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getAdd_file_nm1(){
		return this.add_file_nm1;
	}

	public byte[] getAdd_file1(){
		return this.add_file1;
	}
	
	public String getFlag(){
		return this.flag;
	}
	
	public String getDoc_type(){
		return this.doc_type;
	}
	
	public String getSeq(){
		return this.seq;
	}
	
	public String getAtt_year(){
		return this.att_year;
	}
	
	public String getForm_cd(){
		return this.form_cd;
	}

	public String getResid(){
		return this.resid;
	}

	public String getName(){
		return this.name;
	}

	public String getDat_cd(){
		return this.dat_cd;
	}

	public String getBusnid(){
		return this.busnid;
	}

	public String getTrade_nm(){
		return this.trade_nm;
	}
	
	public String getAcc_no(){
		return this.acc_no;
	}

	public String getUse_place_cd(){
		return this.use_place_cd;
	}

	public String getDonation_cd(){
		return this.donation_cd;
	}

	public String getCourse_cd(){
		return this.course_cd;
	}

	public String getSubject_nm(){
		return this.subject_nm;
	}

	public String getStart_dt(){
		return this.start_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getCom_cd(){
		return this.com_cd;
	}

	public String getPension_cd(){
		return this.pension_cd;
	}

	public String getGoods_nm(){
		return this.goods_nm;
	}

	public String getLend_dt(){
		return this.lend_dt;
	}

	public String getLend_kd(){
		return this.lend_kd;
	}

	public String getHouse_take_dt(){
		return this.house_take_dt;
	}

	public String getMort_setup_dt(){
		return this.mort_setup_dt;
	}

	public String getRepay_years(){
		return this.repay_years;
	}

	public String getLend_goods_nm(){
		return this.lend_goods_nm;
	}

	public String getDebt(){
		return this.debt;
	}

	public String getFixed_rate_debt(){
		return this.fixed_rate_debt;
	}

	public String getNot_defer_debt(){
		return this.not_defer_debt;
	}

	public String getThis_year_rede_amt(){
		return this.this_year_rede_amt;
	}

	public String getSaving_gubn(){
		return this.saving_gubn;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getPay_method(){
		return this.pay_method;
	}

	public String getInsu1_resid(){
		return this.insu1_resid;
	}

	public String getInsu1_nm(){
		return this.insu1_nm;
	}

	public String getInsu2_resid1(){
		return this.insu2_resid1;
	}

	public String getInsu2_nm1(){
		return this.insu2_nm1;
	}

	public String getInsu2_resid2(){
		return this.insu2_resid2;
	}

	public String getInsu2_nm2(){
		return this.insu2_nm2;
	}

	public String getInsu2_resid3(){
		return this.insu2_resid3;
	}

	public String getInsu2_nm3(){
		return this.insu2_nm3;
	}
	
	public String getAmt(){
		return this.amt;
	}
	
	public String getSum(){
		return this.sum;
	}
	
	public String getMm(){
		return this.mm;
	}

	public String getDd(){
		return this.dd;
	}
	
	public String getFix_cd(){
		return this.fix_cd;
	}
	
	public String getDate(){
		return this.date;
	}

	public String getAnnual(){
		return this.annual;
	}
	
	public String getSum_y1(){
		return this.sum_y1;
	}

	public String getSum_y2(){
		return this.sum_y2;
	}

	public String getSum_y3(){
		return this.sum_y3;
	}

	public String getDdct(){
		return this.ddct;
	}

	public byte[] getAdd_file(){
		return this.add_file;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_127001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_127001_ADM dm = (HD_YADJM_127001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.incmg_pers_ip);
		cstmt.setString(8, dm.add_file_nm1);
		cstmt.setBytes(9, "0101".getBytes());
		cstmt.setString(10, dm.doc_type);
		cstmt.setString(11, dm.seq);
		cstmt.setString(12, dm.att_year);
		cstmt.setString(13, dm.form_cd);
		cstmt.setString(14, dm.resid);
		cstmt.setString(15, dm.name);
		cstmt.setString(16, dm.dat_cd);
		cstmt.setString(17, dm.busnid);
		cstmt.setString(18, dm.trade_nm);
		cstmt.setString(19, dm.acc_no);
		cstmt.setString(20, dm.use_place_cd);
		cstmt.setString(21, dm.donation_cd);
		cstmt.setString(22, dm.course_cd);
		cstmt.setString(23, dm.subject_nm);
		cstmt.setString(24, dm.start_dt);
		cstmt.setString(25, dm.end_dt);
		cstmt.setString(26, dm.com_cd);
		cstmt.setString(27, dm.pension_cd);
		cstmt.setString(28, dm.goods_nm);
		cstmt.setString(29, dm.lend_dt);
		cstmt.setString(30, dm.lend_kd);
		cstmt.setString(31, dm.house_take_dt);
		cstmt.setString(32, dm.mort_setup_dt);
		cstmt.setString(33, dm.repay_years);
		cstmt.setString(34, dm.lend_goods_nm);
		cstmt.setString(35, dm.debt);
		cstmt.setString(36, dm.fixed_rate_debt);
		cstmt.setString(37, dm.not_defer_debt);
		cstmt.setString(38, dm.this_year_rede_amt);
		cstmt.setString(39, dm.saving_gubn);
		cstmt.setString(40, dm.reg_dt);
		cstmt.setString(41, dm.pay_method);
		cstmt.setString(42, dm.insu1_resid);
		cstmt.setString(43, dm.insu1_nm);
		cstmt.setString(44, dm.insu2_resid1);
		cstmt.setString(45, dm.insu2_nm1);
		cstmt.setString(46, dm.insu2_resid2);
		cstmt.setString(47, dm.insu2_nm2);
		cstmt.setString(48, dm.insu2_resid2);
		cstmt.setString(49, dm.insu2_nm2);
		cstmt.setString(50, dm.amt);
		cstmt.setString(51, dm.sum);
		cstmt.setString(52, dm.mm);
		cstmt.setString(53, dm.dd);
		cstmt.setString(54, dm.fix_cd);
		cstmt.setString(55, dm.date);
		cstmt.setString(56, dm.annual);
		cstmt.setString(57, dm.sum_y1);
		cstmt.setString(58, dm.sum_y2);
		cstmt.setString(59, dm.sum_y3);
		cstmt.setString(60, dm.ddct);
		cstmt.setString(61, dm.flag);
	}
		
	

	public BaseDataSet createDataSetObject(){
		return new HD_YADJM_127001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("add_file_nm1 = [" + getAdd_file_nm1() + "]");
		System.out.println("add_file1 = [" + getAdd_file1() + "]");
		System.out.println("doc_type = [" + getDoc_type() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("att_year = [" + getAtt_year() + "]");
		System.out.println("form_cd = [" + getForm_cd() + "]");
		System.out.println("resid = [" + getResid() + "]");
		System.out.println("name = [" + getName() + "]");
		System.out.println("dat_cd = [" + getDat_cd() + "]");
		System.out.println("busnid = [" + getBusnid() + "]");
		System.out.println("trade_nm = [" + getTrade_nm() + "]");
		System.out.println("acc_no = [" + getAcc_no() + "]");
		System.out.println("use_place_cd = [" + getUse_place_cd() + "]");
		System.out.println("donation_cd = [" + getDonation_cd() + "]");
		System.out.println("course_cd = [" + getCourse_cd() + "]");
		System.out.println("subject_nm = [" + getSubject_nm() + "]");
		System.out.println("start_dt = [" + getStart_dt() + "]");
		System.out.println("end_dt = [" + getEnd_dt() + "]");
		System.out.println("com_cd = [" + getCom_cd() + "]");
		System.out.println("pension_cd = [" + getPension_cd() + "]");
		System.out.println("goods_nm = [" + getGoods_nm() + "]");
		System.out.println("lend_dt = [" + getLend_dt() + "]");
		System.out.println("lend_kd = [" + getLend_kd() + "]");
		System.out.println("house_take_dt = [" + getHouse_take_dt() + "]");
		System.out.println("mort_setup_dt = [" + getMort_setup_dt() + "]");
		System.out.println("repay_years = [" + getRepay_years() + "]");
		System.out.println("lend_goods_nm = [" + getLend_goods_nm() + "]");
		System.out.println("debt = [" + getDebt() + "]");
		System.out.println("fixed_rate_debt = [" + getFixed_rate_debt() + "]");
		System.out.println("not_defer_debt = [" + getNot_defer_debt() + "]");
		System.out.println("this_year_rede_amt = [" + getThis_year_rede_amt() + "]");
		System.out.println("saving_gubn = [" + getSaving_gubn() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("pay_method = [" + getPay_method() + "]");
		System.out.println("insu1_resid = [" + getInsu1_resid() + "]");
		System.out.println("insu1_nm = [" + getInsu1_nm() + "]");
		System.out.println("insu2_resid1 = [" + getInsu2_resid1() + "]");
		System.out.println("insu2_nm1 = [" + getInsu2_nm1() + "]");
		System.out.println("insu2_resid2 = [" + getInsu2_resid2() + "]");
		System.out.println("insu2_nm2 = [" + getInsu2_nm2() + "]");
		System.out.println("insu2_resid3 = [" + getInsu2_resid3() + "]");
		System.out.println("insu2_nm3 = [" + getInsu2_nm3() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("sum = [" + getSum() + "]");
		System.out.println("mm = [" + getMm() + "]");
		System.out.println("dd = [" + getDd() + "]");
		System.out.println("fix_cd = [" + getFix_cd() + "]");
		System.out.println("date = [" + getDate() + "]");
		System.out.println("annual = [" + getAnnual() + "]");
		System.out.println("sum_y1 = [" + getSum_y1() + "]");
		System.out.println("sum_y2 = [" + getSum_y2() + "]");
		System.out.println("sum_y3 = [" + getSum_y3() + "]");
		System.out.println("ddct = [" + getDdct() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("add_file = [" + getAdd_file() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String end_dt = req.getParameter("end_dt");
if( end_dt == null){
	System.out.println(this.toString+" : end_dt is null" );
}else{
	System.out.println(this.toString+" : end_dt is "+end_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEnd_dt(end_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 27 14:14:12 KST 2011 */

