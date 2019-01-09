/***************************************************************************************************
* ���ϸ� : SSReader11100WB.java_����Ͽ�
* ��� : ������Ȳ-�������� ó���� ���� Worker Bean
* �ۼ����� : 2016-12-06
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sal.rdr.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ss.sal.rdr.dao.SLReader11100DAO;
import chosun.ciis.ss.sal.rdr.dm.SL_L_SUBS_CNTR_STOP_HISTDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_MOVM_RDRPTCRDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_NWSPSUBSCNTRPTCRDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_READERDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_L_VSPTCRDM;
import chosun.ciis.ss.sal.rdr.dm.SL_MO_S_RDR_INFODM;
import chosun.ciis.ss.sal.rdr.ds.SL_L_SUBS_CNTR_STOP_HISTDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_MOVM_RDRPTCRDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_NWSPSUBSCNTRPTCRDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_READERDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_L_VSPTCRDataSet;
import chosun.ciis.ss.sal.rdr.ds.SL_MO_S_RDR_INFODataSet;

/**
 * ������Ȳ-���������� ���� WB
 */

public class SLReader11100WB{

	/**
	 * ������������(���ڸ�ϰ˻�) //����Ͽ�
	 *
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 *
	 */
	public void mo_selectReaderList(HttpServletRequest req, HttpServletResponse res) //����Ͽ�
			throws AppException {

		String bocd =  req.getParameter("bocd"); // ���������ڵ�

		String search_order = Util.checkString(req.getParameter("search_order")); // �˻���������
		String search_ad = Util.checkString(req.getParameter("search_ad")); // �˻�
		// asc,
		// desc
		String search_cond = Util.checkString(req.getParameter("search_cond")); // �˻�
		// ���ǰ˻�����('ALL':���հ˻�,
		// 'DSTC':�����ڵ�,
		// 'DSNO':����+���,
		// 'NO':���ڹ�ȣ,
		// 'NM':���ڸ�,
		// 'ADDR':���ּ�,
		// 'ADDRS':�ּ���ü,
		// 'TEL':��ȭ��ȣ,
		// 'EMAIL':�̸���,
		// 'PRVNO':��(��)���ڹ�ȣ
		// '':��ü)
		String search_pttn = Util.checkString(req.getParameter("search_pttn")); // ����(��ü)�˻���
		// �˻�����
		// ����('1':����,
		// '2':����+���,
		// '3':���ڹ�ȣ,
		// '4':���ڸ�,
		// '5':�ּ�,
		// '6':��ȭ��ȣ)
		String search_word = Util.Uni2Ksc(Util.checkString(req
				.getParameter("search_word"))); // �˻���
		String search_stop = Util.checkString(req.getParameter("search_stop")); // �˻���
		// ����������
		// ����
		// ����
		String pageno = Util.checkString(req.getParameter("pageno")); // ��������ȣ
		String pagesize = Util.checkString(req.getParameter("pagesize")); // ����������
		// ���ڵ��(������������)

		// setting dm
		SL_MO_L_READERDM dm = new SL_MO_L_READERDM();

		pageno = ("".equals(pageno)) ? "1" : pageno;
		pagesize = ("".equals(pagesize)) ? "3" : pagesize;

		dm.setBocd(bocd);
		dm.setSearch_order(search_order);
		dm.setSearch_ad(search_ad);
		dm.setSearch_cond(search_cond);
		dm.setSearch_pttn(search_pttn);
		dm.setSearch_word(search_word);
		dm.setSearch_stop(search_stop);
		// dm.setPageno(Long.parseLong(pageno));
		// dm.setPagesize(Long.parseLong(pagesize));
		dm.setPageno(Long.parseLong(pageno));
		dm.setPagesize(Long.parseLong(pagesize));

		SL_MO_L_READERDataSet ds = null;

		SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectReaderList(dm);
        req.setAttribute("ds", ds);

	}

	/**
	 * ������������(���ڻ󼼺���)
	 *
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 *
	 */
	public void mo_selectReaderDetail(HttpServletRequest req,    //����Ͽ� SP_SL_S_RDR_INFO ���ν��� ����
			HttpServletResponse res) throws AppException {

		// parameter requesting �ϰ� DM�� ���� Setting
		String bocd =  req.getParameter("bocd"); // ���������ڵ�
		String rdr_no = Util.checkString(req.getParameter("rdr_no")); // ���ڹ�ȣ
		String medicd = Util.checkString(req.getParameter("medicd")); // ��ü�ڵ�
		String basiyymm = Util.checkString(req.getParameter("basiyymm")); // ���ݳ�����
		// �˻����س��

		SL_MO_S_RDR_INFODM dm = new SL_MO_S_RDR_INFODM();
		dm.setBocd(bocd);
		dm.setRdr_no(rdr_no);
		dm.setMedicd(medicd);
		dm.setBasiyymm(basiyymm);

		dm.print();

		SL_MO_S_RDR_INFODataSet ds = null;

		SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectReaderDetail(dm);

        req.setAttribute("ds", ds);

	}

