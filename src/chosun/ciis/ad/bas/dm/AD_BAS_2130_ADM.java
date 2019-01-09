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


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_2130_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String dlco_no;
	public String medi_clsf;
	public String prfl_no;
	public String flnm;
	public String chin_flnm;
	public String cur_job;
	public String bidt;
	public String nativ;
	public String sex;
	public String offi_zip1;
	public String offi_zip2;
	public String offi_zip3;
	public String offi_addr;
	public String offi_dtls_addr;
	public String offi_tel_no;
	public String home_zip1;
	public String home_zip2;
	public String home_zip3;
	public String home_addr;
	public String home_dtls_addr;
	public String home_tel_no;
	public String etc_addr_zip1;
	public String etc_addr_zip2;
	public String etc_addr_zip3;
	public String etc_addr;
	public String etc_dtls_addr;
	public String ceph_no1;
	public String ceph_no2;
	public String birth_hscl;
	public String birth_univ;
	public String email;
	public String wedd_anvy_dt;
	public String relg;
	public String hby;
	public String army;
	public String child_cnt;
	public String golf;
	public String smok_yn;
	public String drink_yn;
	public String main_nwsp_subs;
	public String wedd_yn;
	public String spc_matt;
	public String vip_pers_line;
	public String lvcmpy_yn;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;
	public String mode;
	public String seq;
	public String frdt;
	public String todt;
	public String carr_matt;
	public String cust_mang_item;

	public AD_BAS_2130_ADM(){}
	public AD_BAS_2130_ADM(String flag, String cmpy_cd, String dlco_no, String medi_clsf, String prfl_no, String flnm, String chin_flnm, String cur_job, String bidt, String nativ, String sex, String offi_zip1, String offi_zip2, String offi_zip3, String offi_addr, String offi_dtls_addr, String offi_tel_no, String home_zip1, String home_zip2, String home_zip3, String home_addr, String home_dtls_addr, String home_tel_no, String etc_addr_zip1, String etc_addr_zip2, String etc_addr_zip3, String etc_addr, String etc_dtls_addr, String ceph_no1, String ceph_no2, String birth_hscl, String birth_univ, String email, String wedd_anvy_dt, String relg, String hby, String army, String child_cnt, String golf, String smok_yn, String drink_yn, String main_nwsp_subs, String wedd_yn, String spc_matt, String vip_pers_line, String lvcmpy_yn, String incmg_pers_ip, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm, String mode, String seq, String frdt, String todt, String carr_matt, String cust_mang_item){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.medi_clsf = medi_clsf;
		this.prfl_no = prfl_no;
		this.flnm = flnm;
		this.chin_flnm = chin_flnm;
		this.cur_job = cur_job;
		this.bidt = bidt;
		this.nativ = nativ;
		this.sex = sex;
		this.offi_zip1 = offi_zip1;
		this.offi_zip2 = offi_zip2;
		this.offi_zip3 = offi_zip3;
		this.offi_addr = offi_addr;
		this.offi_dtls_addr = offi_dtls_addr;
		this.offi_tel_no = offi_tel_no;
		this.home_zip1 = home_zip1;
		this.home_zip2 = home_zip2;
		this.home_zip3 = home_zip3;
		this.home_addr = home_addr;
		this.home_dtls_addr = home_dtls_addr;
		this.home_tel_no = home_tel_no;
		this.etc_addr_zip1 = etc_addr_zip1;
		this.etc_addr_zip2 = etc_addr_zip2;
		this.etc_addr_zip3 = etc_addr_zip3;
		this.etc_addr = etc_addr;
		this.etc_dtls_addr = etc_dtls_addr;
		this.ceph_no1 = ceph_no1;
		this.ceph_no2 = ceph_no2;
		this.birth_hscl = birth_hscl;
		this.birth_univ = birth_univ;
		this.email = email;
		this.wedd_anvy_dt = wedd_anvy_dt;
		this.relg = relg;
		this.hby = hby;
		this.army = army;
		this.child_cnt = child_cnt;
		this.golf = golf;
		this.smok_yn = smok_yn;
		this.drink_yn = drink_yn;
		this.main_nwsp_subs = main_nwsp_subs;
		this.wedd_yn = wedd_yn;
		this.spc_matt = spc_matt;
		this.vip_pers_line = vip_pers_line;
		this.lvcmpy_yn = lvcmpy_yn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
		this.mode = mode;
		this.seq = seq;
		this.frdt = frdt;
		this.todt = todt;
		this.carr_matt = carr_matt;
		this.cust_mang_item = cust_mang_item;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setPrfl_no(String prfl_no){
		this.prfl_no = prfl_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setChin_flnm(String chin_flnm){
		this.chin_flnm = chin_flnm;
	}

	public void setCur_job(String cur_job){
		this.cur_job = cur_job;
	}

	public void setBidt(String bidt){
		this.bidt = bidt;
	}

	public void setNativ(String nativ){
		this.nativ = nativ;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public void setOffi_zip1(String offi_zip1){
		this.offi_zip1 = offi_zip1;
	}

	public void setOffi_zip2(String offi_zip2){
		this.offi_zip2 = offi_zip2;
	}

	public void setOffi_zip3(String offi_zip3){
		this.offi_zip3 = offi_zip3;
	}

	public void setOffi_addr(String offi_addr){
		this.offi_addr = offi_addr;
	}

	public void setOffi_dtls_addr(String offi_dtls_addr){
		this.offi_dtls_addr = offi_dtls_addr;
	}

	public void setOffi_tel_no(String offi_tel_no){
		this.offi_tel_no = offi_tel_no;
	}

	public void setHome_zip1(String home_zip1){
		this.home_zip1 = home_zip1;
	}

	public void setHome_zip2(String home_zip2){
		this.home_zip2 = home_zip2;
	}

	public void setHome_zip3(String home_zip3){
		this.home_zip3 = home_zip3;
	}

	public void setHome_addr(String home_addr){
		this.home_addr = home_addr;
	}

	public void setHome_dtls_addr(String home_dtls_addr){
		this.home_dtls_addr = home_dtls_addr;
	}

	public void setHome_tel_no(String home_tel_no){
		this.home_tel_no = home_tel_no;
	}

	public void setEtc_addr_zip1(String etc_addr_zip1){
		this.etc_addr_zip1 = etc_addr_zip1;
	}

	public void setEtc_addr_zip2(String etc_addr_zip2){
		this.etc_addr_zip2 = etc_addr_zip2;
	}

	public void setEtc_addr_zip3(String etc_addr_zip3){
		this.etc_addr_zip3 = etc_addr_zip3;
	}

	public void setEtc_addr(String etc_addr){
		this.etc_addr = etc_addr;
	}

	public void setEtc_dtls_addr(String etc_dtls_addr){
		this.etc_dtls_addr = etc_dtls_addr;
	}

	public void setCeph_no1(String ceph_no1){
		this.ceph_no1 = ceph_no1;
	}

	public void setCeph_no2(String ceph_no2){
		this.ceph_no2 = ceph_no2;
	}

	public void setBirth_hscl(String birth_hscl){
		this.birth_hscl = birth_hscl;
	}

	public void setBirth_univ(String birth_univ){
		this.birth_univ = birth_univ;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setWedd_anvy_dt(String wedd_anvy_dt){
		this.wedd_anvy_dt = wedd_anvy_dt;
	}

	public void setRelg(String relg){
		this.relg = relg;
	}

	public void setHby(String hby){
		this.hby = hby;
	}

	public void setArmy(String army){
		this.army = army;
	}

	public void setChild_cnt(String child_cnt){
		this.child_cnt = child_cnt;
	}

	public void setGolf(String golf){
		this.golf = golf;
	}

	public void setSmok_yn(String smok_yn){
		this.smok_yn = smok_yn;
	}

	public void setDrink_yn(String drink_yn){
		this.drink_yn = drink_yn;
	}

	public void setMain_nwsp_subs(String main_nwsp_subs){
		this.main_nwsp_subs = main_nwsp_subs;
	}

	public void setWedd_yn(String wedd_yn){
		this.wedd_yn = wedd_yn;
	}

	public void setSpc_matt(String spc_matt){
		this.spc_matt = spc_matt;
	}

	public void setVip_pers_line(String vip_pers_line){
		this.vip_pers_line = vip_pers_line;
	}

	public void setLvcmpy_yn(String lvcmpy_yn){
		this.lvcmpy_yn = lvcmpy_yn;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setCarr_matt(String carr_matt){
		this.carr_matt = carr_matt;
	}

	public void setCust_mang_item(String cust_mang_item){
		this.cust_mang_item = cust_mang_item;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getPrfl_no(){
		return this.prfl_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getChin_flnm(){
		return this.chin_flnm;
	}

	public String getCur_job(){
		return this.cur_job;
	}

	public String getBidt(){
		return this.bidt;
	}

	public String getNativ(){
		return this.nativ;
	}

	public String getSex(){
		return this.sex;
	}

	public String getOffi_zip1(){
		return this.offi_zip1;
	}

	public String getOffi_zip2(){
		return this.offi_zip2;
	}

	public String getOffi_zip3(){
		return this.offi_zip3;
	}

	public String getOffi_addr(){
		return this.offi_addr;
	}

	public String getOffi_dtls_addr(){
		return this.offi_dtls_addr;
	}

	public String getOffi_tel_no(){
		return this.offi_tel_no;
	}

	public String getHome_zip1(){
		return this.home_zip1;
	}

	public String getHome_zip2(){
		return this.home_zip2;
	}

	public String getHome_zip3(){
		return this.home_zip3;
	}

	public String getHome_addr(){
		return this.home_addr;
	}

	public String getHome_dtls_addr(){
		return this.home_dtls_addr;
	}

	public String getHome_tel_no(){
		return this.home_tel_no;
	}

	public String getEtc_addr_zip1(){
		return this.etc_addr_zip1;
	}

	public String getEtc_addr_zip2(){
		return this.etc_addr_zip2;
	}

	public String getEtc_addr_zip3(){
		return this.etc_addr_zip3;
	}

	public String getEtc_addr(){
		return this.etc_addr;
	}

	public String getEtc_dtls_addr(){
		return this.etc_dtls_addr;
	}

	public String getCeph_no1(){
		return this.ceph_no1;
	}

	public String getCeph_no2(){
		return this.ceph_no2;
	}

	public String getBirth_hscl(){
		return this.birth_hscl;
	}

	public String getBirth_univ(){
		return this.birth_univ;
	}

	public String getEmail(){
		return this.email;
	}

	public String getWedd_anvy_dt(){
		return this.wedd_anvy_dt;
	}

	public String getRelg(){
		return this.relg;
	}

	public String getHby(){
		return this.hby;
	}

	public String getArmy(){
		return this.army;
	}

	public String getChild_cnt(){
		return this.child_cnt;
	}

	public String getGolf(){
		return this.golf;
	}

	public String getSmok_yn(){
		return this.smok_yn;
	}

	public String getDrink_yn(){
		return this.drink_yn;
	}

	public String getMain_nwsp_subs(){
		return this.main_nwsp_subs;
	}

	public String getWedd_yn(){
		return this.wedd_yn;
	}

	public String getSpc_matt(){
		return this.spc_matt;
	}

	public String getVip_pers_line(){
		return this.vip_pers_line;
	}

	public String getLvcmpy_yn(){
		return this.lvcmpy_yn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getCarr_matt(){
		return this.carr_matt;
	}

	public String getCust_mang_item(){
		return this.cust_mang_item;
	}

	public String getSQL(){
		 return "{ call SP_AD_BAS_2130_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_2130_ADM dm = (AD_BAS_2130_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.medi_clsf);
		cstmt.setString(7, dm.prfl_no);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.chin_flnm);
		cstmt.setString(10, dm.cur_job);
		cstmt.setString(11, dm.bidt);
		cstmt.setString(12, dm.nativ);
		cstmt.setString(13, dm.sex);
		cstmt.setString(14, dm.offi_zip1);
		cstmt.setString(15, dm.offi_zip2);
		cstmt.setString(16, dm.offi_zip3);
		cstmt.setString(17, dm.offi_addr);
		cstmt.setString(18, dm.offi_dtls_addr);
		cstmt.setString(19, dm.offi_tel_no);
		cstmt.setString(20, dm.home_zip1);
		cstmt.setString(21, dm.home_zip2);
		cstmt.setString(22, dm.home_zip3);
		cstmt.setString(23, dm.home_addr);
		cstmt.setString(24, dm.home_dtls_addr);
		cstmt.setString(25, dm.home_tel_no);
		cstmt.setString(26, dm.etc_addr_zip1);
		cstmt.setString(27, dm.etc_addr_zip2);
		cstmt.setString(28, dm.etc_addr_zip3);
		cstmt.setString(29, dm.etc_addr);
		cstmt.setString(30, dm.etc_dtls_addr);
		cstmt.setString(31, dm.ceph_no1);
		cstmt.setString(32, dm.ceph_no2);
		cstmt.setString(33, dm.birth_hscl);
		cstmt.setString(34, dm.birth_univ);
		cstmt.setString(35, dm.email);
		cstmt.setString(36, dm.wedd_anvy_dt);
		cstmt.setString(37, dm.relg);
		cstmt.setString(38, dm.hby);
		cstmt.setString(39, dm.army);
		cstmt.setString(40, dm.child_cnt);
		cstmt.setString(41, dm.golf);
		cstmt.setString(42, dm.smok_yn);
		cstmt.setString(43, dm.drink_yn);
		cstmt.setString(44, dm.main_nwsp_subs);
		cstmt.setString(45, dm.wedd_yn);
		cstmt.setString(46, dm.spc_matt);
		cstmt.setString(47, dm.vip_pers_line);
		cstmt.setString(48, dm.lvcmpy_yn);
		cstmt.setString(49, dm.incmg_pers_ip);
		cstmt.setString(50, dm.incmg_pers);
		cstmt.setString(51, dm.incmg_dt_tm);
		cstmt.setString(52, dm.chg_pers);
		cstmt.setString(53, dm.chg_dt_tm);
		cstmt.setString(54, dm.mode);
		cstmt.setString(55, dm.seq);
		cstmt.setString(56, dm.frdt);
		cstmt.setString(57, dm.todt);
		cstmt.setString(58, dm.carr_matt);
		cstmt.setString(59, dm.cust_mang_item);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_2130_ADataSet();
	}



    public void print(){
        System.out.println("flag = " + getFlag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("medi_clsf = " + getMedi_clsf());
        System.out.println("prfl_no = " + getPrfl_no());
        System.out.println("flnm = " + getFlnm());
        System.out.println("chin_flnm = " + getChin_flnm());
        System.out.println("cur_job = " + getCur_job());
        System.out.println("bidt = " + getBidt());
        System.out.println("nativ = " + getNativ());
        System.out.println("sex = " + getSex());
        System.out.println("offi_zip1 = " + getOffi_zip1());
        System.out.println("offi_zip2 = " + getOffi_zip2());
        System.out.println("offi_zip3 = " + getOffi_zip3());
        System.out.println("offi_addr = " + getOffi_addr());
        System.out.println("offi_dtls_addr = " + getOffi_dtls_addr());
        System.out.println("offi_tel_no = " + getOffi_tel_no());
        System.out.println("home_zip1 = " + getHome_zip1());
        System.out.println("home_zip2 = " + getHome_zip2());
        System.out.println("home_zip3 = " + getHome_zip3());
        System.out.println("home_addr = " + getHome_addr());
        System.out.println("home_dtls_addr = " + getHome_dtls_addr());
        System.out.println("home_tel_no = " + getHome_tel_no());
        System.out.println("etc_addr_zip1 = " + getEtc_addr_zip1());
        System.out.println("etc_addr_zip2 = " + getEtc_addr_zip2());
        System.out.println("etc_addr_zip3 = " + getEtc_addr_zip3());
        System.out.println("etc_addr = " + getEtc_addr());
        System.out.println("etc_dtls_addr = " + getEtc_dtls_addr());
        System.out.println("ceph_no1 = " + getCeph_no1());
        System.out.println("ceph_no2 = " + getCeph_no2());
        System.out.println("birth_hscl = " + getBirth_hscl());
        System.out.println("birth_univ = " + getBirth_univ());
        System.out.println("email = " + getEmail());
        System.out.println("wedd_anvy_dt = " + getWedd_anvy_dt());
        System.out.println("relg = " + getRelg());
        System.out.println("hby = " + getHby());
        System.out.println("army = " + getArmy());
        System.out.println("child_cnt = " + getChild_cnt());
        System.out.println("golf = " + getGolf());
        System.out.println("smok_yn = " + getSmok_yn());
        System.out.println("drink_yn = " + getDrink_yn());
        System.out.println("main_nwsp_subs = " + getMain_nwsp_subs());
        System.out.println("wedd_yn = " + getWedd_yn());
        System.out.println("spc_matt = " + getSpc_matt());
        System.out.println("vip_pers_line = " + getVip_pers_line());
        System.out.println("lvcmpy_yn = " + getLvcmpy_yn());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_dt_tm = " + getIncmg_dt_tm());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("chg_dt_tm = " + getChg_dt_tm());
        System.out.println("mode = " + getMode());
        System.out.println("seq = " + getSeq());
        System.out.println("frdt = " + getFrdt());
        System.out.println("todt = " + getTodt());
        System.out.println("carr_matt = " + getCarr_matt());
        System.out.println("cust_mang_item = " + getCust_mang_item());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String prfl_no = req.getParameter("prfl_no");
if( prfl_no == null){
	System.out.println(this.toString+" : prfl_no is null" );
}else{
	System.out.println(this.toString+" : prfl_no is "+prfl_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String chin_flnm = req.getParameter("chin_flnm");
if( chin_flnm == null){
	System.out.println(this.toString+" : chin_flnm is null" );
}else{
	System.out.println(this.toString+" : chin_flnm is "+chin_flnm );
}
String cur_job = req.getParameter("cur_job");
if( cur_job == null){
	System.out.println(this.toString+" : cur_job is null" );
}else{
	System.out.println(this.toString+" : cur_job is "+cur_job );
}
String bidt = req.getParameter("bidt");
if( bidt == null){
	System.out.println(this.toString+" : bidt is null" );
}else{
	System.out.println(this.toString+" : bidt is "+bidt );
}
String nativ = req.getParameter("nativ");
if( nativ == null){
	System.out.println(this.toString+" : nativ is null" );
}else{
	System.out.println(this.toString+" : nativ is "+nativ );
}
String sex = req.getParameter("sex");
if( sex == null){
	System.out.println(this.toString+" : sex is null" );
}else{
	System.out.println(this.toString+" : sex is "+sex );
}
String offi_zip1 = req.getParameter("offi_zip1");
if( offi_zip1 == null){
	System.out.println(this.toString+" : offi_zip1 is null" );
}else{
	System.out.println(this.toString+" : offi_zip1 is "+offi_zip1 );
}
String offi_zip2 = req.getParameter("offi_zip2");
if( offi_zip2 == null){
	System.out.println(this.toString+" : offi_zip2 is null" );
}else{
	System.out.println(this.toString+" : offi_zip2 is "+offi_zip2 );
}
String offi_zip3 = req.getParameter("offi_zip3");
if( offi_zip3 == null){
	System.out.println(this.toString+" : offi_zip3 is null" );
}else{
	System.out.println(this.toString+" : offi_zip3 is "+offi_zip3 );
}
String offi_addr = req.getParameter("offi_addr");
if( offi_addr == null){
	System.out.println(this.toString+" : offi_addr is null" );
}else{
	System.out.println(this.toString+" : offi_addr is "+offi_addr );
}
String offi_dtls_addr = req.getParameter("offi_dtls_addr");
if( offi_dtls_addr == null){
	System.out.println(this.toString+" : offi_dtls_addr is null" );
}else{
	System.out.println(this.toString+" : offi_dtls_addr is "+offi_dtls_addr );
}
String offi_tel_no = req.getParameter("offi_tel_no");
if( offi_tel_no == null){
	System.out.println(this.toString+" : offi_tel_no is null" );
}else{
	System.out.println(this.toString+" : offi_tel_no is "+offi_tel_no );
}
String home_zip1 = req.getParameter("home_zip1");
if( home_zip1 == null){
	System.out.println(this.toString+" : home_zip1 is null" );
}else{
	System.out.println(this.toString+" : home_zip1 is "+home_zip1 );
}
String home_zip2 = req.getParameter("home_zip2");
if( home_zip2 == null){
	System.out.println(this.toString+" : home_zip2 is null" );
}else{
	System.out.println(this.toString+" : home_zip2 is "+home_zip2 );
}
String home_zip3 = req.getParameter("home_zip3");
if( home_zip3 == null){
	System.out.println(this.toString+" : home_zip3 is null" );
}else{
	System.out.println(this.toString+" : home_zip3 is "+home_zip3 );
}
String home_addr = req.getParameter("home_addr");
if( home_addr == null){
	System.out.println(this.toString+" : home_addr is null" );
}else{
	System.out.println(this.toString+" : home_addr is "+home_addr );
}
String home_dtls_addr = req.getParameter("home_dtls_addr");
if( home_dtls_addr == null){
	System.out.println(this.toString+" : home_dtls_addr is null" );
}else{
	System.out.println(this.toString+" : home_dtls_addr is "+home_dtls_addr );
}
String home_tel_no = req.getParameter("home_tel_no");
if( home_tel_no == null){
	System.out.println(this.toString+" : home_tel_no is null" );
}else{
	System.out.println(this.toString+" : home_tel_no is "+home_tel_no );
}
String etc_addr_zip1 = req.getParameter("etc_addr_zip1");
if( etc_addr_zip1 == null){
	System.out.println(this.toString+" : etc_addr_zip1 is null" );
}else{
	System.out.println(this.toString+" : etc_addr_zip1 is "+etc_addr_zip1 );
}
String etc_addr_zip2 = req.getParameter("etc_addr_zip2");
if( etc_addr_zip2 == null){
	System.out.println(this.toString+" : etc_addr_zip2 is null" );
}else{
	System.out.println(this.toString+" : etc_addr_zip2 is "+etc_addr_zip2 );
}
String etc_addr_zip3 = req.getParameter("etc_addr_zip3");
if( etc_addr_zip3 == null){
	System.out.println(this.toString+" : etc_addr_zip3 is null" );
}else{
	System.out.println(this.toString+" : etc_addr_zip3 is "+etc_addr_zip3 );
}
String etc_addr = req.getParameter("etc_addr");
if( etc_addr == null){
	System.out.println(this.toString+" : etc_addr is null" );
}else{
	System.out.println(this.toString+" : etc_addr is "+etc_addr );
}
String etc_dtls_addr = req.getParameter("etc_dtls_addr");
if( etc_dtls_addr == null){
	System.out.println(this.toString+" : etc_dtls_addr is null" );
}else{
	System.out.println(this.toString+" : etc_dtls_addr is "+etc_dtls_addr );
}
String ceph_no1 = req.getParameter("ceph_no1");
if( ceph_no1 == null){
	System.out.println(this.toString+" : ceph_no1 is null" );
}else{
	System.out.println(this.toString+" : ceph_no1 is "+ceph_no1 );
}
String ceph_no2 = req.getParameter("ceph_no2");
if( ceph_no2 == null){
	System.out.println(this.toString+" : ceph_no2 is null" );
}else{
	System.out.println(this.toString+" : ceph_no2 is "+ceph_no2 );
}
String birth_hscl = req.getParameter("birth_hscl");
if( birth_hscl == null){
	System.out.println(this.toString+" : birth_hscl is null" );
}else{
	System.out.println(this.toString+" : birth_hscl is "+birth_hscl );
}
String birth_univ = req.getParameter("birth_univ");
if( birth_univ == null){
	System.out.println(this.toString+" : birth_univ is null" );
}else{
	System.out.println(this.toString+" : birth_univ is "+birth_univ );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String wedd_anvy_dt = req.getParameter("wedd_anvy_dt");
if( wedd_anvy_dt == null){
	System.out.println(this.toString+" : wedd_anvy_dt is null" );
}else{
	System.out.println(this.toString+" : wedd_anvy_dt is "+wedd_anvy_dt );
}
String relg = req.getParameter("relg");
if( relg == null){
	System.out.println(this.toString+" : relg is null" );
}else{
	System.out.println(this.toString+" : relg is "+relg );
}
String hby = req.getParameter("hby");
if( hby == null){
	System.out.println(this.toString+" : hby is null" );
}else{
	System.out.println(this.toString+" : hby is "+hby );
}
String army = req.getParameter("army");
if( army == null){
	System.out.println(this.toString+" : army is null" );
}else{
	System.out.println(this.toString+" : army is "+army );
}
String child_cnt = req.getParameter("child_cnt");
if( child_cnt == null){
	System.out.println(this.toString+" : child_cnt is null" );
}else{
	System.out.println(this.toString+" : child_cnt is "+child_cnt );
}
String golf = req.getParameter("golf");
if( golf == null){
	System.out.println(this.toString+" : golf is null" );
}else{
	System.out.println(this.toString+" : golf is "+golf );
}
String smok_yn = req.getParameter("smok_yn");
if( smok_yn == null){
	System.out.println(this.toString+" : smok_yn is null" );
}else{
	System.out.println(this.toString+" : smok_yn is "+smok_yn );
}
String drink_yn = req.getParameter("drink_yn");
if( drink_yn == null){
	System.out.println(this.toString+" : drink_yn is null" );
}else{
	System.out.println(this.toString+" : drink_yn is "+drink_yn );
}
String main_nwsp_subs = req.getParameter("main_nwsp_subs");
if( main_nwsp_subs == null){
	System.out.println(this.toString+" : main_nwsp_subs is null" );
}else{
	System.out.println(this.toString+" : main_nwsp_subs is "+main_nwsp_subs );
}
String wedd_yn = req.getParameter("wedd_yn");
if( wedd_yn == null){
	System.out.println(this.toString+" : wedd_yn is null" );
}else{
	System.out.println(this.toString+" : wedd_yn is "+wedd_yn );
}
String spc_matt = req.getParameter("spc_matt");
if( spc_matt == null){
	System.out.println(this.toString+" : spc_matt is null" );
}else{
	System.out.println(this.toString+" : spc_matt is "+spc_matt );
}
String vip_pers_line = req.getParameter("vip_pers_line");
if( vip_pers_line == null){
	System.out.println(this.toString+" : vip_pers_line is null" );
}else{
	System.out.println(this.toString+" : vip_pers_line is "+vip_pers_line );
}
String lvcmpy_yn = req.getParameter("lvcmpy_yn");
if( lvcmpy_yn == null){
	System.out.println(this.toString+" : lvcmpy_yn is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_yn is "+lvcmpy_yn );
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
String incmg_dt_tm = req.getParameter("incmg_dt_tm");
if( incmg_dt_tm == null){
	System.out.println(this.toString+" : incmg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_tm is "+incmg_dt_tm );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String chg_dt_tm = req.getParameter("chg_dt_tm");
if( chg_dt_tm == null){
	System.out.println(this.toString+" : chg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : chg_dt_tm is "+chg_dt_tm );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String carr_matt = req.getParameter("carr_matt");
if( carr_matt == null){
	System.out.println(this.toString+" : carr_matt is null" );
}else{
	System.out.println(this.toString+" : carr_matt is "+carr_matt );
}
String cust_mang_item = req.getParameter("cust_mang_item");
if( cust_mang_item == null){
	System.out.println(this.toString+" : cust_mang_item is null" );
}else{
	System.out.println(this.toString+" : cust_mang_item is "+cust_mang_item );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String prfl_no = Util.checkString(req.getParameter("prfl_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String chin_flnm = Util.checkString(req.getParameter("chin_flnm"));
String cur_job = Util.checkString(req.getParameter("cur_job"));
String bidt = Util.checkString(req.getParameter("bidt"));
String nativ = Util.checkString(req.getParameter("nativ"));
String sex = Util.checkString(req.getParameter("sex"));
String offi_zip1 = Util.checkString(req.getParameter("offi_zip1"));
String offi_zip2 = Util.checkString(req.getParameter("offi_zip2"));
String offi_zip3 = Util.checkString(req.getParameter("offi_zip3"));
String offi_addr = Util.checkString(req.getParameter("offi_addr"));
String offi_dtls_addr = Util.checkString(req.getParameter("offi_dtls_addr"));
String offi_tel_no = Util.checkString(req.getParameter("offi_tel_no"));
String home_zip1 = Util.checkString(req.getParameter("home_zip1"));
String home_zip2 = Util.checkString(req.getParameter("home_zip2"));
String home_zip3 = Util.checkString(req.getParameter("home_zip3"));
String home_addr = Util.checkString(req.getParameter("home_addr"));
String home_dtls_addr = Util.checkString(req.getParameter("home_dtls_addr"));
String home_tel_no = Util.checkString(req.getParameter("home_tel_no"));
String etc_addr_zip1 = Util.checkString(req.getParameter("etc_addr_zip1"));
String etc_addr_zip2 = Util.checkString(req.getParameter("etc_addr_zip2"));
String etc_addr_zip3 = Util.checkString(req.getParameter("etc_addr_zip3"));
String etc_addr = Util.checkString(req.getParameter("etc_addr"));
String etc_dtls_addr = Util.checkString(req.getParameter("etc_dtls_addr"));
String ceph_no1 = Util.checkString(req.getParameter("ceph_no1"));
String ceph_no2 = Util.checkString(req.getParameter("ceph_no2"));
String birth_hscl = Util.checkString(req.getParameter("birth_hscl"));
String birth_univ = Util.checkString(req.getParameter("birth_univ"));
String email = Util.checkString(req.getParameter("email"));
String wedd_anvy_dt = Util.checkString(req.getParameter("wedd_anvy_dt"));
String relg = Util.checkString(req.getParameter("relg"));
String hby = Util.checkString(req.getParameter("hby"));
String army = Util.checkString(req.getParameter("army"));
String child_cnt = Util.checkString(req.getParameter("child_cnt"));
String golf = Util.checkString(req.getParameter("golf"));
String smok_yn = Util.checkString(req.getParameter("smok_yn"));
String drink_yn = Util.checkString(req.getParameter("drink_yn"));
String main_nwsp_subs = Util.checkString(req.getParameter("main_nwsp_subs"));
String wedd_yn = Util.checkString(req.getParameter("wedd_yn"));
String spc_matt = Util.checkString(req.getParameter("spc_matt"));
String vip_pers_line = Util.checkString(req.getParameter("vip_pers_line"));
String lvcmpy_yn = Util.checkString(req.getParameter("lvcmpy_yn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String carr_matt = Util.checkString(req.getParameter("carr_matt"));
String cust_mang_item = Util.checkString(req.getParameter("cust_mang_item"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String prfl_no = Util.Uni2Ksc(Util.checkString(req.getParameter("prfl_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String chin_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("chin_flnm")));
String cur_job = Util.Uni2Ksc(Util.checkString(req.getParameter("cur_job")));
String bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("bidt")));
String nativ = Util.Uni2Ksc(Util.checkString(req.getParameter("nativ")));
String sex = Util.Uni2Ksc(Util.checkString(req.getParameter("sex")));
String offi_zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("offi_zip1")));
String offi_zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("offi_zip2")));
String offi_zip3 = Util.Uni2Ksc(Util.checkString(req.getParameter("offi_zip3")));
String offi_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("offi_addr")));
String offi_dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("offi_dtls_addr")));
String offi_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("offi_tel_no")));
String home_zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("home_zip1")));
String home_zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("home_zip2")));
String home_zip3 = Util.Uni2Ksc(Util.checkString(req.getParameter("home_zip3")));
String home_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("home_addr")));
String home_dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("home_dtls_addr")));
String home_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("home_tel_no")));
String etc_addr_zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_addr_zip1")));
String etc_addr_zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_addr_zip2")));
String etc_addr_zip3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_addr_zip3")));
String etc_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_addr")));
String etc_dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dtls_addr")));
String ceph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ceph_no1")));
String ceph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ceph_no2")));
String birth_hscl = Util.Uni2Ksc(Util.checkString(req.getParameter("birth_hscl")));
String birth_univ = Util.Uni2Ksc(Util.checkString(req.getParameter("birth_univ")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String wedd_anvy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("wedd_anvy_dt")));
String relg = Util.Uni2Ksc(Util.checkString(req.getParameter("relg")));
String hby = Util.Uni2Ksc(Util.checkString(req.getParameter("hby")));
String army = Util.Uni2Ksc(Util.checkString(req.getParameter("army")));
String child_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("child_cnt")));
String golf = Util.Uni2Ksc(Util.checkString(req.getParameter("golf")));
String smok_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("smok_yn")));
String drink_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("drink_yn")));
String main_nwsp_subs = Util.Uni2Ksc(Util.checkString(req.getParameter("main_nwsp_subs")));
String wedd_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("wedd_yn")));
String spc_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_matt")));
String vip_pers_line = Util.Uni2Ksc(Util.checkString(req.getParameter("vip_pers_line")));
String lvcmpy_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_yn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String chg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_tm")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String carr_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt")));
String cust_mang_item = Util.Uni2Ksc(Util.checkString(req.getParameter("cust_mang_item")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setMedi_clsf(medi_clsf);
dm.setPrfl_no(prfl_no);
dm.setFlnm(flnm);
dm.setChin_flnm(chin_flnm);
dm.setCur_job(cur_job);
dm.setBidt(bidt);
dm.setNativ(nativ);
dm.setSex(sex);
dm.setOffi_zip1(offi_zip1);
dm.setOffi_zip2(offi_zip2);
dm.setOffi_zip3(offi_zip3);
dm.setOffi_addr(offi_addr);
dm.setOffi_dtls_addr(offi_dtls_addr);
dm.setOffi_tel_no(offi_tel_no);
dm.setHome_zip1(home_zip1);
dm.setHome_zip2(home_zip2);
dm.setHome_zip3(home_zip3);
dm.setHome_addr(home_addr);
dm.setHome_dtls_addr(home_dtls_addr);
dm.setHome_tel_no(home_tel_no);
dm.setEtc_addr_zip1(etc_addr_zip1);
dm.setEtc_addr_zip2(etc_addr_zip2);
dm.setEtc_addr_zip3(etc_addr_zip3);
dm.setEtc_addr(etc_addr);
dm.setEtc_dtls_addr(etc_dtls_addr);
dm.setCeph_no1(ceph_no1);
dm.setCeph_no2(ceph_no2);
dm.setBirth_hscl(birth_hscl);
dm.setBirth_univ(birth_univ);
dm.setEmail(email);
dm.setWedd_anvy_dt(wedd_anvy_dt);
dm.setRelg(relg);
dm.setHby(hby);
dm.setArmy(army);
dm.setChild_cnt(child_cnt);
dm.setGolf(golf);
dm.setSmok_yn(smok_yn);
dm.setDrink_yn(drink_yn);
dm.setMain_nwsp_subs(main_nwsp_subs);
dm.setWedd_yn(wedd_yn);
dm.setSpc_matt(spc_matt);
dm.setVip_pers_line(vip_pers_line);
dm.setLvcmpy_yn(lvcmpy_yn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
dm.setMode(mode);
dm.setSeq(seq);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setCarr_matt(carr_matt);
dm.setCust_mang_item(cust_mang_item);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 20 17:59:50 KST 2009 */