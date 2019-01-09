/**************************************************************************************************
* ���ϸ�    : SLCommon1000WB.java
* ���      : Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
*             EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
* �ۼ�����  : 2003-11-19
* �ۼ���    : �迵��
**************************************************************************************************/
/**************************************************************************************************
* ��������  :
* ������    :
* ��������  :
* ���      :
**************************************************************************************************/
package chosun.ciis.ss.sal.common.wb;

import javax.ejb.*;
import java.rmi.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.dao.*;

/**
 * Servlet���� ���� parameter�� �̿��Ͽ� dm�� set�ϰ�
 * EJB ȣ���Ͽ� ���� ������� request������ ���� ��ȯ�Ѵ�.
 */
public class SLCommon1000WB{

    /**
     * �����ȣ�˻�(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectZipList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	CO_L_ZIPDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.checkString(req.getParameter("bocd"));					//���������ڵ�
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));	//����
        String zip = Util.checkString(req.getParameter("zip"));						//�����ȣ
        String pageno = Util.checkString(req.getParameter("pageno"));				//���� ������
        String pagesize = Util.checkString(req.getParameter("pagesize"));			//������������

        CO_L_ZIPDM dm = new CO_L_ZIPDM();
        dm.setBocd(bocd); // ���������ڵ�
        dm.setZip(zip);
        dm.setAddr3(addr3);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectZipList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            CO_L_ZIPDataSet ds = null;
            ds = ejb.selectZipList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ���ڰ˻�(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectReaderDetailList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_RDR_DTLS_SECHDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);								//���������ڵ�
        String search_order = Util.checkString(req.getParameter("search_order"));				//�˻���������
        String search_ad = Util.checkString(req.getParameter("search_ad"));						//�˻����ı���(ASC, DSC)(Ȯ��� �̿��Ұ�)
        String search_cond = Util.checkString(req.getParameter("search_cond"));					//�˻�����
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));	//�˻���
        String search_stop = Util.checkString(req.getParameter("search_stop"));					//�����������Կ���(Ȯ��� �̿��Ұ�)
		String search_sg = Util.checkString(req.getParameter("search_sg"));						//�˻����ı���(ASC, DSC)(Ȯ��� �̿��Ұ�)
        String pageno = Util.checkString(req.getParameter("pageno"));							//���� ������
        String pagesize = Util.checkString(req.getParameter("pagesize"));						//������������

        SL_L_RDR_DTLS_SECHDM dm = new SL_L_RDR_DTLS_SECHDM();

        dm.setBocd(bocd);
        dm.setSearch_order(search_order);
        dm.setSearch_ad(search_ad);
        dm.setSearch_cond(search_cond);
        dm.setSearch_word(search_word);
        dm.setSearch_stop(search_stop);
		dm.setSearch_sg(search_sg);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectReaderDetailList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_RDR_DTLS_SECHDataSet ds = null;
            ds = ejb.selectReaderDetailList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ���ڰ˻�(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectReaderList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_READER_01DataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);                               //���������ڵ�
        String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));                   //Ȯ������
        String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));                   //Ȯ���ȣ
        String search_order = Util.checkString(req.getParameter("search_order"));               //��������
        String search_ad = Util.checkString(req.getParameter("search_ad"));                     //�˻� ASC, DESC
        String search_cond = Util.checkString(req.getParameter("search_cond"));                 //�˻�����
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));   //�˻���
        String search_stop = Util.checkString(req.getParameter("search_stop"));                 //�������ڰ˻� ����
        String pageno = Util.checkString(req.getParameter("pageno"));                           //��������ȣ
        String pagesize = Util.checkString(req.getParameter("pagesize"));                       //������������

        //filtering
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "1000" : pagesize;


        SL_L_READER_01DM dm = new SL_L_READER_01DM();
        dm.setBocd(bocd);
        dm.setRdr_extndt(rdr_extndt);
        dm.setRdr_extnno(rdr_extnno);
        dm.setSearch_order(search_order);
        dm.setSearch_ad(search_ad);
        dm.setSearch_cond(search_cond);
        dm.setSearch_word(search_word);
        dm.setSearch_stop(search_stop);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectReaderList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_READER_01DataSet ds = null;
            ds = ejb.selectReaderList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }


    /**
     * Ȯ���ڰ˻�(�ʱ�ȭ��)
     * Ȯ���� �Ҽ� �ڵ带 ��ȸ�Ͽ� select box�� �����Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectExtnBlngCdList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	CO_L_TAOCC_CDVDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String ciymgbcd = "97";   //�������� : �����������
        String cicdgb = "240";    //�ڵ屸�� : Ȯ���ڼҼ�
        String cimgtcd1 = "ALL";  //�����׺�1
        String cimgtcd2 = "Y";    //�����׸�2
        String cimgtcd3 = "ALL";  //�����׸�3
        String cimgtcd4 = "ALL";  //�����׸�4
        String cimgtcd5 = "ALL";  //�����׸�5
        String cimgtcd6 = "NO";   //�����׸�6
        String cimgtcd7 = "NO";   //�����׸�7

        CO_L_TAOCC_CDVDM dm = new CO_L_TAOCC_CDVDM();
        dm.setCiymgbcd(ciymgbcd);
        dm.setCicdgb(cicdgb);
        dm.setCimgtcd1(cimgtcd1);
        dm.setCimgtcd2(cimgtcd2);
        dm.setCimgtcd3(cimgtcd3);
        dm.setCimgtcd4(cimgtcd4);
        dm.setCimgtcd5(cimgtcd5);
        dm.setCimgtcd6(cimgtcd6);
        dm.setCimgtcd7(cimgtcd7);

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectCommCdList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            CO_L_TAOCC_CDVDataSet ds = null;
            ds = ejb.selectCommCdList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * Ȯ���ڰ˻�(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectExtnPersList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_EXTNPERSDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);				//���������ڵ�
        String extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("extntypecd")));	//Ȯ�������ڵ�
        String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));	//Ȯ���ڼҼ��ڵ�
        String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));			//������ȣ
        String name = Util.Uni2Ksc(Util.checkString(req.getParameter("name")));				//Ȯ���ڸ�(�˻���)
        String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));				//�ֹε�Ϲ�ȣ
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));			//���� ������
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));		//������������

        SL_L_EXTNPERSDM dm = new SL_L_EXTNPERSDM();

        //dm.setBocd(bocd); // ���������ڵ�
        dm.setBocd(bocd);
        dm.setExtntypecd(extntypecd);
        dm.setExtnblngcd(extnblngcd);
        dm.setStafno(stafno);
        dm.setName(name);
        dm.setPrn(prn);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectExtnPersList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_EXTNPERSDataSet ds = null;
            ds = ejb.selectExtnPersList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }


    /**
     * �����ڵ� �����ڵ� ����
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectClsfCodeList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_EXTNPERSDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String sBocd = Util.getSessionParameterValue(req, "bocd", true); // ���������ڵ�
        SL_L_EXTNPERSDM dm = new SL_L_EXTNPERSDM();

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectExtnPersList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_EXTNPERSDataSet ds = null;
            ds = ejb.selectExtnPersList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * �����˻�(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectBranchOfficeList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_BO_SRCHDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bonm = Util.Uni2Euc(Util.checkString(req.getParameter("bonm")));
        String addr3 = Util.Uni2Euc(Util.checkString(req.getParameter("addr3")));
        SL_L_BO_SRCHDM dm = new SL_L_BO_SRCHDM();

        dm.setBonm(bonm);
        dm.setAddr3(addr3);
        
        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectBranchOfficeList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_BO_SRCHDataSet ds = null;
            ds = ejb.selectBranchOfficeList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ���˹��ڵ�˻�(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectBnsItemCdList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_BNSITEMDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));	//���˹��ڵ�
        String bns_itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemnm")));	//���˹���
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));			//���� ������
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));		//������������

        SL_L_BNSITEMDM dm = new SL_L_BNSITEMDM();
        dm.setBns_itemcd(bns_itemcd);
        dm.setBns_itemnm(bns_itemnm);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectBnsItemCdList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_BNSITEMDataSet ds = null;
            ds = ejb.selectBnsItemCdList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
     * ������޸�ü(�����ȸ)
     * �˻��������ν� iframe���� call�ϴ� ���� ��Ģ���� �Ѵ�.
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectBoHndlMediList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_BOMEDIDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�

        SL_L_BOMEDIDM dm = new SL_L_BOMEDIDM();

        dm.setBocd(bocd);

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectBoHndlMediList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_BOMEDIDataSet ds = null;
            ds = ejb.selectBoHndlMediList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

	/**
	 * ����-���೻������
	 * �˻��������ν� iframe���� call�ϴ� ���� ��Ģ���� �Ѵ�.
	 * @param req HttpServletRequest
	 * @param res HttpServletResponse
	 * @throws AppException
	 * @throws SysException
	 */
	public void activeRunLog(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
		CO_A_RUNLOGDataSet ds = null;
		// parameter requesting �ϰ�  DM�� ���� Setting
		String bocd = Util.getSessionParameterValue(req, "bocd", true);		//���������ڵ�
		String accflag = Util.checkString(req.getParameter("accflag"));
		String objnm = Util.checkString(req.getParameter("objnm"));
		String seq = Util.checkString(req.getParameter("seq"));
		String status = Util.checkString(req.getParameter("status"));

		System.out.println(bocd);

		CO_A_RUNLOGDM dm = new CO_A_RUNLOGDM();

		System.out.println("["+bocd+":"+accflag+":"+objnm+":"+seq+":"+status+"]");

		dm.setAccflag(accflag);
		dm.setBocd(bocd);
		dm.setObjnm(objnm);
		dm.setSeq(seq);
		dm.setStatus(status);

		SLCommon1000DAO dao = new SLCommon1000DAO();
		ds = dao.activeRunLog(dm);
		req.setAttribute("ds", ds); // request�� ������� Binding
		
		/*
		// JNDI lookup �� ���� EJB Home interface ��ü����
		SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
		try{
			SLCommon1000EJB ejb = home.create();
			CO_A_RUNLOGDataSet ds = null;
			ds = ejb.activeRunLog(dm); // ������ dm������ EJB�� ȣ��
			req.setAttribute("ds", ds); // request�� ������� Binding
		} catch(CreateException e){
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		} catch(RemoteException e){
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}*/
    }

