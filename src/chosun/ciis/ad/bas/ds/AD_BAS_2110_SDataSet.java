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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_2110_SCURLIST2Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2110_SCURLISTRecord;

/**
 * 
 */


public class AD_BAS_2110_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String prfl_no;
	public String dlco_no;
	public String dlco_nm;
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

	public AD_BAS_2110_SDataSet(){}
	public AD_BAS_2110_SDataSet(String errcode, String errmsg, String prfl_no, String dlco_no, String dlco_nm, String flnm, String chin_flnm, String cur_job, String bidt, String nativ, String sex, String offi_zip1, String offi_zip2, String offi_zip3, String offi_addr, String offi_dtls_addr, String offi_tel_no, String home_zip1, String home_zip2, String home_zip3, String home_addr, String home_dtls_addr, String home_tel_no, String etc_addr_zip1, String etc_addr_zip2, String etc_addr_zip3, String etc_addr, String etc_dtls_addr, String ceph_no1, String ceph_no2, String birth_hscl, String birth_univ, String email, String wedd_anvy_dt, String relg, String hby, String army, String child_cnt, String golf, String smok_yn, String drink_yn, String main_nwsp_subs, String wedd_yn, String spc_matt, String vip_pers_line, String lvcmpy_yn, String incmg_pers_ip, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.prfl_no = prfl_no;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
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
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPrfl_no(String prfl_no){
		this.prfl_no = prfl_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPrfl_no(){
		return this.prfl_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.prfl_no = Util.checkString(cstmt.getString(7));
		this.dlco_no = Util.checkString(cstmt.getString(8));
		this.dlco_nm = Util.checkString(cstmt.getString(9));
		this.flnm = Util.checkString(cstmt.getString(10));
		this.chin_flnm = Util.checkString(cstmt.getString(11));
		this.cur_job = Util.checkString(cstmt.getString(12));
		this.bidt = Util.checkString(cstmt.getString(13));
		this.nativ = Util.checkString(cstmt.getString(14));
		this.sex = Util.checkString(cstmt.getString(15));
		this.offi_zip1 = Util.checkString(cstmt.getString(16));
		this.offi_zip2 = Util.checkString(cstmt.getString(17));
		this.offi_zip3 = Util.checkString(cstmt.getString(18));
		this.offi_addr = Util.checkString(cstmt.getString(19));
		this.offi_dtls_addr = Util.checkString(cstmt.getString(20));
		this.offi_tel_no = Util.checkString(cstmt.getString(21));
		this.home_zip1 = Util.checkString(cstmt.getString(22));
		this.home_zip2 = Util.checkString(cstmt.getString(23));
		this.home_zip3 = Util.checkString(cstmt.getString(24));
		this.home_addr = Util.checkString(cstmt.getString(25));
		this.home_dtls_addr = Util.checkString(cstmt.getString(26));
		this.home_tel_no = Util.checkString(cstmt.getString(27));
		this.etc_addr_zip1 = Util.checkString(cstmt.getString(28));
		this.etc_addr_zip2 = Util.checkString(cstmt.getString(29));
		this.etc_addr_zip3 = Util.checkString(cstmt.getString(30));
		this.etc_addr = Util.checkString(cstmt.getString(31));
		this.etc_dtls_addr = Util.checkString(cstmt.getString(32));
		this.ceph_no1 = Util.checkString(cstmt.getString(33));
		this.ceph_no2 = Util.checkString(cstmt.getString(34));
		this.birth_hscl = Util.checkString(cstmt.getString(35));
		this.birth_univ = Util.checkString(cstmt.getString(36));
		this.email = Util.checkString(cstmt.getString(37));
		this.wedd_anvy_dt = Util.checkString(cstmt.getString(38));
		this.relg = Util.checkString(cstmt.getString(39));
		this.hby = Util.checkString(cstmt.getString(40));
		this.army = Util.checkString(cstmt.getString(41));
		this.child_cnt = Util.checkString(cstmt.getString(42));
		this.golf = Util.checkString(cstmt.getString(43));
		this.smok_yn = Util.checkString(cstmt.getString(44));
		this.drink_yn = Util.checkString(cstmt.getString(45));
		this.main_nwsp_subs = Util.checkString(cstmt.getString(46));
		this.wedd_yn = Util.checkString(cstmt.getString(47));
		this.spc_matt = Util.checkString(cstmt.getString(48));
		this.vip_pers_line = Util.checkString(cstmt.getString(49));
		this.lvcmpy_yn = Util.checkString(cstmt.getString(50));
		this.incmg_pers_ip = Util.checkString(cstmt.getString(51));
		this.incmg_pers = Util.checkString(cstmt.getString(52));
		this.incmg_dt_tm = Util.checkString(cstmt.getString(53));
		this.chg_pers = Util.checkString(cstmt.getString(54));
		this.chg_dt_tm = Util.checkString(cstmt.getString(55));
		ResultSet rset0 = (ResultSet) cstmt.getObject(56);
		while(rset0.next()){
			AD_BAS_2110_SCURLISTRecord rec = new AD_BAS_2110_SCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.carr_matt = Util.checkString(rset0.getString("carr_matt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(57);
		while(rset1.next()){
			AD_BAS_2110_SCURLIST2Record rec = new AD_BAS_2110_SCURLIST2Record();
			rec.cust_mang_item = Util.checkString(rset1.getString("cust_mang_item"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2110_SDataSet ds = (AD_BAS_2110_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_2110_SCURLISTRecord curlistRec = (AD_BAS_2110_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_2110_SCURLIST2Record curlist2Rec = (AD_BAS_2110_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPrfl_no()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getFlnm()%>
<%= ds.getChin_flnm()%>
<%= ds.getCur_job()%>
<%= ds.getBidt()%>
<%= ds.getNativ()%>
<%= ds.getSex()%>
<%= ds.getOffi_zip1()%>
<%= ds.getOffi_zip2()%>
<%= ds.getOffi_zip3()%>
<%= ds.getOffi_addr()%>
<%= ds.getOffi_dtls_addr()%>
<%= ds.getOffi_tel_no()%>
<%= ds.getHome_zip1()%>
<%= ds.getHome_zip2()%>
<%= ds.getHome_zip3()%>
<%= ds.getHome_addr()%>
<%= ds.getHome_dtls_addr()%>
<%= ds.getHome_tel_no()%>
<%= ds.getEtc_addr_zip1()%>
<%= ds.getEtc_addr_zip2()%>
<%= ds.getEtc_addr_zip3()%>
<%= ds.getEtc_addr()%>
<%= ds.getEtc_dtls_addr()%>
<%= ds.getCeph_no1()%>
<%= ds.getCeph_no2()%>
<%= ds.getBirth_hscl()%>
<%= ds.getBirth_univ()%>
<%= ds.getEmail()%>
<%= ds.getWedd_anvy_dt()%>
<%= ds.getRelg()%>
<%= ds.getHby()%>
<%= ds.getArmy()%>
<%= ds.getChild_cnt()%>
<%= ds.getGolf()%>
<%= ds.getSmok_yn()%>
<%= ds.getDrink_yn()%>
<%= ds.getMain_nwsp_subs()%>
<%= ds.getWedd_yn()%>
<%= ds.getSpc_matt()%>
<%= ds.getVip_pers_line()%>
<%= ds.getLvcmpy_yn()%>
<%= ds.getIncmg_pers_ip()%>
<%= ds.getIncmg_pers()%>
<%= ds.getIncmg_dt_tm()%>
<%= ds.getChg_pers()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.seq%>
<%= curlistRec.frdt%>
<%= curlistRec.todt%>
<%= curlistRec.carr_matt%>
<%= curlist2Rec.cust_mang_item%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 20 16:17:10 KST 2009 */