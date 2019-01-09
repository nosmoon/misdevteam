/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.16
* 작성자 : KBS
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
import chosun.ciis.ad.bas.rec.AD_BAS_3611_SCURLISTRecord;
import chosun.ciis.ad.bas.rec.AD_BAS_3611_SCURLIST2Record;

/**
 * 
 */


public class AD_BAS_3611_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable
{
	public ArrayList item_curlist 	= new ArrayList();
	public ArrayList school_curlist = new ArrayList();
	public ArrayList career_curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String medi_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String cust_seq;
	public String cust_name;
	public String department;
	public String position;
	public String mobile1;
	public String mobile2;
	public String phone1;
	public String phone2;
	public String homepage;
	public String fax;
	public String email;
	public String cmpy_zip1;
	public String cmpy_zip2;
	public String cmpy_addr;
	public String cmpy_dtls_addr;
	public String home_zip1;
	public String home_zip2;
	public String home_addr;
	public String home_dtls_addr;
	public String etc_zip1;
	public String etc_zip2;
	public String etc_addr;
	public String etc_dtls_addr;
	public String task1;
	public String task1_represent;
	public String task2;
	public String task2_represent;
	public String incumbent_yn;
	public String sex;
	public String birth_place;
	public String birth_day;
	public String wedding_yn;
	public String wedding_day;
	public String family_size;
	public String religion;
	public String military_service;
	public String hobby;
	public String golf;
	public String drinking;
	public String smoking;
	public String remk;
	public String protensity;
	public String reputation;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String chg_pers;
	public String chg_pers_nm;
	public String chg_dt_tm;
	public String peopledb_no;
	public String del_yn;