    /**
     * �ش����� ���� �������
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectDsctList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	SL_L_DSTCINFOCDDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.getSessionParameterValue(req, "bocd", true); // ���������ڵ�
        SL_L_DSTCINFOCDDM dm = new SL_L_DSTCINFOCDDM();

        dm.setBocd(bocd);

        SLCommon1000DAO dao = new SLCommon1000DAO();
        ds = dao.selectDsctList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLCommon1000EJBHome home = (SLCommon1000EJBHome)JNDIManager.getInstance().getHome("SLCommon1000EJB");
        try{
            SLCommon1000EJB ejb = home.create();
            SL_L_DSTCINFOCDDataSet ds = null;
            ds = ejb.selectDsctList(dm); // ������ dm������ EJB�� ȣ��
            req.setAttribute("ds", ds); // request�� ������� Binding
        } catch(CreateException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        } catch(RemoteException e){
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }*/
    }

    /**
         * ����-���� ȸ�� ���� ��ȸ �˻��������ν� iframe���� call�ϴ� ���� ��Ģ���� �Ѵ�.
         *
         * @param dm
         *         CO_S_RDR_SERVICEDM ��ü
         * @return CO_S_RDR_SERVICEDataSet ��ü
         * @throws AppException
         */
        public void selectRDR_SERVICE(HttpServletRequest req,
                HttpServletResponse res) throws AppException, SysException {
        	CO_S_RDR_SERVICEDataSet ds = null;
            // parameter requesting �ϰ� DM�� ���� Setting
            String rdr_no = Util.checkString(req.getParameter("rdr_no"));
            String medicd = Util.checkString(req.getParameter("medicd"));

            CO_S_RDR_SERVICEDM dm = new CO_S_RDR_SERVICEDM();

            dm.setRdr_no(rdr_no);
            dm.setMedicd(medicd);
            
            SLCommon1000DAO dao = new SLCommon1000DAO();
            ds = dao.selectRDR_SERVICE(dm);
            req.setAttribute("ds", ds); // request�� ������� Binding

            /*
            // JNDI lookup �� ���� EJB Home interface ��ü����
            SLCommon1000EJBHome home = (SLCommon1000EJBHome) JNDIManager
                    .getInstance().getHome("SLCommon1000EJB");
            try {
                SLCommon1000EJB ejb = home.create();
                CO_S_RDR_SERVICEDataSet ds = null;
                ds = ejb.selectRDR_SERVICE(dm); // ������ dm������ EJB�� ȣ��
                req.setAttribute("ds", ds); // request�� ������� Binding
            } catch (CreateException e) {
                SysException se = new SysException(e);
                LogManager.getInstance().log(se);
                throw se;
            } catch (RemoteException e) {
                SysException se = new SysException(e);
                LogManager.getInstance().log(se);
                throw se;
            }*/
	}
}
