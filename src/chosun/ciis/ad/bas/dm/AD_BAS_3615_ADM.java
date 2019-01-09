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


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */
public class AD_BAS_3615_ADM extends somo.framework.db.BaseDM implements java.io.Serializable
{
	public String flag;
	public String cmpy_cd;
	public String medi_clsf;
	public String dlco_no;
	public String cust_seq;
	public String dlco_no_pre;
	public String cust_seq_pre;
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
	public String mchrg_pers;
	public String peopledb_no;
	/* 고객관리사항 */
	public String cust_item;
	/* 학력사항 */   
	public String school_seq;
	public String school_frdt;
	public String school_todt;
	public String school_memo;
	/* 경력사항 */   
	public String career_seq;
	public String career_frdt;
	public String career_todt;
	public String career_memo;
	/* 입력자 */     
	public String incmg_pers_ip;
	public String incmg_pers;


	public AD_BAS_3615_ADM(){}
	public AD_BAS_3615_ADM(String flag, String cmpy_cd, String medi_clsf, String dlco_no, String cust_seq, String dlco_no_pre, String cust_seq_pre, String cust_name, String department, String position, String mobile1, String mobile2, String phone1, String phone2, String homepage, String fax, String email, String cmpy_zip1, String cmpy_zip2, String cmpy_addr, String cmpy_dtls_addr, String home_zip1, String home_zip2, String home_addr, String home_dtls_addr, String etc_zip1, String etc_zip2, String etc_addr, String etc_dtls_addr, String task1, String task1_represent, String task2, String task2_represent, String incumbent_yn, String sex, String birth_place, String birth_day, String wedding_yn, String wedding_day, String family_size, String religion, String military_service, String hobby, String golf, String drinking, String smoking, String remk, String protensity, String reputation, String slcrg_pers, String mchrg_pers, String peopledb_no, String cust_item, String school_seq, String school_frdt, String school_todt, String school_memo, String career_seq, String career_frdt, String career_todt, String career_memo, String incmg_pers_ip, String incmg_pers)
	{
		this.cmpy_cd         =	cmpy_cd;
		this.medi_clsf       =	medi_clsf;
		this.dlco_no         =	dlco_no;
		this.cust_seq        =	cust_seq;
		this.dlco_no_pre     =	dlco_no_pre;
		this.cust_seq_pre    =	cust_seq_pre;
		this.cust_name       =	cust_name;
		this.department      =	department;
		this.position        =	position;
		this.mobile1         =	mobile1;
		this.mobile2         =	mobile2;
		this.phone1          =	phone1;
		this.phone2          =	phone2;
		this.homepage        =	homepage;
		this.fax             =	fax;
		this.email           =	email           ;
		this.cmpy_zip1       =	cmpy_zip1       ;
		this.cmpy_zip2       =	cmpy_zip2       ;
		this.cmpy_addr       =	cmpy_addr       ;
		this.cmpy_dtls_addr  =	cmpy_dtls_addr  ;
		this.home_zip1       =	home_zip1       ;
		this.home_zip2       =	home_zip2       ;
		this.home_addr       =	home_addr       ;
		this.home_dtls_addr  =	home_dtls_addr  ;
		this.etc_zip1        =	etc_zip1        ;
		this.etc_zip2        =	etc_zip2        ;
		this.etc_addr        =	etc_addr        ;
		this.etc_dtls_addr   =	etc_dtls_addr   ;
		this.task1           =	task1           ;
		this.task1_represent =	task1_represent ;
		this.task2           =	task2           ;
		this.task2_represent =	task2_represent ;
		this.incumbent_yn    =	incumbent_yn    ;
		this.sex             =	sex             ;
		this.birth_place     =	birth_place     ;
		this.birth_day       =	birth_day       ;
		this.wedding_yn      =	wedding_yn      ;
		this.wedding_day     =	wedding_day     ;
		this.family_size     =	family_size     ;
		this.religion        =	religion        ;
		this.military_service=	military_service;
		this.hobby           =	hobby           ;
		this.golf            =	golf            ;
		this.drinking        =	drinking        ;
		this.smoking         =	smoking         ;
		this.remk            =	remk            ;
		this.protensity      =	protensity;
		this.reputation      =	reputation      ;
		this.slcrg_pers      =	slcrg_pers      ;
		this.mchrg_pers      =	mchrg_pers      ;
		this.peopledb_no     =	peopledb_no     ;
		this.cust_item       =	cust_item       ;
		this.school_seq      =	school_seq      ;
		this.school_frdt     =	school_frdt     ;
		this.school_todt     =	school_todt     ;
		this.school_memo     =	school_memo     ;
		this.career_seq      =	career_seq      ;
		this.career_frdt     =	career_frdt     ;
		this.career_todt     =	career_todt     ;
		this.career_memo     =	career_memo     ;
		this.incmg_pers_ip	=	incmg_pers_ip;
		this.incmg_pers		=	incmg_pers;
	}