	public String getMedi_clsf() {
		return medi_clsf;
	}
	public void setMedi_clsf(String medi_clsf) {
		this.medi_clsf = medi_clsf;
	}
	public String getDlco_no() {
		return dlco_no;
	}
	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}
	public String getDlco_nm() {
		return dlco_nm;
	}
	public void setDlco_nm(String dlco_nm) {
		this.dlco_nm = dlco_nm;
	}
	public String getCust_seq() {
		return cust_seq;
	}
	public void setCust_seq(String cust_seq) {
		this.cust_seq = cust_seq;
	}
	public String getBirth_day() {
		return birth_day;
	}
	public void setBirth_day(String birth_day) {
		this.birth_day = birth_day;
	}
	public String getBirth_place() {
		return birth_place;
	}
	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}
	public ArrayList getCareer_curlist() {
		return career_curlist;
	}
	public void setCareer_curlist(ArrayList career_curlist) {
		this.career_curlist = career_curlist;
	}
	public String getChg_dt_tm() {
		return chg_dt_tm;
	}
	public void setChg_dt_tm(String chg_dt_tm) {
		this.chg_dt_tm = chg_dt_tm;
	}
	public String getChg_pers() {
		return chg_pers;
	}
	public void setChg_pers(String chg_pers) {
		this.chg_pers = chg_pers;
	}
	public String getChg_pers_nm() {
		return chg_pers_nm;
	}
	public void setChg_pers_nm(String chg_pers_nm) {
		this.chg_pers_nm = chg_pers_nm;
	}
	public String getCmpy_addr() {
		return cmpy_addr;
	}
	public void setCmpy_addr(String cmpy_addr) {
		this.cmpy_addr = cmpy_addr;
	}
	public String getCmpy_dtls_addr() {
		return cmpy_dtls_addr;
	}
	public void setCmpy_dtls_addr(String cmpy_dtls_addr) {
		this.cmpy_dtls_addr = cmpy_dtls_addr;
	}
	public String getCmpy_zip1() {
		return cmpy_zip1;
	}
	public void setCmpy_zip1(String cmpy_zip1) {
		this.cmpy_zip1 = cmpy_zip1;
	}
	public String getCmpy_zip2() {
		return cmpy_zip2;
	}
	public void setCmpy_zip2(String cmpy_zip2) {
		this.cmpy_zip2 = cmpy_zip2;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getDel_yn() {
		return del_yn;
	}
	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDrinking() {
		return drinking;
	}
	public void setDrinking(String drinking) {
		this.drinking = drinking;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getEtc_addr() {
		return etc_addr;
	}
	public void setEtc_addr(String etc_addr) {
		this.etc_addr = etc_addr;
	}
	public String getEtc_dtls_addr() {
		return etc_dtls_addr;
	}
	public void setEtc_dtls_addr(String etc_dtls_addr) {
		this.etc_dtls_addr = etc_dtls_addr;
	}
	public String getEtc_zip1() {
		return etc_zip1;
	}
	public void setEtc_zip1(String etc_zip1) {
		this.etc_zip1 = etc_zip1;
	}
	public String getEtc_zip2() {
		return etc_zip2;
	}
	public void setEtc_zip2(String etc_zip2) {
		this.etc_zip2 = etc_zip2;
	}
	public String getFamily_size() {
		return family_size;
	}
	public void setFamily_size(String family_size) {
		this.family_size = family_size;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getGolf() {
		return golf;
	}
	public void setGolf(String golf) {
		this.golf = golf;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getHome_addr() {
		return home_addr;
	}
	public void setHome_addr(String home_addr) {
		this.home_addr = home_addr;
	}
	public String getHome_dtls_addr() {
		return home_dtls_addr;
	}
	public void setHome_dtls_addr(String home_dtls_addr) {
		this.home_dtls_addr = home_dtls_addr;
	}
	public String getHome_zip1() {
		return home_zip1;
	}
	public void setHome_zip1(String home_zip1) {
		this.home_zip1 = home_zip1;
	}
	public String getHome_zip2() {
		return home_zip2;
	}
	public void setHome_zip2(String home_zip2) {
		this.home_zip2 = home_zip2;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getIncumbent_yn() {
		return incumbent_yn;
	}
	public void setIncumbent_yn(String incumbent_yn) {
		this.incumbent_yn = incumbent_yn;
	}
	public ArrayList getItem_curlist() {
		return item_curlist;
	}
	public void setItem_curlist(ArrayList item_curlist) {
		this.item_curlist = item_curlist;
	}
	public String getMchrg_pers() {
		return mchrg_pers;
	}
	public void setMchrg_pers(String mchrg_pers) {
		this.mchrg_pers = mchrg_pers;
	}
	public String getMchrg_pers_nm() {
		return mchrg_pers_nm;
	}
	public void setMchrg_pers_nm(String mchrg_pers_nm) {
		this.mchrg_pers_nm = mchrg_pers_nm;
	}
	public String getMilitary_service() {
		return military_service;
	}
	public void setMilitary_service(String military_service) {
		this.military_service = military_service;
	}
	public String getMobile1() {
		return mobile1;
	}
	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}
	public String getMobile2() {
		return mobile2;
	}
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}
	public String getPeopledb_no() {
		return peopledb_no;
	}
	public void setPeopledb_no(String peopledb_no) {
		this.peopledb_no = peopledb_no;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getProtensity() {
		return protensity;
	}
	public void setProtensity(String protensity) {
		this.protensity = protensity;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getRemk() {
		return remk;
	}
	public void setRemk(String remk) {
		this.remk = remk;
	}
	public String getReputation() {
		return reputation;
	}
	public void setReputation(String reputation) {
		this.reputation = reputation;
	}
	public ArrayList getSchool_curlist() {
		return school_curlist;
	}
	public void setSchool_curlist(ArrayList school_curlist) {
		this.school_curlist = school_curlist;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSlcrg_pers() {
		return slcrg_pers;
	}
	public void setSlcrg_pers(String slcrg_pers) {
		this.slcrg_pers = slcrg_pers;
	}
	public String getSlcrg_pers_nm() {
		return slcrg_pers_nm;
	}
	public void setSlcrg_pers_nm(String slcrg_pers_nm) {
		this.slcrg_pers_nm = slcrg_pers_nm;
	}
	public String getSmoking() {
		return smoking;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public String getTask1() {
		return task1;
	}
	public void setTask1(String task1) {
		this.task1 = task1;
	}
	public String getTask1_represent() {
		return task1_represent;
	}
	public void setTask1_represent(String task1_represent) {
		this.task1_represent = task1_represent;
	}
	public String getTask2() {
		return task2;
	}
	public void setTask2(String task2) {
		this.task2 = task2;
	}
	public String getTask2_represent() {
		return task2_represent;
	}
	public void setTask2_represent(String task2_represent) {
		this.task2_represent = task2_represent;
	}
	public String getWedding_day() {
		return wedding_day;
	}
	public void setWedding_day(String wedding_day) {
		this.wedding_day = wedding_day;
	}
	public String getWedding_yn() {
		return wedding_yn;
	}
	public void setWedding_yn(String wedding_yn) {
		this.wedding_yn = wedding_yn;
	}
	public AD_BAS_3611_SDataSet(){}
	public AD_BAS_3611_SDataSet(String errcode, String errmsg, String medi_clsf, String dlco_no, String dlco_nm, String cust_seq, String cust_name, String department, String position, String mobile1, String mobile2, String phone1, String phone2, String homepage, String fax, String email, String cmpy_zip1, String cmpy_zip2, String cmpy_addr, String cmpy_dtls_addr, String home_zip1, String home_zip2, String home_addr, String home_dtls_addr, String etc_zip1, String etc_zip2, String etc_addr, String etc_dtls_addr, String task1, String task1_represent, String task2, String task2_represent, String incumbent_yn, String sex, String birth_place, String birth_day, String wedding_yn, String wedding_day, String family_size, String religion, String military_service, String hobby, String golf, String drinking, String smoking, String remk, String protensity, String reputation, String slcrg_pers, String slcrg_pers_nm, String mchrg_pers, String mchrg_pers_nm, String chg_pers, String chg_pers_nm, String chg_dt_tm, String peopledb_no, String del_yn) {
		super();
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_clsf = medi_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.cust_seq = cust_seq;
		this.cust_name = cust_name;
		this.department = department;
		this.position = position;
		this.mobile1 = mobile1;
		this.mobile2 = mobile2;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.homepage = homepage;
		this.fax = fax;
		this.email = email;
		this.cmpy_zip1 = cmpy_zip1;
		this.cmpy_zip2 = cmpy_zip2;
		this.cmpy_addr = cmpy_addr;
		this.cmpy_dtls_addr = cmpy_dtls_addr;
		this.home_zip1 = home_zip1;
		this.home_zip2 = home_zip2;
		this.home_addr = home_addr;
		this.home_dtls_addr = home_dtls_addr;
		this.etc_zip1 = etc_zip1;
		this.etc_zip2 = etc_zip2;
		this.etc_addr = etc_addr;
		this.etc_dtls_addr = etc_dtls_addr;
		this.task1 = task1;
		this.task1_represent = task1_represent;
		this.task2 = task2;
		this.task2_represent = task2_represent;
		this.incumbent_yn = incumbent_yn;
		this.sex = sex;
		this.birth_place = birth_place;
		this.birth_day = birth_day;
		this.wedding_yn = wedding_yn;
		this.wedding_day = wedding_day;
		this.family_size = family_size;
		this.religion = religion;
		this.military_service = military_service;
		this.hobby = hobby;
		this.golf = golf;
		this.drinking = drinking;
		this.smoking = smoking;
		this.remk = remk;
		this.protensity = protensity;
		this.reputation = reputation;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.chg_pers = chg_pers;
		this.chg_pers_nm = chg_pers_nm;
		this.chg_dt_tm = chg_dt_tm;
		this.peopledb_no = peopledb_no;
		this.del_yn = del_yn;
	}
	
	public void getValues(CallableStatement cstmt) throws SQLException
	{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){		return;		}
		this.medi_clsf 		= Util.checkString(cstmt.getString(4));
		this.dlco_no 		= Util.checkString(cstmt.getString(5));
		this.cust_seq 		= Util.checkString(cstmt.getString(6));
		this.cust_name 		= Util.checkString(cstmt.getString(7));
		this.department 	= Util.checkString(cstmt.getString(8));
		this.position 		= Util.checkString(cstmt.getString(9));
		this.mobile1 		= Util.checkString(cstmt.getString(10));
		this.mobile2 		= Util.checkString(cstmt.getString(11));
		this.phone1 		= Util.checkString(cstmt.getString(12));
		this.phone2 		= Util.checkString(cstmt.getString(13));
		this.homepage 		= Util.checkString(cstmt.getString(14));
		this.fax 			= Util.checkString(cstmt.getString(15));
		this.email 			= Util.checkString(cstmt.getString(16));
		this.cmpy_zip1 		= Util.checkString(cstmt.getString(17));
		this.cmpy_zip2 		= Util.checkString(cstmt.getString(18));
		this.cmpy_addr 		= Util.checkString(cstmt.getString(19));
		this.cmpy_dtls_addr = Util.checkString(cstmt.getString(20));
		this.home_zip1 		= Util.checkString(cstmt.getString(21));
		this.home_zip2 		= Util.checkString(cstmt.getString(22));
		this.home_addr 		= Util.checkString(cstmt.getString(23));
		this.home_dtls_addr = Util.checkString(cstmt.getString(24));
		this.etc_zip1 		= Util.checkString(cstmt.getString(25));
		this.etc_zip2 		= Util.checkString(cstmt.getString(26));
		this.etc_addr 		= Util.checkString(cstmt.getString(27));
		this.etc_dtls_addr 	= Util.checkString(cstmt.getString(28));
		this.task1 			= Util.checkString(cstmt.getString(29));
		this.task1_represent= Util.checkString(cstmt.getString(30));
		this.task2 			= Util.checkString(cstmt.getString(31));
		this.task2_represent= Util.checkString(cstmt.getString(32));
		this.incumbent_yn 	= Util.checkString(cstmt.getString(33));
		this.sex 			= Util.checkString(cstmt.getString(34));
		this.birth_place 	= Util.checkString(cstmt.getString(35));
		this.birth_day 		= Util.checkString(cstmt.getString(36));
		this.wedding_yn 	= Util.checkString(cstmt.getString(37));
		this.wedding_day 	= Util.checkString(cstmt.getString(38));
		this.family_size 	= Util.checkString(cstmt.getString(39));
		this.religion 		= Util.checkString(cstmt.getString(40));
		this.military_service = Util.checkString(cstmt.getString(41));
		this.hobby 			= Util.checkString(cstmt.getString(42));
		this.golf 			= Util.checkString(cstmt.getString(43));
		this.drinking 		= Util.checkString(cstmt.getString(44));
		this.smoking 		= Util.checkString(cstmt.getString(45));
		this.remk 			= Util.checkString(cstmt.getString(46));
		this.protensity 	= Util.checkString(cstmt.getString(47));
		this.reputation 	= Util.checkString(cstmt.getString(48));
		this.slcrg_pers 	= Util.checkString(cstmt.getString(49));
		this.slcrg_pers_nm 	= Util.checkString(cstmt.getString(50));
		this.mchrg_pers 	= Util.checkString(cstmt.getString(51));
		this.mchrg_pers_nm 	= Util.checkString(cstmt.getString(52));
		this.chg_pers 		= Util.checkString(cstmt.getString(53));
		this.chg_pers_nm 	= Util.checkString(cstmt.getString(54));
		this.chg_dt_tm 		= Util.checkString(cstmt.getString(55));
		this.peopledb_no 	= Util.checkString(cstmt.getString(56));
		this.del_yn 		= Util.checkString(cstmt.getString(57));
		this.dlco_nm 		= Util.checkString(cstmt.getString(58));
		
		ResultSet rset0 = (ResultSet) cstmt.getObject(59);
		while(rset0.next())
		{
			AD_BAS_3611_SCURLIST2Record rec = new AD_BAS_3611_SCURLIST2Record();
			rec.item_cd = Util.checkString(rset0.getString("item_cd"));
			this.item_curlist.add(rec);
		}		
		ResultSet rset1 = (ResultSet) cstmt.getObject(60);
		while(rset1.next())
		{
			AD_BAS_3611_SCURLISTRecord rec = new AD_BAS_3611_SCURLISTRecord();
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.frdt = Util.checkString(rset1.getString("frdt"));
			rec.todt = Util.checkString(rset1.getString("todt"));
			rec.memo = Util.checkString(rset1.getString("memo"));
			this.school_curlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(61);
		while(rset2.next())
		{
			AD_BAS_3611_SCURLISTRecord rec = new AD_BAS_3611_SCURLISTRecord();
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.frdt = Util.checkString(rset2.getString("frdt"));
			rec.todt = Util.checkString(rset2.getString("todt"));
			rec.memo = Util.checkString(rset2.getString("memo"));
			this.career_curlist.add(rec);
		}
		
	}	
}