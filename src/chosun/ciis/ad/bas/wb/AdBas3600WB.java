/***************************************************************************************************
* 파일명 : .java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.ad.bas.dao.AdBas3600DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_3600_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3601_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3605_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_3610_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3611_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3612_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3615_ADM;

import chosun.ciis.ad.bas.ds.AD_BAS_3600_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3601_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3605_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3610_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3611_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3612_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3615_ADataSet;

/**
 * 업무구분, 코드구분의 combobox 데이타가져오기
 *
 * @param req HttpServletRequest
 * @param res HttpServletResponse
 * @throws AppException
 */

public class AdBas3600WB extends BaseWB
{
	public void ad_bas_3600_m(HttpServletRequest req, HttpServletResponse res) throws AppException
	{
		AD_BAS_3600_MDataSet ds = null;
		AD_BAS_3600_MDM dm = new AD_BAS_3600_MDM();
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setCmpy_cd(cmpy_cd);
		try
		{
			AdBas3600DAO dao = new AdBas3600DAO();
			ds = dao.ad_bas_3600_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (AppException e)
		{
			throw e;
		}
	}
	
	public void ad_bas_3601_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException
	{	
    	AD_BAS_3601_LDataSet ds = null;

    	String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf	= Util.checkString(req.getParameter("medi_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm 		= Util.checkString(req.getParameter("dlco_nm"));
    	String cust_seq 	= Util.checkString(req.getParameter("cust_seq"));
    	String grp_cmpy		= Util.checkString(req.getParameter("grp_cmpy"));
    	String slcrg_pers	= Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers	= Util.checkString(req.getParameter("mchrg_pers"));
    	String chrg_pers	= Util.checkString(req.getParameter("chrg_pers"));
    	String cust_item	= Util.checkString(req.getParameter("cust_item_list"));

        // DM Setting
    	AD_BAS_3601_LDM dm = new AD_BAS_3601_LDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setDlco_nm(dlco_nm);
    	dm.setCust_seq(cust_seq);
    	dm.setGrp_cmpy(grp_cmpy);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setChrg_pers(chrg_pers);
    	dm.setCust_item(cust_item);

        try
        {
        	AdBas3600DAO	dao = new AdBas3600DAO();
            ds = dao.ad_bas_3601_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }
	}
	
	public void ad_bas_3605_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException
	{	
    	AD_BAS_3605_ADataSet ds = null;

    	String flag 			= Util.checkString(req.getParameter("flag"));
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	//String medi_clsf 		= Util.checkString(req.getParameter("medi_clsf"));
    	//String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	//String cust_seq 		= Util.checkString(req.getParameter("cust_seq"));
    	String cust_item_yn		= Util.checkString(req.getParameter("cust_item_yn"));
    	String cust_item		= Util.checkString(req.getParameter("cust_item"));
    	String slcrg_pers_yn	= Util.checkString(req.getParameter("slcrg_pers_yn"));
    	String slcrg_pers 		= Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers_yn	= Util.checkString(req.getParameter("mchrg_pers_yn"));
    	String mchrg_pers 		= Util.checkString(req.getParameter("mchrg_pers"));

System.out.println("start");    	
    	String multiUpdateData 	= Util.checkString(req.getParameter("multiUpdateData"));
System.out.println(multiUpdateData);
    	Hashtable hash1 		= getHashMultiUpdateData(multiUpdateData);
    	String medi_clsf 		= Util.checkString((String)hash1.get("medi_clsf"));
System.out.println(medi_clsf);
    	String dlco_no			= Util.checkString((String)hash1.get("dlco_no"));
    	String cust_seq			= Util.checkString((String)hash1.get("cust_seq"));    	
System.out.println("end");
    	String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
System.out.println(incmg_pers);    	
        // DM Setting
    	AD_BAS_3605_ADM dm = new AD_BAS_3605_ADM();
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setCust_seq(cust_seq);
    	dm.setCust_item_yn(cust_item_yn);
    	dm.setCust_item(cust_item);
    	dm.setSlcrg_pers_yn(slcrg_pers_yn);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers_yn(mchrg_pers_yn);
    	dm.setMchrg_pers(mchrg_pers);
    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	try
    	{
        	AdBas3600DAO	dao = new AdBas3600DAO();
            ds = dao.ad_bas_3605_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }  
	}
	
	public void ad_bas_3610_m(HttpServletRequest req, HttpServletResponse res) throws AppException
	{
		AD_BAS_3610_MDataSet ds = null;
		AD_BAS_3610_MDM dm = new AD_BAS_3610_MDM();
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setCmpy_cd(cmpy_cd);
		try
		{
			AdBas3600DAO dao = new AdBas3600DAO();
			ds = dao.ad_bas_3610_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (AppException e)
		{
			throw e;
		}
	}
	
	public void ad_bas_3611_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException
	{	
    	AD_BAS_3611_SDataSet ds = null;

    	String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf	= Util.checkString(req.getParameter("medi_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String cust_seq 	= Util.checkString(req.getParameter("cust_seq"));

        // DM Setting
    	AD_BAS_3611_SDM dm = new AD_BAS_3611_SDM();

    	dm.setCmpyCd(cmpy_cd);
    	dm.setMediClsf(medi_clsf);
    	dm.setDlcoNo(dlco_no);
    	dm.setCustSeq(cust_seq);

        try
        {
        	AdBas3600DAO	dao = new AdBas3600DAO();
            ds = dao.ad_bas_3611_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }
	}
	
	public void ad_bas_3612_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException
	{	
    	AD_BAS_3612_SDataSet ds = null;

    	String cmpy_cd  	= Util.getSessionParameterValue(req, "cmpycd", true);
//    	String medi_clsf	= Util.checkString(req.getParameter("medi_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
//    	String cust_seq 	= Util.checkString(req.getParameter("cust_seq"));

        // DM Setting
    	AD_BAS_3612_SDM dm = new AD_BAS_3612_SDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);

        try
        {
        	AdBas3600DAO	dao = new AdBas3600DAO();
            ds = dao.ad_bas_3612_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }
	}
	
	public void ad_bas_3615_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException
	{	
    	AD_BAS_3615_ADataSet ds = null;

    	String flag 			= Util.checkString(req.getParameter("flag"));
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf 		= Util.checkString(req.getParameter("medi_clsf"));
    	String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
    	String cust_seq 		= Util.checkString(req.getParameter("cust_seq"));
    	String dlco_no_pre 		= Util.checkString(req.getParameter("dlco_no_pre"));
    	String cust_seq_pre		= Util.checkString(req.getParameter("cust_seq_pre"));
    	String cust_name 		= Util.checkString(req.getParameter("cust_name"));
    	String department 		= Util.checkString(req.getParameter("department"));
    	String position 		= Util.checkString(req.getParameter("position"));
    	String mobile1 			= Util.checkString(req.getParameter("mobile1"));
    	String mobile2 			= Util.checkString(req.getParameter("mobile2"));
    	String phone1 			= Util.checkString(req.getParameter("phone1"));
    	String phone2 			= Util.checkString(req.getParameter("phone2"));
    	String homepage 		= Util.checkString(req.getParameter("homepage"));
    	String fax 				= Util.checkString(req.getParameter("fax"));
    	String email 			= Util.checkString(req.getParameter("email")) + '@' + Util.checkString(req.getParameter("email_addr"));
    	String cmpy_zip1 		= Util.checkString(req.getParameter("cmpy_zip1"));
    	String cmpy_zip2 		= Util.checkString(req.getParameter("cmpy_zip2"));
    	String cmpy_addr 		= Util.checkString(req.getParameter("cmpy_addr"));
    	String cmpy_dtls_addr 	= Util.checkString(req.getParameter("cmpy_dtls_addr"));
    	String home_zip1 		= Util.checkString(req.getParameter("home_zip1"));
    	String home_zip2 		= Util.checkString(req.getParameter("home_zip2"));
    	String home_addr 		= Util.checkString(req.getParameter("home_addr"));
    	String home_dtls_addr 	= Util.checkString(req.getParameter("home_dtls_addr"));
    	String etc_zip1 		= Util.checkString(req.getParameter("etc_zip1"));
    	String etc_zip2 		= Util.checkString(req.getParameter("etc_zip2"));
    	String etc_addr 		= Util.checkString(req.getParameter("etc_addr"));
    	String etc_dtls_addr 	= Util.checkString(req.getParameter("etc_dtls_addr"));
    	String task1 			= Util.checkString(req.getParameter("task1"));
    	String task1_represent 	= Util.checkString(req.getParameter("task1_represent"));
    	String task2 			= Util.checkString(req.getParameter("task2"));
    	String task2_represent 	= Util.checkString(req.getParameter("task2_represent"));
    	String incumbent_yn 	= Util.checkString(req.getParameter("incumbent_yn"));
    	String sex 				= Util.checkString(req.getParameter("sex"));
    	String birth_place 		= Util.checkString(req.getParameter("birth_place"));
    	String birth_day 		= Util.checkString(req.getParameter("birth_day"));
    	String wedding_yn 		= Util.checkString(req.getParameter("wedding_yn"));
    	String wedding_day 		= Util.checkString(req.getParameter("wedding_day"));
    	String family_size 		= Util.checkString(req.getParameter("family_size"));
    	String religion 		= Util.checkString(req.getParameter("religion"));
    	String military_service = Util.checkString(req.getParameter("military_service"));
    	String hobby 			= Util.checkString(req.getParameter("hobby"));
    	String golf 			= Util.checkString(req.getParameter("golf"));
    	String drinking 		= Util.checkString(req.getParameter("drinking"));
    	String smoking 			= Util.checkString(req.getParameter("smoking"));
    	String remk 			= Util.checkString(req.getParameter("remk"));
    	String protensity 		= Util.checkString(req.getParameter("protensity"));
    	String reputation 		= Util.checkString(req.getParameter("reputation"));
    	String slcrg_pers 		= Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers 		= Util.checkString(req.getParameter("mchrg_pers"));
    	String peopledb_no      = Util.checkString(req.getParameter("peopledb_no"));
    	
    	String cust_item		= Util.checkString(req.getParameter("cust_item"));
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

    	String school_seq = Util.checkString((String)hash1.get("seq"));
    	String school_frdt= Util.checkString((String)hash1.get("frdt"));
    	String school_todt= Util.checkString((String)hash1.get("todt"));
    	String school_memo= Util.checkString((String)hash1.get("memo"));
    	
    	String career_seq = Util.checkString((String)hash2.get("seq"));
    	String career_frdt= Util.checkString((String)hash2.get("frdt"));
    	String career_todt= Util.checkString((String)hash2.get("todt"));
    	String career_memo= Util.checkString((String)hash2.get("memo"));

    	String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);

        // DM Setting
    	AD_BAS_3615_ADM dm = new AD_BAS_3615_ADM();
    	dm.setFlag(flag);
    	dm.setCmpyCd(cmpy_cd);
    	dm.setMediClsf(medi_clsf);
    	dm.setDlcoNo(dlco_no);
    	dm.setCustSeq(cust_seq);
    	dm.setDlcoNoPre(dlco_no_pre);
    	dm.setCustSeqPre(cust_seq_pre);
    	dm.setCustName(cust_name);
    	dm.setDepartment(department);
    	dm.setPosition(position);
    	dm.setMobile1(mobile1);
    	dm.setMobile2(mobile2);
    	dm.setPhone1(phone1);
    	dm.setPhone2(phone2);
    	dm.setHomepage(homepage);
    	dm.setFax(fax);
    	dm.setEmail(email);
    	dm.setCmpyZip1(cmpy_zip1);
    	dm.setCmpyZip2(cmpy_zip2);
    	dm.setCmpyAddr(cmpy_addr);
    	dm.setCmpyDtlsAddr(cmpy_dtls_addr);
    	dm.setHomeZip1(home_zip1);
    	dm.setHomeZip2(home_zip2);
    	dm.setHomeAddr(home_addr);
    	dm.setHomeDtlsAddr(home_dtls_addr);
    	dm.setEtcZip1(etc_zip1);
    	dm.setEtcZip2(etc_zip2);
    	dm.setEtcAddr(etc_addr);
    	dm.setEtcDtlsAddr(etc_dtls_addr);
    	dm.setTask1(task1);
    	dm.setTask1Represent(task1_represent);
    	dm.setTask2(task2);
    	dm.setTask2Represent(task2_represent);
    	dm.setIncumbentYn(incumbent_yn);
    	dm.setSex(sex);
    	dm.setBirthPlace(birth_place);
    	dm.setBirthDay(birth_day);
    	dm.setWeddingYn(wedding_yn);
    	dm.setWeddingDay(wedding_day);
    	dm.setFamilySize(family_size);
    	dm.setReligion(religion);
    	dm.setMilitaryService(military_service);
    	dm.setHobby(hobby);
    	dm.setGolf(golf);
    	dm.setDrinking(drinking);
    	dm.setSmoking(smoking);
    	dm.setRemk(remk);
    	dm.setProtensity(protensity);
    	dm.setReputation(reputation);
    	dm.setSlcrgPers(slcrg_pers);
    	dm.setMchrgPers(mchrg_pers);
    	dm.setPeopledbNo(peopledb_no);
    	
    	dm.setCustItem(cust_item);

    	dm.setSchoolSeq(school_seq);
    	dm.setSchoolFrdt(school_frdt);
    	dm.setSchoolTodt(school_todt);
    	dm.setSchoolMemo(school_memo);
    	
    	dm.setCareerSeq(career_seq);
    	dm.setCareerFrdt(career_frdt);
    	dm.setCareerTodt(career_todt);
    	dm.setCareerMemo(career_memo);
    	
    	dm.setIncmgPersIp(incmg_pers_ip);
    	dm.setIncmgPers(incmg_pers);
    	
    	try
    	{
        	AdBas3600DAO	dao = new AdBas3600DAO();
            ds = dao.ad_bas_3615_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }  
	}
}