	public void setFlag(String flag)
	{
		this.flag = flag;
	}
	public void setCmpyCd(String cmpy_cd)
	{
		this.cmpy_cd = cmpy_cd;
	}
	public void setMediClsf(String medi_clsf)
	{
		this.medi_clsf = medi_clsf;
	}
	public void setDlcoNo(String dlco_no)
	{
		this.dlco_no =	dlco_no;
	}
	public void setCustSeq(String cust_seq)
	{
		this.cust_seq =	cust_seq;
	}
	public void setDlcoNoPre(String dlco_no_pre)
	{
		this.dlco_no_pre =	dlco_no_pre;
	}
	public void setCustSeqPre(String cust_seq_pre)
	{
		this.cust_seq_pre =	cust_seq_pre;
	}
	public void setCustName(String cust_name)
	{
		this.cust_name = cust_name;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public void setPosition(String position)
	{
		this.position =	position;
	}
	public void setMobile1(String mobile1)
	{
		this.mobile1 = mobile1;
	}
	public void setMobile2(String mobile2)
	{
		this.mobile2 = mobile2;
	}
	public void setPhone1(String phone1)
	{
		this.phone1 = phone1;
	}
	public void setPhone2(String phone2)
	{
		this.phone2 = phone2;
	}
	public void setHomepage(String homepage)
	{
		this.homepage =	homepage;
	}
	public void setFax(String fax)
	{
		this.fax = fax;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setCmpyZip1(String cmpy_zip1)
	{
		this.cmpy_zip1 = cmpy_zip1;
	}
	public void setCmpyZip2(String cmpy_zip2)
	{
		this.cmpy_zip2 = cmpy_zip2;
	}
	public void setCmpyAddr(String cmpy_addr)
	{
		this.cmpy_addr = cmpy_addr;
	}
	public void setCmpyDtlsAddr(String cmpy_dtls_addr)
	{
		this.cmpy_dtls_addr = cmpy_dtls_addr;
	}
	public void setHomeZip1(String home_zip1)
	{
		this.home_zip1 = home_zip1;
	}
	public void setHomeZip2(String home_zip2)
	{
		this.home_zip2 = home_zip2;
	}
	public void setHomeAddr(String home_addr)
	{
		this.home_addr = home_addr;
	}
	public void setHomeDtlsAddr(String home_dtls_addr)
	{
		this.home_dtls_addr = home_dtls_addr;
	}
	public void setEtcZip1(String etc_zip1)
	{
		this.etc_zip1 =	etc_zip1;
	}
	public void setEtcZip2(String etc_zip2)
	{
		this.etc_zip2 =	etc_zip2;
	}
	public void setEtcAddr(String etc_addr)
	{
		this.etc_addr =	etc_addr;
	}
	public void setEtcDtlsAddr(String etc_dtls_addr)
	{
		this.etc_dtls_addr = etc_dtls_addr;
	}
	public void setTask1(String task1)
	{
		this.task1 = task1;
	}
	public void setTask1Represent(String task1_represent)
	{
		this.task1_represent = task1_represent;
	}
	public void setTask2(String task2)
	{
		this.task2 = task2;
	}
	public void setTask2Represent(String task2_represent)
	{
		this.task2_represent = task2_represent;
	}
	public void setIncumbentYn(String incumbent_yn)
	{
		this.incumbent_yn =	incumbent_yn;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public void setBirthPlace(String birth_place)
	{
		this.birth_place = birth_place;
	}
	public void setBirthDay(String birth_day)
	{
		this.birth_day = birth_day;
	}
	public void setWeddingYn(String wedding_yn)
	{
		this.wedding_yn = wedding_yn;
	}
	public void setWeddingDay(String wedding_day)
	{
		this.wedding_day = wedding_day;
	}
	public void setFamilySize(String family_size)
	{
		this.family_size = family_size;
	}
	public void setReligion(String religion)
	{
		this.religion =	religion;
	}
	public void setMilitaryService(String military_service)
	{
		this.military_service =	military_service;
	}
	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	public void setGolf(String golf)
	{
		this.golf =	golf;
	}
	public void setDrinking(String drinking)
	{
		this.drinking =	drinking;
	}
	public void setSmoking(String smoking)
	{
		this.smoking = smoking;
	}
	public void setRemk(String remk)
	{
		this.remk =	remk;
	}
	public void setProtensity(String protensity)
	{
		this.protensity = protensity;
	}
	public void setReputation(String reputation)
	{
		this.reputation = reputation;
	}
	public void setSlcrgPers(String slcrg_pers)
	{
		this.slcrg_pers = slcrg_pers;
	}
	public void setMchrgPers(String mchrg_pers)
	{
		this.mchrg_pers = mchrg_pers;
	}
	public void setPeopledbNo(String peopledb_no)
	{
		this.peopledb_no = peopledb_no;
	}
	public void setCustItem(String cust_item)
	{
		this.cust_item = cust_item;
	}
	public void setSchoolSeq(String school_seq)
	{
		this.school_seq = school_seq;
	}
	public void setSchoolFrdt(String school_frdt)
	{
		this.school_frdt = school_frdt;
	}
	public void setSchoolTodt(String school_todt)
	{
		this.school_todt = school_todt;
	}
	public void setSchoolMemo(String school_memo)
	{
		this.school_memo = school_memo;
	}
	public void setCareerSeq(String career_seq)
	{
		this.career_seq = career_seq;
	}
	public void setCareerFrdt(String career_frdt)
	{
		this.career_frdt = career_frdt;
	}
	public void setCareerTodt(String career_todt)
	{
		this.career_todt = career_todt;
	}
	public void setCareerMemo(String career_memo)
	{
		this.career_memo = career_memo;
	}
	public void setIncmgPersIp(String incmg_pers_ip)
	{
		this.incmg_pers_ip = incmg_pers_ip;
	}
	public void setIncmgPers(String incmg_pers)
	{
		this.incmg_pers = incmg_pers;
	}
	
	public String getFlag()
	{
		return this.flag;
	}
	public String getCmpyCd()
	{
		return this.cmpy_cd;
	}
	public String getMediClsf()
	{
		return this.medi_clsf;
	}
	public String getDlcoNo()
	{
		return this.dlco_no;
	}
	public String getCustSeq()
	{
		return this.cust_seq;
	}
	public String getDlcoNoPre()
	{
		return this.dlco_no_pre;
	}
	public String getCustSeqPre()
	{
		return this.cust_seq_pre;
	}
	public String getCustName()
	{
		return this.cust_name;
	}
	public String getDepartment()
	{
		return this.department;
	}
	public String getPosition()
	{
		return this.position;
	}
	public String getMobile1()
	{
		return this.mobile1;
	}
	public String getMobile2()
	{
		return this.mobile2;
	}
	public String getPhone1()
	{
		return this.phone1;
	}
	public String getPhone2()
	{
		return this.phone2;
	}
	public String getHomepage()
	{
		return this.homepage;
	}
	public String getFax()
	{
		return this.fax;
	}
	public String getEmail()
	{
		return this.email;
	}
	public String getCmpyZip1()
	{
		return this.cmpy_zip1;
	}
	public String getCmpyZip2()
	{
		return this.cmpy_zip2;
	}
	public String getCmpyAddr()
	{
		return this.cmpy_addr;
	}
	public String getCmpyDtlsAddr()
	{
		return this.cmpy_dtls_addr;
	}
	public String getHomeZip1()
	{
		return this.home_zip1;
	}
	public String getHomeZip2()
	{
		return this.home_zip2;
	}
	public String getHomeAddr()
	{
		return this.home_addr;
	}
	public String getHomeDtlsAddr()
	{
		return this.home_dtls_addr;
	}
	public String getEtcZip1()
	{
		return this.etc_zip1;
	}
	public String getEtcZip2()
	{
		return this.etc_zip2;
	}
	public String getEtcAddr()
	{
		return this.etc_addr;
	}
	public String getEtcDtlsAddr()
	{
		return this.etc_dtls_addr;
	}
	public String getTask1()
	{
		return this.task1;
	}
	public String getTask1Represent()
	{
		return this.task1_represent;
	}
	public String getTask2()
	{
		return this.task2;
	}
	public String getTask2Represent()
	{
		return this.task2_represent;
	}
	public String getIncumbentYn()
	{
		return this.incumbent_yn;
	}
	public String getSex()
	{
		return this.sex;
	}
	public String getBirthPlace()
	{
		return this.birth_place;
	}
	public String getBirthDay()
	{
		return this.birth_day;
	}
	public String getWeddingYn()
	{
		return this.wedding_yn;
	}
	public String getWeddingDay()
	{
		return this.wedding_day;
	}
	public String getFamilySize()
	{
		return this.family_size;
	}
	public String getReligion()
	{
		return this.religion;
	}
	public String getMilitaryService()
	{
		return this.military_service;
	}
	public String getHobby()
	{
		return this.hobby;
	}
	public String getGolf()
	{
		return this.golf;
	}
	public String getDrinking()
	{
		return this.drinking;
		}
	public String getSmoking()
	{
		return this.smoking;
		}
	public String getRemk()
	{
		return this.remk;
	}
	public String getProtensity()
	{
		return this.protensity;
	}
	public String getReputation()
	{
		return this.reputation;
	}
	public String getSlcrgPers()
	{
		return this.slcrg_pers;
	}
	public String getMchrgPers()
	{
		return this.mchrg_pers;
	}
	public String getPeopledbNo()
	{
		return this.peopledb_no;
	}
	public String getCustItem()
	{
		return this.cust_item;
	}
	public String getSchoolSeq()
	{
		return this.school_seq;
	}
	public String getSchoolFrdt()
	{
		return this.school_frdt;
	}
	public String getSchoolTodt()
	{
		return this.school_todt;
	}
	public String getSchoolMemo()
	{
		return this.school_memo;
	}
	public String getCareerSeq()
	{
		return this.career_seq;
	}
	public String getCareerFrdt()
	{
		return this.career_frdt;
	}
	public String getCareerTodt()
	{
		return this.career_todt;
	}
	public String getCareerMemo()
	{
		return this.career_memo;
	}
	public String getIncmgPersIp()
	{
		return this.incmg_pers_ip;
	}
	public String getIncmgPers()
	{
		return this.incmg_pers;
	}
 
	public String getSQL()
	{
		 return "{ call SP_AD_BAS_3615_A(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException
	{
		AD_BAS_3615_ADM dm = (AD_BAS_3615_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_clsf);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.cust_seq);
		cstmt.setString(8, dm.dlco_no_pre);
		cstmt.setString(9, dm.cust_seq_pre);
		cstmt.setString(10, dm.cust_name);
		cstmt.setString(11, dm.department);
		cstmt.setString(12, dm.position);
		cstmt.setString(13, dm.mobile1);
		cstmt.setString(14, dm.mobile2);
		cstmt.setString(15, dm.phone1);
		cstmt.setString(16, dm.phone2);
		cstmt.setString(17, dm.homepage);
		cstmt.setString(18, dm.fax);
		cstmt.setString(19, dm.email);
		cstmt.setString(20, dm.cmpy_zip1);
		cstmt.setString(21, dm.cmpy_zip2);
		cstmt.setString(22, dm.cmpy_addr);
		cstmt.setString(23, dm.cmpy_dtls_addr);
		cstmt.setString(24, dm.home_zip1);
		cstmt.setString(25, dm.home_zip2);
		cstmt.setString(26, dm.home_addr);
		cstmt.setString(27, dm.home_dtls_addr);
		cstmt.setString(28, dm.etc_zip1);
		cstmt.setString(29, dm.etc_zip2);
		cstmt.setString(30, dm.etc_addr);
		cstmt.setString(31, dm.etc_dtls_addr);
		cstmt.setString(32, dm.task1);
		cstmt.setString(33, dm.task1_represent);
		cstmt.setString(34, dm.task2);
		cstmt.setString(35, dm.task2_represent);
		cstmt.setString(36, dm.incumbent_yn);
		cstmt.setString(37, dm.sex);
		cstmt.setString(38, dm.birth_place);
		cstmt.setString(39, dm.birth_day);
		cstmt.setString(40, dm.wedding_yn);
		cstmt.setString(41, dm.wedding_day);
		cstmt.setString(42, dm.family_size);
		cstmt.setString(43, dm.religion);
		cstmt.setString(44, dm.military_service);
		cstmt.setString(45, dm.hobby);
		cstmt.setString(46, dm.golf);
		cstmt.setString(47, dm.drinking);
		cstmt.setString(48, dm.smoking);
		cstmt.setString(49, dm.remk);
		
		cstmt.setString(50, dm.protensity);
		cstmt.setString(51, dm.reputation);
		cstmt.setString(52, dm.slcrg_pers);
		cstmt.setString(53, dm.mchrg_pers);
		cstmt.setString(54, dm.peopledb_no);
		cstmt.setString(55, dm.cust_item);
		cstmt.setString(56, dm.school_seq);
		cstmt.setString(57, dm.school_frdt);
		cstmt.setString(58, dm.school_todt);
		cstmt.setString(59, dm.school_memo);
		cstmt.setString(60, dm.career_seq);
		cstmt.setString(61, dm.career_frdt);
		cstmt.setString(62, dm.career_todt);
		cstmt.setString(63, dm.career_memo);     
		cstmt.setString(64, dm.incmg_pers_ip);
		cstmt.setString(65, dm.incmg_pers);
		cstmt.registerOutParameter(66, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject()
	{
		return new chosun.ciis.ad.bas.ds.AD_BAS_3615_ADataSet();
	}



    public void print(){
        System.out.println("flag = " + getFlag());
        System.out.println("cmpy_cd = " + getCmpyCd());
        System.out.println("medi_clsf = " + getMediClsf());
        System.out.println("dlco_no = " + getDlcoNo());
    }
}