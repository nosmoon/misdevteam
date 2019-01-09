/***************************************************************************************************
* ���ϸ� : SSReader11000WB.java_����Ͽ�
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

package chosun.ciis.ss.sls.rdr.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ss.sls.rdr.dao.SSReader11000DAO;
import chosun.ciis.ss.sls.rdr.dm.SS_MO_L_RDR_SRCHDM;
import chosun.ciis.ss.sls.rdr.ds.SS_MO_L_RDR_SRCHDataSet;

/**
 * ������Ȳ-���������� ���� WB
 */

public class SSReader11000WB{

    /**
     * ������Ȳ-��������-���ڰ˻� ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void mo_selectRdrSrchList(HttpServletRequest req, HttpServletResponse res) throws AppException {	//����Ͽ�
        SS_MO_L_RDR_SRCHDataSet ds = null;
        // Request Parameter Processing
        String rdr_no = Util.checkString(req.getParameter("rdr_no"));
        String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
        String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
        String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
        String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
        String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
        String onlmembid = Util.Uni2Ksc(Util.checkString(req.getParameter("onlmembid")));
        String search_order = Util.Uni2Ksc(Util.checkString(req.getParameter("search_order")));
        String pagenoStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
        long pageno = Long.parseLong(pagenoStr);
        String pagesizeStr = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
        long pagesize = Long.parseLong(pagesizeStr);

        // DM Setting
        SS_MO_L_RDR_SRCHDM dm = new SS_MO_L_RDR_SRCHDM();
        dm.setRdr_no(rdr_no);
        dm.setRdrnm(rdrnm);
        dm.setRdrtel_no1(rdrtel_no1);
        dm.setRdrtel_no2(rdrtel_no2);
        dm.setRdrtel_no3(rdrtel_no3);
        dm.setAddr3(addr3);
        dm.setOnlmembid(onlmembid);
        dm.setSearch_order(search_order);
        dm.setPageno(pageno);
        dm.setPagesize(pagesize);

        SSReader11000DAO dao = new SSReader11000DAO();

        // DAO ��ü�� selectRdrSrchList ȣ��
        ds = dao.mo_selectRdrSrchList(dm);
        req.setAttribute("ds", ds);
    }

}