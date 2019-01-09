/***************************************************************************************************
* ���ϸ� : SSCommon11100WB.java_����Ͽ�
* ��� : �μ�,���� �� ���� Worker Bean
* �ۼ����� : 2016-12-14
* �ۼ��� : �弱��
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
public class SSCommon11100WB{

	/**
     * ����-����Ŀ������Ʈ
	 * @param  req HttpServletRequest
	 * @param  res HttpServletResponse
     * @throws AppException
     **/
	public void mo_selectAreaList(HttpServletRequest req, HttpServletResponse res) throws AppException{ //����Ͽ�

		SL_MO_L_AREALISTDataSet ds = null;

		String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));

		// DM Setting
		SL_MO_L_AREALISTDM dm = new SL_MO_L_AREALISTDM();

		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

		SSCommon11100DAO dao = new SSCommon11100DAO();

		ds = dao.mo_selectAreaList(dm);
        req.setAttribute("ds", ds);
	}

    /**
     * ����-�����ڵ�,�ڵ�� ���
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mo_selectBoList(HttpServletRequest req, HttpServletResponse res) throws AppException{  //����Ͽ�

    	SL_MO_L_BOLISTDataSet ds = null;

    	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));

    	// DM Setting
        SL_MO_L_BOLISTDM dm = new SL_MO_L_BOLISTDM();

        dm.setAreacd(areacd);
        dm.setUid(uid);

        SSCommon11100DAO dao = new SSCommon11100DAO();
        // DAO ��ü�� selectCodeSP ȣ��
        ds = dao.mo_selectBoList(dm);
        req.setAttribute("ds", ds);

    }


}