    /**
     * ������������(���������˾�-�������������ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void mo_selectSubsHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_MO_L_NWSPSUBSCNTRPTCRDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//���ڹ�ȣ
        String frdt = Util.checkString(req.getParameter("frdt"));				//�˻� ������
        String todt = Util.checkString(req.getParameter("todt"));				//�˻� ������
        String medicd = Util.checkString(req.getParameter("medicd"));			//��ü�ڵ�(��)  ('##' ���� ����� ���� ��ü�ڵ� �� �� ����)
        String pageno = Util.checkString(req.getParameter("pageno"));			//��������ȣ
        String pagesize = Util.checkString(req.getParameter("pagesize"));		//������������

        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_MO_L_NWSPSUBSCNTRPTCRDM dm = new SL_MO_L_NWSPSUBSCNTRPTCRDM();
        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectSubsHistoryList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding
    }

    /**
     * ������������(���������˾�-�޵����������ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void mo_selectStopsHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_MO_L_VSPTCRDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));			//���ڹ�ȣ
        String frdt = Util.checkString(req.getParameter("frdt"));				//�˻� ������
        String todt = Util.checkString(req.getParameter("todt"));               //�˻� ������
        String medicd = Util.checkString(req.getParameter("medicd"));           //��ü�ڵ�(��)  ('##' ���� ����� ���� ��ü�ڵ� �� �� ����)
        String pageno = Util.checkString(req.getParameter("pageno"));           //��������ȣ
        String pagesize = Util.checkString(req.getParameter("pagesize"));       //������������

        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_MO_L_VSPTCRDM dm = new SL_MO_L_VSPTCRDM();
        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectStopsHistoryList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

    }

    /**
     * ������������(���������˾�-�̻系�������ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void mo_selectMoveHistoryList(HttpServletRequest req, HttpServletResponse res) throws AppException{
    	SL_MO_L_MOVM_RDRPTCRDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));		//���ڹ�ȣ
        String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));         //�˻� ������
        String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));         //�˻� ������
        String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));     //��ü�ڵ�(��)  ('##' ���� ����� ���� ��ü�ڵ� �� �� ����)
        String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));     //��������ȣ
        String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize"))); //������������


        // filtering
        // long type  "" --> "0"
        pageno = ("".equals(pageno))? "1" : pageno;
        pagesize = ("".equals(pagesize))? "9" : pagesize;

        SL_MO_L_MOVM_RDRPTCRDM dm = new SL_MO_L_MOVM_RDRPTCRDM();

        dm.setRdr_no(rdr_no);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setMedicd(medicd);
        dm.setPageno(Long.parseLong(pageno));
        dm.setPagesize(Long.parseLong(pagesize));

        SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectMoveHistoryList(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding

        /*
        // JNDI lookup �� ���� EJB Home interface ��ü����
        SLReader1100EJBHome home = (SLReader1100EJBHome)JNDIManager.getInstance().getHome("SLReader1100EJB");
        try{
            SLReader1100EJB ejb = home.create();
            SL_L_MOVM_RDRPTCRDataSet ds = null;
            ds = ejb.selectMoveHistoryList(dm); // ������ dm������ EJB�� ȣ��
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
     * ������������(���������˾�-�����ȸ)
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     *
     */
    public void mo_selectStopHist(HttpServletRequest req, HttpServletResponse res) throws AppException{ //����Ͽ�

    	SL_L_SUBS_CNTR_STOP_HISTDataSet ds = null;
        // parameter requesting �ϰ�  DM�� ���� Setting
        String bocd = Util.checkString(req.getParameter("bocd"));		//���ڹ�ȣ
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));		//���ڹ�ȣ
        String medicd = Util.checkString(req.getParameter("medicd"));

        SL_L_SUBS_CNTR_STOP_HISTDM dm = new SL_L_SUBS_CNTR_STOP_HISTDM();
        dm.setBocd(bocd);
        dm.setRdr_no(rdr_no);
        dm.setMedicd(medicd);

        SLReader11100DAO dao = new SLReader11100DAO();
        ds = dao.mo_selectStopHist(dm);
        req.setAttribute("ds", ds); // request�� ������� Binding


    }



}