/***************************************************************************************************
* ���ϸ� : SSCommon1100WB.java
* ��� : �μ�,���� �� ���� Worker Bean
* �ۼ����� : 2003-11-15
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.wb;

import javax.ejb.*;
import java.rmi.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.dao.*;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.Part;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * �Ǹű� ���� ������ ���� WB
 */
public class SSCommon1100WB{

	/**
     * ����-�μ��ڵ�,�ڵ�� ���
	 * @param  req HttpServletRequest
	 * @param  res HttpServletResponse
     * @throws AppException
     **/
	public void selectDeptList(HttpServletRequest req, HttpServletResponse res) throws AppException{

		SS_L_NWBUSEOCDDataSet ds = null;
		// Request Parameter Processing
		// DM Setting
		SS_L_NWBUSEOCDDM dm = new SS_L_NWBUSEOCDDM();

		SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectCodeSP ȣ��
        ds = dao.selectDeptList(dm);
        req.setAttribute("ds", ds);

        /*
		SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
		try{
			SSCommon1100EJB ejb = home.create();
			ds = ejb.selectDeptList(dm);
			req.setAttribute("ds", ds);
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
     * ����-�����ڵ�,�ڵ�� ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectAreaList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_JIYEOGCDDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("common_deptcd")));
        System.out.println( deptcd );
        // DM Setting
        SS_L_JIYEOGCDDM dm = new SS_L_JIYEOGCDDM();
        dm.setDeptcd(deptcd);

        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectCodeSP ȣ��
        ds = dao.selectAreaList(dm);
        req.setAttribute("ds", ds);

        /*
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            ds = ejb.selectAreaList(dm);
            req.setAttribute("ds", ds);
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
     * ����-�����ڵ�,�ڵ�� ���2 (enctype="multipart/form-data")
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectAreaList2(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_JIYEOGCDDataSet ds = null;
        // Request Parameter Processing

        PrintWriter out = null;
        Hashtable ht = new Hashtable();

        //input name�� imput value�� Hashtable�� �����Ѵ�.
        try {
            out = res.getWriter();
            MultipartParser multi = new MultipartParser(req, 5*1024*1024, true, true);
            Part part = null;
            ParamPart parampart = null;

            for (int i=0; (part = multi.readNextPart()) != null;i++ ) {

                if(part.isParam()){
                    parampart = (ParamPart)part;
                    ht.put(part.getName(), parampart.getStringValue());
                }
            }
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        // Request Parameter Processing
        String deptcd = Util.checkString((String)ht.get("common_deptcd"));

        // DM Setting
        SS_L_JIYEOGCDDM dm = new SS_L_JIYEOGCDDM();
        dm.setDeptcd(deptcd);

        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectCodeSP ȣ��
        ds = dao.selectAreaList(dm);
        req.setAttribute("ds", ds);

        /*
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            ds = ejb.selectAreaList(dm);
            req.setAttribute("ds", ds);
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
     * ����-�����˻� ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectBOList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BO_SRCH_TEMPDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));
        String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));

        // DM Setting
        SS_L_BO_SRCH_TEMPDM dm = new SS_L_BO_SRCH_TEMPDM();
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);
        dm.setBonm(bonm);
        dm.setAddr3(addr3);

        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectBOList ȣ��
        ds = dao.selectBOList(dm);
        req.setAttribute("ds", ds);

        /*
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            ds = ejb.selectBOList(dm);
            req.setAttribute("ds", ds);
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
     * ����-�������(LIST)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void selectBoinfoList(HttpServletRequest req, HttpServletResponse res) throws AppException{

        SS_L_BOLISTDataSet ds = null;
        // Request Parameter Processing
        String deptcd = Util.checkString(req.getParameter("deptcd"));
        String areacd = Util.checkString(req.getParameter("areacd"));

        // DM Setting
        SS_L_BOLISTDM dm = new SS_L_BOLISTDM();
        dm.setDeptcd(deptcd);
        dm.setAreacd(areacd);

        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectBOList ȣ��
        ds = dao.selectBoinfoList(dm);
        req.setAttribute("ds", ds);

        /*
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            ds = ejb.selectBoinfoList(dm);
            req.setAttribute("ds", ds);
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

        // JNDI lookup �� ���� EJB Home interface ��ü����

        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectZipList ȣ��
        ds = dao.selectZipList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

        /*
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            //CO_L_ZIPDataSet ds = null;
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
     * ��ü�ڵ�˻�(ȸ�纰)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectCmpyMedicdList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
        SS_L_CMPY_MEDICDDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String cmpycd = Util.checkString(req.getParameter("cmpycd"));	//ȸ���ڵ�

        SS_L_CMPY_MEDICDDM dm = new SS_L_CMPY_MEDICDDM();
        dm.setCmpycd(cmpycd);                                           //ȸ���ڵ�

        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectCmpyMedicdList ȣ��
        ds = dao.selectCmpyMedicdList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            ds = ejb.selectCmpyMedicdList(dm); // ������ dm������ EJB�� ȣ��
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
     * ���ޱ����ڵ�˻�(���ޱ��к�-���ϸ���)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectClsfBasiList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
        SS_L_MIG_CLSF_BASIDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));	    //���ޱ����ڵ�

        SS_L_MIG_CLSF_BASIDM dm = new SS_L_MIG_CLSF_BASIDM();
        dm.setPayclsfcd(payclsfcd);                                             //���ޱ����ڵ�

        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectClsfBasiList ȣ��
        ds = dao.selectClsfBasiList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            ds = ejb.selectClsfBasiList(dm); // ������ dm������ EJB�� ȣ��
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
    	SS_L_RDR_DTLS_SECHDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.checkString(req.getParameter("bocd"));								//���������ڵ�
        String search_order = Util.checkString(req.getParameter("search_order"));				//�˻���������
        String search_ad = Util.checkString(req.getParameter("search_ad"));						//�˻����ı���(ASC, DSC)(Ȯ��� �̿��Ұ�)
        String search_cond = Util.checkString(req.getParameter("search_cond"));					//�˻�����
        String search_word = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word")));	//�˻���
        String search_stop = Util.checkString(req.getParameter("search_stop"));					//�����������Կ���(Ȯ��� �̿��Ұ�)
        String pageno = Util.checkString(req.getParameter("pageno"));							//���� ������
        String pagesize = Util.checkString(req.getParameter("pagesize"));						//������������

        SS_L_RDR_DTLS_SECHDM dm = new SS_L_RDR_DTLS_SECHDM();
        dm.setBocd(bocd);
        dm.setSearch_order(search_order);
        dm.setSearch_ad(search_ad);
        dm.setSearch_cond(search_cond);
        dm.setSearch_word(search_word);
        dm.setSearch_stop(search_stop);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSCommon1100DAO dao = new SSCommon1100DAO();
        ds = dao.selectReaderDetailList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            //SS_L_RDR_DTLS_SECHDataSet ds = null;
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
    	SS_L_READER_01DataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.checkString(req.getParameter("bocd"));                               //���������ڵ�
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


        SS_L_READER_01DM dm = new SS_L_READER_01DM();
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

        SSCommon1100DAO dao = new SSCommon1100DAO();
        ds = dao.selectReaderList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            SS_L_READER_01DataSet ds = null;
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
     * ���ڰ˻�(�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     * @throws SysException
     */
    public void selectRDRList(HttpServletRequest req, HttpServletResponse res) throws AppException, SysException{
    	CO_L_RDR_SRCHDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));					//���ڹ�ȣ
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));	//����
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));						//���ڸ�
        String pageno = Util.checkString(req.getParameter("pageno"));				//���� ������
        String pagesize = Util.checkString(req.getParameter("pagesize"));			//������������

        CO_L_RDR_SRCHDM dm = new CO_L_RDR_SRCHDM();

        dm.setRdr_no(rdr_no);
        dm.setRdrnm(rdrnm);
        dm.setAddr3(addr3);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectRDRList ȣ��
        ds = dao.selectRDRList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SSCommon1100EJBHome home = (SSCommon1100EJBHome)JNDIManager.getInstance().getHome("SSCommon1100EJB");
        try{
            SSCommon1100EJB ejb = home.create();
            //CO_L_RDR_SRCHDataSet ds = null;
            ds = ejb.selectRDRList(dm); // ������ dm������ EJB�� ȣ��
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

    public void selectGugunList(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	SL_L_GUGUNDataSet ds = null;
        // Request Parameter Processing
    	String citynm = Util.checkString(req.getParameter("sido")); // �����ȣ

    	System.out.println("citynm : "+citynm);

        // DM Setting
    	SL_L_GUGUNDM dm = new SL_L_GUGUNDM();
		dm.setCitynm(citynm);

        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectBOList ȣ��
        ds = dao.selectGugunList(dm);
        req.setAttribute("ds", ds);
    }

    public void selectNewZipList(HttpServletRequest req, HttpServletResponse res)
		throws AppException, SysException {
		// parameter requesting �ϰ� DM�� ���� Setting
		String bocd = Util.checkString(req.getParameter("bocd")); // ���������ڵ�
		String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3"))); // ����
		String zip = Util.checkString(req.getParameter("zip")); // �����ȣ
		String city_val = Util.checkString(req.getParameter("sido")); // �����ȣ
		String village_val = Util.checkString(req.getParameter("gugun")); // �����ȣ
		String rdnm = Util.checkString(req.getParameter("rdnm")); // �����ȣ
		String bldgnm = Util.checkString(req.getParameter("bldgnm")); // �����ȣ

		String pageno = Util.checkString(req.getParameter("pageno")); // ����
		// ������
		String pagesize = Util.checkString(req.getParameter("pagesize")); // ������������

		CO_L_ZIP_AGENCYDM dm = new CO_L_ZIP_AGENCYDM();
		dm.setBocd(bocd); // ���������ڵ�
		dm.setAddr3(addr3);
		dm.setZip(zip);
		dm.setCity_val(city_val);
		dm.setVillage_val(village_val);
		dm.setRdnm(rdnm);
		dm.setBldgnm(bldgnm);
		dm.setPageno(Long.parseLong(pageno));
		dm.setPagesize(Long.parseLong(pagesize));

		dm.print();

		CO_L_ZIP_AGENCYDataSet ds = null;

		SSCommon1100DAO dao = new SSCommon1100DAO();
		ds = dao.selectNewZipList(dm);
		req.setAttribute("ds", ds);

	}

    public void selectNewGugunList(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	CO_L_NEWGUGUNDataSet ds = null;
        // Request Parameter Processing
    	String searchnm = Util.checkString(req.getParameter("searchnm"));
    	String searchgb = Util.checkString(req.getParameter("searchgb"));
        // DM Setting
    	CO_L_NEWGUGUNDM dm = new CO_L_NEWGUGUNDM();
		dm.setSearchnm(searchnm);
		dm.setSearchgb(searchgb);

        SSCommon1100DAO dao = new SSCommon1100DAO();

        // DAO ��ü�� selectBOList ȣ��
        ds = dao.selectNewGugunList(dm);
        req.setAttribute("ds", ds);
    }

    public void selectNewAddrList(HttpServletRequest req, HttpServletResponse res) throws AppException{

    	CO_L_NEW_ADDRDataSet ds = null;
        // Request Parameter Processing
    	String sido = Util.checkString(req.getParameter("sido"));
    	String gugun = Util.checkString(req.getParameter("gugun"));
    	String rdnm = Util.checkString(req.getParameter("rdnm"));
    	String bldgnn1 = Util.checkString(req.getParameter("bldgnn1"));
    	String bldgnn2 = Util.checkString(req.getParameter("bldgnn2"));
    	String job_flag = Util.checkString(req.getParameter("job_flag"));
    	String bldgnm = Util.checkString(req.getParameter("bldgnm"));
    	String dong = Util.checkString(req.getParameter("dong"));
    	String bnji1 = Util.checkString(req.getParameter("bnji1"));
    	String bnji2 = Util.checkString(req.getParameter("bnji2"));
    	String bocd = Util.checkString(req.getParameter("bocd"));
    	String orderby = "R";
    	String pageno = "1";
		String pagesize = "999999";

		if(!dong.equals("")){
			orderby = "J";
		}else{
			orderby = "R";
		}


        // DM Setting
    	CO_L_NEW_ADDRDM dm = new CO_L_NEW_ADDRDM();

		dm.setSido(sido);
		dm.setGugun(gugun);
		dm.setRdnm(rdnm);
		dm.setBldgnn1(bldgnn1);
		dm.setBldgnn2(bldgnn2);
		dm.setJob_flag(job_flag);
		dm.setBldgnm(bldgnm);
		dm.setDong(dong);
		dm.setBnji1(bnji1);
		dm.setBnji2(bnji2);
		dm.setBocd(bocd);
		dm.setOrderby(orderby);
		dm.setPageno(Long.parseLong(pageno));
		dm.setPagesize(Long.parseLong(pagesize));

		dm.print();

        SSCommon1100DAO dao = new SSCommon1100DAO();
        // DAO ��ü�� selectBOList ȣ��
        ds = dao.selectNewAddrList(dm);
        req.setAttribute("ds", ds);
    }

}

/* �ۼ��ð� : Wed Nov 19 14:40:01 KST 2003 */
