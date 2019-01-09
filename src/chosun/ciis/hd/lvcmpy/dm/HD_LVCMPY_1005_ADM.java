/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1005_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String update_clsf;
	public String cmpy_cd;
	public String emp_no;
	public String lvcmpy_clsf;
	public String flnm;
	public String lvcmpy_dt;
	public String dept_cd;
	public String lvcmpy_fr;
	public String lvcmpy_to;
	public String join_year;
	public String year;
	public String day;
	public String mm_saly_1;
	public String mm_saly_2;
	public String mm_saly_3;
	public String mm_saly_4;
	public String sum_mm_saly;
	public String mm_alon_1;
	public String mm_alon_2;
	public String mm_alon_3;
	public String mm_alon_4;
	public String sum_mm_alon;
	public String mm_dty_acty_1;
	public String mm_dty_acty_2;
	public String mm_dty_acty_3;
	public String mm_dty_acty_4;
	public String sum_mm_dty_acty;
	public String saly_pay_dt;
	public String yymm_alon;
	public String avg_saly;
	public String lvcmpy_saly;
	public String lvcmpy_mm;
	public String lvcmpy_add_saly;
	public String sp_lvcmpy_add_saly;
	public String ym_avg_saly;
	public String year_vaca_dds;
	public String add_vaca_dds;
	public String tm_vaca_dds;
	public String total_vaca_dds;
	public String ym_avg_saly2;
	public String year_vaca_dds2;
	public String add_vaca_dds2;
	public String tm_vaca_dds2;
	public String total_vaca_dds2;
	public String vaca_saly;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String join_year_2012;
	public String join_year_2013;
	public String avg_wag_dt;

	public HD_LVCMPY_1005_ADM(){}
	public HD_LVCMPY_1005_ADM(String update_clsf, String cmpy_cd, String emp_no, String lvcmpy_clsf, String flnm, String lvcmpy_dt, String dept_cd, String lvcmpy_fr, String lvcmpy_to, String join_year, String year, String day, String mm_saly_1, String mm_saly_2, String mm_saly_3, String mm_saly_4, String sum_mm_saly, String mm_alon_1, String mm_alon_2, String mm_alon_3, String mm_alon_4, String sum_mm_alon, String mm_dty_acty_1, String mm_dty_acty_2, String mm_dty_acty_3, String mm_dty_acty_4, String sum_mm_dty_acty, String saly_pay_dt, String yymm_alon, String avg_saly, String lvcmpy_saly, String lvcmpy_mm, String lvcmpy_add_saly, String sp_lvcmpy_add_saly, String ym_avg_saly, String year_vaca_dds, String add_vaca_dds, String tm_vaca_dds, String total_vaca_dds, String ym_avg_saly2, String year_vaca_dds2, String add_vaca_dds2, String tm_vaca_dds2, String total_vaca_dds2, String vaca_saly, String incmg_pers_ipadd, String incmg_pers, String join_year_2012, String join_year_2013, String avg_wag_dt){
		this.update_clsf = update_clsf;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.lvcmpy_clsf = lvcmpy_clsf;
		this.flnm = flnm;
		this.lvcmpy_dt = lvcmpy_dt;
		this.dept_cd = dept_cd;
		this.lvcmpy_fr = lvcmpy_fr;
		this.lvcmpy_to = lvcmpy_to;
		this.join_year = join_year;
		this.year = year;
		this.day = day;
		this.mm_saly_1 = mm_saly_1;
		this.mm_saly_2 = mm_saly_2;
		this.mm_saly_3 = mm_saly_3;
		this.mm_saly_4 = mm_saly_4;
		this.sum_mm_saly = sum_mm_saly;
		this.mm_alon_1 = mm_alon_1;
		this.mm_alon_2 = mm_alon_2;
		this.mm_alon_3 = mm_alon_3;
		this.mm_alon_4 = mm_alon_4;
		this.sum_mm_alon = sum_mm_alon;
		this.mm_dty_acty_1 = mm_dty_acty_1;
		this.mm_dty_acty_2 = mm_dty_acty_2;
		this.mm_dty_acty_3 = mm_dty_acty_3;
		this.mm_dty_acty_4 = mm_dty_acty_4;
		this.sum_mm_dty_acty = sum_mm_dty_acty;
		this.saly_pay_dt = saly_pay_dt;
		this.yymm_alon = yymm_alon;
		this.avg_saly = avg_saly;
		this.lvcmpy_saly = lvcmpy_saly;
		this.lvcmpy_mm = lvcmpy_mm;
		this.lvcmpy_add_saly = lvcmpy_add_saly;
		this.sp_lvcmpy_add_saly = sp_lvcmpy_add_saly;
		this.ym_avg_saly = ym_avg_saly;
		this.year_vaca_dds = year_vaca_dds;
		this.add_vaca_dds = add_vaca_dds;
		this.tm_vaca_dds = tm_vaca_dds;
		this.total_vaca_dds = total_vaca_dds;
		this.ym_avg_saly2 = ym_avg_saly2;
		this.year_vaca_dds2 = year_vaca_dds2;
		this.add_vaca_dds2 = add_vaca_dds2;
		this.tm_vaca_dds2 = tm_vaca_dds2;
		this.total_vaca_dds2 = total_vaca_dds2;
		this.vaca_saly = vaca_saly;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.join_year_2012 = join_year_2012;
		this.join_year_2013 = join_year_2013;
		this.avg_wag_dt = avg_wag_dt;
	}

	public void setUpdate_clsf(String update_clsf){
		this.update_clsf = update_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLvcmpy_clsf(String lvcmpy_clsf){
		this.lvcmpy_clsf = lvcmpy_clsf;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setLvcmpy_fr(String lvcmpy_fr){
		this.lvcmpy_fr = lvcmpy_fr;
	}

	public void setLvcmpy_to(String lvcmpy_to){
		this.lvcmpy_to = lvcmpy_to;
	}

	public void setJoin_year(String join_year){
		this.join_year = join_year;
	}

	public void setYear(String year){
		this.year = year;
	}

	public void setDay(String day){
		this.day = day;
	}

	public void setMm_saly_1(String mm_saly_1){
		this.mm_saly_1 = mm_saly_1;
	}

	public void setMm_saly_2(String mm_saly_2){
		this.mm_saly_2 = mm_saly_2;
	}

	public void setMm_saly_3(String mm_saly_3){
		this.mm_saly_3 = mm_saly_3;
	}

	public void setMm_saly_4(String mm_saly_4){
		this.mm_saly_4 = mm_saly_4;
	}

	public void setSum_mm_saly(String sum_mm_saly){
		this.sum_mm_saly = sum_mm_saly;
	}

	public void setMm_alon_1(String mm_alon_1){
		this.mm_alon_1 = mm_alon_1;
	}

	public void setMm_alon_2(String mm_alon_2){
		this.mm_alon_2 = mm_alon_2;
	}

	public void setMm_alon_3(String mm_alon_3){
		this.mm_alon_3 = mm_alon_3;
	}

	public void setMm_alon_4(String mm_alon_4){
		this.mm_alon_4 = mm_alon_4;
	}

	public void setSum_mm_alon(String sum_mm_alon){
		this.sum_mm_alon = sum_mm_alon;
	}

	public void setMm_dty_acty_1(String mm_dty_acty_1){
		this.mm_dty_acty_1 = mm_dty_acty_1;
	}

	public void setMm_dty_acty_2(String mm_dty_acty_2){
		this.mm_dty_acty_2 = mm_dty_acty_2;
	}

	public void setMm_dty_acty_3(String mm_dty_acty_3){
		this.mm_dty_acty_3 = mm_dty_acty_3;
	}

	public void setMm_dty_acty_4(String mm_dty_acty_4){
		this.mm_dty_acty_4 = mm_dty_acty_4;
	}

	public void setSum_mm_dty_acty(String sum_mm_dty_acty){
		this.sum_mm_dty_acty = sum_mm_dty_acty;
	}

	public void setSaly_pay_dt(String saly_pay_dt){
		this.saly_pay_dt = saly_pay_dt;
	}

	public void setYymm_alon(String yymm_alon){
		this.yymm_alon = yymm_alon;
	}

	public void setAvg_saly(String avg_saly){
		this.avg_saly = avg_saly;
	}

	public void setLvcmpy_saly(String lvcmpy_saly){
		this.lvcmpy_saly = lvcmpy_saly;
	}

	public void setLvcmpy_mm(String lvcmpy_mm){
		this.lvcmpy_mm = lvcmpy_mm;
	}

	public void setLvcmpy_add_saly(String lvcmpy_add_saly){
		this.lvcmpy_add_saly = lvcmpy_add_saly;
	}

	public void setSp_lvcmpy_add_saly(String sp_lvcmpy_add_saly){
		this.sp_lvcmpy_add_saly = sp_lvcmpy_add_saly;
	}

	public void setYm_avg_saly(String ym_avg_saly){
		this.ym_avg_saly = ym_avg_saly;
	}

	public void setYear_vaca_dds(String year_vaca_dds){
		this.year_vaca_dds = year_vaca_dds;
	}

	public void setAdd_vaca_dds(String add_vaca_dds){
		this.add_vaca_dds = add_vaca_dds;
	}

	public void setTm_vaca_dds(String tm_vaca_dds){
		this.tm_vaca_dds = tm_vaca_dds;
	}

	public void setTotal_vaca_dds(String total_vaca_dds){
		this.total_vaca_dds = total_vaca_dds;
	}

	public void setYm_avg_saly2(String ym_avg_saly2){
		this.ym_avg_saly2 = ym_avg_saly2;
	}

	public void setYear_vaca_dds2(String year_vaca_dds2){
		this.year_vaca_dds2 = year_vaca_dds2;
	}

	public void setAdd_vaca_dds2(String add_vaca_dds2){
		this.add_vaca_dds2 = add_vaca_dds2;
	}

	public void setTm_vaca_dds2(String tm_vaca_dds2){
		this.tm_vaca_dds2 = tm_vaca_dds2;
	}

	public void setTotal_vaca_dds2(String total_vaca_dds2){
		this.total_vaca_dds2 = total_vaca_dds2;
	}

	public void setVaca_saly(String vaca_saly){
		this.vaca_saly = vaca_saly;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setJoin_year_2012(String join_year_2012){
		this.join_year_2012 = join_year_2012;
	}

	public void setJoin_year_2013(String join_year_2013){
		this.join_year_2013 = join_year_2013;
	}

	public void setAvg_wag_dt(String avg_wag_dt){
		this.avg_wag_dt = avg_wag_dt;
	}

	public String getUpdate_clsf(){
		return this.update_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLvcmpy_clsf(){
		return this.lvcmpy_clsf;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getLvcmpy_fr(){
		return this.lvcmpy_fr;
	}

	public String getLvcmpy_to(){
		return this.lvcmpy_to;
	}

	public String getJoin_year(){
		return this.join_year;
	}

	public String getYear(){
		return this.year;
	}

	public String getDay(){
		return this.day;
	}

	public String getMm_saly_1(){
		return this.mm_saly_1;
	}

	public String getMm_saly_2(){
		return this.mm_saly_2;
	}

	public String getMm_saly_3(){
		return this.mm_saly_3;
	}

	public String getMm_saly_4(){
		return this.mm_saly_4;
	}

	public String getSum_mm_saly(){
		return this.sum_mm_saly;
	}

	public String getMm_alon_1(){
		return this.mm_alon_1;
	}

	public String getMm_alon_2(){
		return this.mm_alon_2;
	}

	public String getMm_alon_3(){
		return this.mm_alon_3;
	}

	public String getMm_alon_4(){
		return this.mm_alon_4;
	}

	public String getSum_mm_alon(){
		return this.sum_mm_alon;
	}

	public String getMm_dty_acty_1(){
		return this.mm_dty_acty_1;
	}

	public String getMm_dty_acty_2(){
		return this.mm_dty_acty_2;
	}

	public String getMm_dty_acty_3(){
		return this.mm_dty_acty_3;
	}

	public String getMm_dty_acty_4(){
		return this.mm_dty_acty_4;
	}

	public String getSum_mm_dty_acty(){
		return this.sum_mm_dty_acty;
	}

	public String getSaly_pay_dt(){
		return this.saly_pay_dt;
	}

	public String getYymm_alon(){
		return this.yymm_alon;
	}

	public String getAvg_saly(){
		return this.avg_saly;
	}

	public String getLvcmpy_saly(){
		return this.lvcmpy_saly;
	}

	public String getLvcmpy_mm(){
		return this.lvcmpy_mm;
	}

	public String getLvcmpy_add_saly(){
		return this.lvcmpy_add_saly;
	}

	public String getSp_lvcmpy_add_saly(){
		return this.sp_lvcmpy_add_saly;
	}

	public String getYm_avg_saly(){
		return this.ym_avg_saly;
	}

	public String getYear_vaca_dds(){
		return this.year_vaca_dds;
	}

	public String getAdd_vaca_dds(){
		return this.add_vaca_dds;
	}

	public String getTm_vaca_dds(){
		return this.tm_vaca_dds;
	}

	public String getTotal_vaca_dds(){
		return this.total_vaca_dds;
	}

	public String getYm_avg_saly2(){
		return this.ym_avg_saly2;
	}

	public String getYear_vaca_dds2(){
		return this.year_vaca_dds2;
	}

	public String getAdd_vaca_dds2(){
		return this.add_vaca_dds2;
	}

	public String getTm_vaca_dds2(){
		return this.tm_vaca_dds2;
	}

	public String getTotal_vaca_dds2(){
		return this.total_vaca_dds2;
	}

	public String getVaca_saly(){
		return this.vaca_saly;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getJoin_year_2012(){
		return this.join_year_2012;
	}

	public String getJoin_year_2013(){
		return this.join_year_2013;
	}

	public String getAvg_wag_dt(){
		return this.avg_wag_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_1005_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_1005_ADM dm = (HD_LVCMPY_1005_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.update_clsf);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.lvcmpy_clsf);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.lvcmpy_dt);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.lvcmpy_fr);
		cstmt.setString(11, dm.lvcmpy_to);
		cstmt.setString(12, dm.join_year);
		cstmt.setString(13, dm.year);
		cstmt.setString(14, dm.day);
		cstmt.setString(15, dm.mm_saly_1);
		cstmt.setString(16, dm.mm_saly_2);
		cstmt.setString(17, dm.mm_saly_3);
		cstmt.setString(18, dm.mm_saly_4);
		cstmt.setString(19, dm.sum_mm_saly);
		cstmt.setString(20, dm.mm_alon_1);
		cstmt.setString(21, dm.mm_alon_2);
		cstmt.setString(22, dm.mm_alon_3);
		cstmt.setString(23, dm.mm_alon_4);
		cstmt.setString(24, dm.sum_mm_alon);
		cstmt.setString(25, dm.mm_dty_acty_1);
		cstmt.setString(26, dm.mm_dty_acty_2);
		cstmt.setString(27, dm.mm_dty_acty_3);
		cstmt.setString(28, dm.mm_dty_acty_4);
		cstmt.setString(29, dm.sum_mm_dty_acty);
		cstmt.setString(30, dm.saly_pay_dt);
		cstmt.setString(31, dm.yymm_alon);
		cstmt.setString(32, dm.avg_saly);
		cstmt.setString(33, dm.lvcmpy_saly);
		cstmt.setString(34, dm.lvcmpy_mm);
		cstmt.setString(35, dm.lvcmpy_add_saly);
		cstmt.setString(36, dm.sp_lvcmpy_add_saly);
		cstmt.setString(37, dm.ym_avg_saly);
		cstmt.setString(38, dm.year_vaca_dds);
		cstmt.setString(39, dm.add_vaca_dds);
		cstmt.setString(40, dm.tm_vaca_dds);
		cstmt.setString(41, dm.total_vaca_dds);
		cstmt.setString(42, dm.ym_avg_saly2);
		cstmt.setString(43, dm.year_vaca_dds2);
		cstmt.setString(44, dm.add_vaca_dds2);
		cstmt.setString(45, dm.tm_vaca_dds2);
		cstmt.setString(46, dm.total_vaca_dds2);
		cstmt.setString(47, dm.vaca_saly);
		cstmt.setString(48, dm.incmg_pers_ipadd);
		cstmt.setString(49, dm.incmg_pers);
		cstmt.setString(50, dm.join_year_2012);
		cstmt.setString(51, dm.join_year_2013);
		cstmt.setString(52, dm.avg_wag_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_1005_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("update_clsf = [" + getUpdate_clsf() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("lvcmpy_clsf = [" + getLvcmpy_clsf() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("lvcmpy_fr = [" + getLvcmpy_fr() + "]");
		System.out.println("lvcmpy_to = [" + getLvcmpy_to() + "]");
		System.out.println("join_year = [" + getJoin_year() + "]");
		System.out.println("year = [" + getYear() + "]");
		System.out.println("day = [" + getDay() + "]");
		System.out.println("mm_saly_1 = [" + getMm_saly_1() + "]");
		System.out.println("mm_saly_2 = [" + getMm_saly_2() + "]");
		System.out.println("mm_saly_3 = [" + getMm_saly_3() + "]");
		System.out.println("mm_saly_4 = [" + getMm_saly_4() + "]");
		System.out.println("sum_mm_saly = [" + getSum_mm_saly() + "]");
		System.out.println("mm_alon_1 = [" + getMm_alon_1() + "]");
		System.out.println("mm_alon_2 = [" + getMm_alon_2() + "]");
		System.out.println("mm_alon_3 = [" + getMm_alon_3() + "]");
		System.out.println("mm_alon_4 = [" + getMm_alon_4() + "]");
		System.out.println("sum_mm_alon = [" + getSum_mm_alon() + "]");
		System.out.println("mm_dty_acty_1 = [" + getMm_dty_acty_1() + "]");
		System.out.println("mm_dty_acty_2 = [" + getMm_dty_acty_2() + "]");
		System.out.println("mm_dty_acty_3 = [" + getMm_dty_acty_3() + "]");
		System.out.println("mm_dty_acty_4 = [" + getMm_dty_acty_4() + "]");
		System.out.println("sum_mm_dty_acty = [" + getSum_mm_dty_acty() + "]");
		System.out.println("saly_pay_dt = [" + getSaly_pay_dt() + "]");
		System.out.println("yymm_alon = [" + getYymm_alon() + "]");
		System.out.println("avg_saly = [" + getAvg_saly() + "]");
		System.out.println("lvcmpy_saly = [" + getLvcmpy_saly() + "]");
		System.out.println("lvcmpy_mm = [" + getLvcmpy_mm() + "]");
		System.out.println("lvcmpy_add_saly = [" + getLvcmpy_add_saly() + "]");
		System.out.println("sp_lvcmpy_add_saly = [" + getSp_lvcmpy_add_saly() + "]");
		System.out.println("ym_avg_saly = [" + getYm_avg_saly() + "]");
		System.out.println("year_vaca_dds = [" + getYear_vaca_dds() + "]");
		System.out.println("add_vaca_dds = [" + getAdd_vaca_dds() + "]");
		System.out.println("tm_vaca_dds = [" + getTm_vaca_dds() + "]");
		System.out.println("total_vaca_dds = [" + getTotal_vaca_dds() + "]");
		System.out.println("ym_avg_saly2 = [" + getYm_avg_saly2() + "]");
		System.out.println("year_vaca_dds2 = [" + getYear_vaca_dds2() + "]");
		System.out.println("add_vaca_dds2 = [" + getAdd_vaca_dds2() + "]");
		System.out.println("tm_vaca_dds2 = [" + getTm_vaca_dds2() + "]");
		System.out.println("total_vaca_dds2 = [" + getTotal_vaca_dds2() + "]");
		System.out.println("vaca_saly = [" + getVaca_saly() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("join_year_2012 = [" + getJoin_year_2012() + "]");
		System.out.println("join_year_2013 = [" + getJoin_year_2013() + "]");
		System.out.println("avg_wag_dt = [" + getAvg_wag_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String update_clsf = req.getParameter("update_clsf");
if( update_clsf == null){
	System.out.println(this.toString+" : update_clsf is null" );
}else{
	System.out.println(this.toString+" : update_clsf is "+update_clsf );
}
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
String lvcmpy_clsf = req.getParameter("lvcmpy_clsf");
if( lvcmpy_clsf == null){
	System.out.println(this.toString+" : lvcmpy_clsf is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_clsf is "+lvcmpy_clsf );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String lvcmpy_fr = req.getParameter("lvcmpy_fr");
if( lvcmpy_fr == null){
	System.out.println(this.toString+" : lvcmpy_fr is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_fr is "+lvcmpy_fr );
}
String lvcmpy_to = req.getParameter("lvcmpy_to");
if( lvcmpy_to == null){
	System.out.println(this.toString+" : lvcmpy_to is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_to is "+lvcmpy_to );
}
String join_year = req.getParameter("join_year");
if( join_year == null){
	System.out.println(this.toString+" : join_year is null" );
}else{
	System.out.println(this.toString+" : join_year is "+join_year );
}
String year = req.getParameter("year");
if( year == null){
	System.out.println(this.toString+" : year is null" );
}else{
	System.out.println(this.toString+" : year is "+year );
}
String day = req.getParameter("day");
if( day == null){
	System.out.println(this.toString+" : day is null" );
}else{
	System.out.println(this.toString+" : day is "+day );
}
String mm_saly_1 = req.getParameter("mm_saly_1");
if( mm_saly_1 == null){
	System.out.println(this.toString+" : mm_saly_1 is null" );
}else{
	System.out.println(this.toString+" : mm_saly_1 is "+mm_saly_1 );
}
String mm_saly_2 = req.getParameter("mm_saly_2");
if( mm_saly_2 == null){
	System.out.println(this.toString+" : mm_saly_2 is null" );
}else{
	System.out.println(this.toString+" : mm_saly_2 is "+mm_saly_2 );
}
String mm_saly_3 = req.getParameter("mm_saly_3");
if( mm_saly_3 == null){
	System.out.println(this.toString+" : mm_saly_3 is null" );
}else{
	System.out.println(this.toString+" : mm_saly_3 is "+mm_saly_3 );
}
String mm_saly_4 = req.getParameter("mm_saly_4");
if( mm_saly_4 == null){
	System.out.println(this.toString+" : mm_saly_4 is null" );
}else{
	System.out.println(this.toString+" : mm_saly_4 is "+mm_saly_4 );
}
String sum_mm_saly = req.getParameter("sum_mm_saly");
if( sum_mm_saly == null){
	System.out.println(this.toString+" : sum_mm_saly is null" );
}else{
	System.out.println(this.toString+" : sum_mm_saly is "+sum_mm_saly );
}
String mm_alon_1 = req.getParameter("mm_alon_1");
if( mm_alon_1 == null){
	System.out.println(this.toString+" : mm_alon_1 is null" );
}else{
	System.out.println(this.toString+" : mm_alon_1 is "+mm_alon_1 );
}
String mm_alon_2 = req.getParameter("mm_alon_2");
if( mm_alon_2 == null){
	System.out.println(this.toString+" : mm_alon_2 is null" );
}else{
	System.out.println(this.toString+" : mm_alon_2 is "+mm_alon_2 );
}
String mm_alon_3 = req.getParameter("mm_alon_3");
if( mm_alon_3 == null){
	System.out.println(this.toString+" : mm_alon_3 is null" );
}else{
	System.out.println(this.toString+" : mm_alon_3 is "+mm_alon_3 );
}
String mm_alon_4 = req.getParameter("mm_alon_4");
if( mm_alon_4 == null){
	System.out.println(this.toString+" : mm_alon_4 is null" );
}else{
	System.out.println(this.toString+" : mm_alon_4 is "+mm_alon_4 );
}
String sum_mm_alon = req.getParameter("sum_mm_alon");
if( sum_mm_alon == null){
	System.out.println(this.toString+" : sum_mm_alon is null" );
}else{
	System.out.println(this.toString+" : sum_mm_alon is "+sum_mm_alon );
}
String mm_dty_acty_1 = req.getParameter("mm_dty_acty_1");
if( mm_dty_acty_1 == null){
	System.out.println(this.toString+" : mm_dty_acty_1 is null" );
}else{
	System.out.println(this.toString+" : mm_dty_acty_1 is "+mm_dty_acty_1 );
}
String mm_dty_acty_2 = req.getParameter("mm_dty_acty_2");
if( mm_dty_acty_2 == null){
	System.out.println(this.toString+" : mm_dty_acty_2 is null" );
}else{
	System.out.println(this.toString+" : mm_dty_acty_2 is "+mm_dty_acty_2 );
}
String mm_dty_acty_3 = req.getParameter("mm_dty_acty_3");
if( mm_dty_acty_3 == null){
	System.out.println(this.toString+" : mm_dty_acty_3 is null" );
}else{
	System.out.println(this.toString+" : mm_dty_acty_3 is "+mm_dty_acty_3 );
}
String mm_dty_acty_4 = req.getParameter("mm_dty_acty_4");
if( mm_dty_acty_4 == null){
	System.out.println(this.toString+" : mm_dty_acty_4 is null" );
}else{
	System.out.println(this.toString+" : mm_dty_acty_4 is "+mm_dty_acty_4 );
}
String sum_mm_dty_acty = req.getParameter("sum_mm_dty_acty");
if( sum_mm_dty_acty == null){
	System.out.println(this.toString+" : sum_mm_dty_acty is null" );
}else{
	System.out.println(this.toString+" : sum_mm_dty_acty is "+sum_mm_dty_acty );
}
String saly_pay_dt = req.getParameter("saly_pay_dt");
if( saly_pay_dt == null){
	System.out.println(this.toString+" : saly_pay_dt is null" );
}else{
	System.out.println(this.toString+" : saly_pay_dt is "+saly_pay_dt );
}
String yymm_alon = req.getParameter("yymm_alon");
if( yymm_alon == null){
	System.out.println(this.toString+" : yymm_alon is null" );
}else{
	System.out.println(this.toString+" : yymm_alon is "+yymm_alon );
}
String avg_saly = req.getParameter("avg_saly");
if( avg_saly == null){
	System.out.println(this.toString+" : avg_saly is null" );
}else{
	System.out.println(this.toString+" : avg_saly is "+avg_saly );
}
String lvcmpy_saly = req.getParameter("lvcmpy_saly");
if( lvcmpy_saly == null){
	System.out.println(this.toString+" : lvcmpy_saly is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_saly is "+lvcmpy_saly );
}
String lvcmpy_mm = req.getParameter("lvcmpy_mm");
if( lvcmpy_mm == null){
	System.out.println(this.toString+" : lvcmpy_mm is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_mm is "+lvcmpy_mm );
}
String lvcmpy_add_saly = req.getParameter("lvcmpy_add_saly");
if( lvcmpy_add_saly == null){
	System.out.println(this.toString+" : lvcmpy_add_saly is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_add_saly is "+lvcmpy_add_saly );
}
String sp_lvcmpy_add_saly = req.getParameter("sp_lvcmpy_add_saly");
if( sp_lvcmpy_add_saly == null){
	System.out.println(this.toString+" : sp_lvcmpy_add_saly is null" );
}else{
	System.out.println(this.toString+" : sp_lvcmpy_add_saly is "+sp_lvcmpy_add_saly );
}
String ym_avg_saly = req.getParameter("ym_avg_saly");
if( ym_avg_saly == null){
	System.out.println(this.toString+" : ym_avg_saly is null" );
}else{
	System.out.println(this.toString+" : ym_avg_saly is "+ym_avg_saly );
}
String year_vaca_dds = req.getParameter("year_vaca_dds");
if( year_vaca_dds == null){
	System.out.println(this.toString+" : year_vaca_dds is null" );
}else{
	System.out.println(this.toString+" : year_vaca_dds is "+year_vaca_dds );
}
String add_vaca_dds = req.getParameter("add_vaca_dds");
if( add_vaca_dds == null){
	System.out.println(this.toString+" : add_vaca_dds is null" );
}else{
	System.out.println(this.toString+" : add_vaca_dds is "+add_vaca_dds );
}
String tm_vaca_dds = req.getParameter("tm_vaca_dds");
if( tm_vaca_dds == null){
	System.out.println(this.toString+" : tm_vaca_dds is null" );
}else{
	System.out.println(this.toString+" : tm_vaca_dds is "+tm_vaca_dds );
}
String total_vaca_dds = req.getParameter("total_vaca_dds");
if( total_vaca_dds == null){
	System.out.println(this.toString+" : total_vaca_dds is null" );
}else{
	System.out.println(this.toString+" : total_vaca_dds is "+total_vaca_dds );
}
String ym_avg_saly2 = req.getParameter("ym_avg_saly2");
if( ym_avg_saly2 == null){
	System.out.println(this.toString+" : ym_avg_saly2 is null" );
}else{
	System.out.println(this.toString+" : ym_avg_saly2 is "+ym_avg_saly2 );
}
String year_vaca_dds2 = req.getParameter("year_vaca_dds2");
if( year_vaca_dds2 == null){
	System.out.println(this.toString+" : year_vaca_dds2 is null" );
}else{
	System.out.println(this.toString+" : year_vaca_dds2 is "+year_vaca_dds2 );
}
String add_vaca_dds2 = req.getParameter("add_vaca_dds2");
if( add_vaca_dds2 == null){
	System.out.println(this.toString+" : add_vaca_dds2 is null" );
}else{
	System.out.println(this.toString+" : add_vaca_dds2 is "+add_vaca_dds2 );
}
String tm_vaca_dds2 = req.getParameter("tm_vaca_dds2");
if( tm_vaca_dds2 == null){
	System.out.println(this.toString+" : tm_vaca_dds2 is null" );
}else{
	System.out.println(this.toString+" : tm_vaca_dds2 is "+tm_vaca_dds2 );
}
String total_vaca_dds2 = req.getParameter("total_vaca_dds2");
if( total_vaca_dds2 == null){
	System.out.println(this.toString+" : total_vaca_dds2 is null" );
}else{
	System.out.println(this.toString+" : total_vaca_dds2 is "+total_vaca_dds2 );
}
String vaca_saly = req.getParameter("vaca_saly");
if( vaca_saly == null){
	System.out.println(this.toString+" : vaca_saly is null" );
}else{
	System.out.println(this.toString+" : vaca_saly is "+vaca_saly );
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
String join_year_2012 = req.getParameter("join_year_2012");
if( join_year_2012 == null){
	System.out.println(this.toString+" : join_year_2012 is null" );
}else{
	System.out.println(this.toString+" : join_year_2012 is "+join_year_2012 );
}
String join_year_2013 = req.getParameter("join_year_2013");
if( join_year_2013 == null){
	System.out.println(this.toString+" : join_year_2013 is null" );
}else{
	System.out.println(this.toString+" : join_year_2013 is "+join_year_2013 );
}
String avg_wag_dt = req.getParameter("avg_wag_dt");
if( avg_wag_dt == null){
	System.out.println(this.toString+" : avg_wag_dt is null" );
}else{
	System.out.println(this.toString+" : avg_wag_dt is "+avg_wag_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String update_clsf = Util.checkString(req.getParameter("update_clsf"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
String flnm = Util.checkString(req.getParameter("flnm"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String lvcmpy_fr = Util.checkString(req.getParameter("lvcmpy_fr"));
String lvcmpy_to = Util.checkString(req.getParameter("lvcmpy_to"));
String join_year = Util.checkString(req.getParameter("join_year"));
String year = Util.checkString(req.getParameter("year"));
String day = Util.checkString(req.getParameter("day"));
String mm_saly_1 = Util.checkString(req.getParameter("mm_saly_1"));
String mm_saly_2 = Util.checkString(req.getParameter("mm_saly_2"));
String mm_saly_3 = Util.checkString(req.getParameter("mm_saly_3"));
String mm_saly_4 = Util.checkString(req.getParameter("mm_saly_4"));
String sum_mm_saly = Util.checkString(req.getParameter("sum_mm_saly"));
String mm_alon_1 = Util.checkString(req.getParameter("mm_alon_1"));
String mm_alon_2 = Util.checkString(req.getParameter("mm_alon_2"));
String mm_alon_3 = Util.checkString(req.getParameter("mm_alon_3"));
String mm_alon_4 = Util.checkString(req.getParameter("mm_alon_4"));
String sum_mm_alon = Util.checkString(req.getParameter("sum_mm_alon"));
String mm_dty_acty_1 = Util.checkString(req.getParameter("mm_dty_acty_1"));
String mm_dty_acty_2 = Util.checkString(req.getParameter("mm_dty_acty_2"));
String mm_dty_acty_3 = Util.checkString(req.getParameter("mm_dty_acty_3"));
String mm_dty_acty_4 = Util.checkString(req.getParameter("mm_dty_acty_4"));
String sum_mm_dty_acty = Util.checkString(req.getParameter("sum_mm_dty_acty"));
String saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
String yymm_alon = Util.checkString(req.getParameter("yymm_alon"));
String avg_saly = Util.checkString(req.getParameter("avg_saly"));
String lvcmpy_saly = Util.checkString(req.getParameter("lvcmpy_saly"));
String lvcmpy_mm = Util.checkString(req.getParameter("lvcmpy_mm"));
String lvcmpy_add_saly = Util.checkString(req.getParameter("lvcmpy_add_saly"));
String sp_lvcmpy_add_saly = Util.checkString(req.getParameter("sp_lvcmpy_add_saly"));
String ym_avg_saly = Util.checkString(req.getParameter("ym_avg_saly"));
String year_vaca_dds = Util.checkString(req.getParameter("year_vaca_dds"));
String add_vaca_dds = Util.checkString(req.getParameter("add_vaca_dds"));
String tm_vaca_dds = Util.checkString(req.getParameter("tm_vaca_dds"));
String total_vaca_dds = Util.checkString(req.getParameter("total_vaca_dds"));
String ym_avg_saly2 = Util.checkString(req.getParameter("ym_avg_saly2"));
String year_vaca_dds2 = Util.checkString(req.getParameter("year_vaca_dds2"));
String add_vaca_dds2 = Util.checkString(req.getParameter("add_vaca_dds2"));
String tm_vaca_dds2 = Util.checkString(req.getParameter("tm_vaca_dds2"));
String total_vaca_dds2 = Util.checkString(req.getParameter("total_vaca_dds2"));
String vaca_saly = Util.checkString(req.getParameter("vaca_saly"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String join_year_2012 = Util.checkString(req.getParameter("join_year_2012"));
String join_year_2013 = Util.checkString(req.getParameter("join_year_2013"));
String avg_wag_dt = Util.checkString(req.getParameter("avg_wag_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String update_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("update_clsf")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String lvcmpy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_clsf")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String lvcmpy_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_fr")));
String lvcmpy_to = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_to")));
String join_year = Util.Uni2Ksc(Util.checkString(req.getParameter("join_year")));
String year = Util.Uni2Ksc(Util.checkString(req.getParameter("year")));
String day = Util.Uni2Ksc(Util.checkString(req.getParameter("day")));
String mm_saly_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_saly_1")));
String mm_saly_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_saly_2")));
String mm_saly_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_saly_3")));
String mm_saly_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_saly_4")));
String sum_mm_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_mm_saly")));
String mm_alon_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_alon_1")));
String mm_alon_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_alon_2")));
String mm_alon_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_alon_3")));
String mm_alon_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_alon_4")));
String sum_mm_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_mm_alon")));
String mm_dty_acty_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_dty_acty_1")));
String mm_dty_acty_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_dty_acty_2")));
String mm_dty_acty_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_dty_acty_3")));
String mm_dty_acty_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_dty_acty_4")));
String sum_mm_dty_acty = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_mm_dty_acty")));
String saly_pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_pay_dt")));
String yymm_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_alon")));
String avg_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("avg_saly")));
String lvcmpy_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_saly")));
String lvcmpy_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_mm")));
String lvcmpy_add_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_add_saly")));
String sp_lvcmpy_add_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("sp_lvcmpy_add_saly")));
String ym_avg_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("ym_avg_saly")));
String year_vaca_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("year_vaca_dds")));
String add_vaca_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("add_vaca_dds")));
String tm_vaca_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("tm_vaca_dds")));
String total_vaca_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("total_vaca_dds")));
String ym_avg_saly2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ym_avg_saly2")));
String year_vaca_dds2 = Util.Uni2Ksc(Util.checkString(req.getParameter("year_vaca_dds2")));
String add_vaca_dds2 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_vaca_dds2")));
String tm_vaca_dds2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tm_vaca_dds2")));
String total_vaca_dds2 = Util.Uni2Ksc(Util.checkString(req.getParameter("total_vaca_dds2")));
String vaca_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_saly")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String join_year_2012 = Util.Uni2Ksc(Util.checkString(req.getParameter("join_year_2012")));
String join_year_2013 = Util.Uni2Ksc(Util.checkString(req.getParameter("join_year_2013")));
String avg_wag_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("avg_wag_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUpdate_clsf(update_clsf);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setLvcmpy_clsf(lvcmpy_clsf);
dm.setFlnm(flnm);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setDept_cd(dept_cd);
dm.setLvcmpy_fr(lvcmpy_fr);
dm.setLvcmpy_to(lvcmpy_to);
dm.setJoin_year(join_year);
dm.setYear(year);
dm.setDay(day);
dm.setMm_saly_1(mm_saly_1);
dm.setMm_saly_2(mm_saly_2);
dm.setMm_saly_3(mm_saly_3);
dm.setMm_saly_4(mm_saly_4);
dm.setSum_mm_saly(sum_mm_saly);
dm.setMm_alon_1(mm_alon_1);
dm.setMm_alon_2(mm_alon_2);
dm.setMm_alon_3(mm_alon_3);
dm.setMm_alon_4(mm_alon_4);
dm.setSum_mm_alon(sum_mm_alon);
dm.setMm_dty_acty_1(mm_dty_acty_1);
dm.setMm_dty_acty_2(mm_dty_acty_2);
dm.setMm_dty_acty_3(mm_dty_acty_3);
dm.setMm_dty_acty_4(mm_dty_acty_4);
dm.setSum_mm_dty_acty(sum_mm_dty_acty);
dm.setSaly_pay_dt(saly_pay_dt);
dm.setYymm_alon(yymm_alon);
dm.setAvg_saly(avg_saly);
dm.setLvcmpy_saly(lvcmpy_saly);
dm.setLvcmpy_mm(lvcmpy_mm);
dm.setLvcmpy_add_saly(lvcmpy_add_saly);
dm.setSp_lvcmpy_add_saly(sp_lvcmpy_add_saly);
dm.setYm_avg_saly(ym_avg_saly);
dm.setYear_vaca_dds(year_vaca_dds);
dm.setAdd_vaca_dds(add_vaca_dds);
dm.setTm_vaca_dds(tm_vaca_dds);
dm.setTotal_vaca_dds(total_vaca_dds);
dm.setYm_avg_saly2(ym_avg_saly2);
dm.setYear_vaca_dds2(year_vaca_dds2);
dm.setAdd_vaca_dds2(add_vaca_dds2);
dm.setTm_vaca_dds2(tm_vaca_dds2);
dm.setTotal_vaca_dds2(total_vaca_dds2);
dm.setVaca_saly(vaca_saly);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setJoin_year_2012(join_year_2012);
dm.setJoin_year_2013(join_year_2013);
dm.setAvg_wag_dt(avg_wag_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 31 15:39:54 KST 2017 */