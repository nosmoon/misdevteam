/***************************************************************************************************
* ���ϸ� : SE_SND_11800WB.java
* ��� : �Ǹ� - �߼۰��� - �뼱��ȸ_����Ͽ�
* �ۼ����� : 2017-01-06
* �ۼ��� :   �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.se.snd.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.snd.dao.SE_SND_11800DAO;
import chosun.ciis.se.snd.dao.SE_SND_1800DAO;
import chosun.ciis.se.snd.dm.SE_MO_SND_1811_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1800_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1810_LDM;
import chosun.ciis.se.snd.ds.SE_MO_SND_1811_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1800_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1810_LDataSet;
/**
 *
 */

public class SE_SND_11800WB extends BaseWB{


    /**
     * ��ȸ
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mo_se_snd_1811_l(HttpServletRequest req, HttpServletResponse res) throws   AppException { //����Ͽ�

    	SE_MO_SND_1811_LDataSet ds = null;

        // DM Setting
    	SE_MO_SND_1811_LDM dm 		= new SE_MO_SND_1811_LDM();

    	String route_clsf = Util.checkString(req.getParameter("route_clsf"));
    	String bo_cd = Util.checkString(req.getParameter("bo_cd"));

    	dm.setRoute_clsf(route_clsf);
    	dm.setBo_cd(bo_cd);

    	dm.print();

        try {
        	SE_SND_11800DAO dao = new SE_SND_11800DAO();
            ds = dao.mo_se_snd_1811_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

        dm.print();


    }
}
