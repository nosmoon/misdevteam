/***************************************************************************************************
* 파일명 : SSCommon11100WB.java_모바일용
* 기능 : 부서,지역 등 공통 Worker Bean
* 작성일자 : 2016-12-14
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
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
 * 판매국 공통 업무를 위한 WB
 */
public class SSCommon11100WB{

	/**
     * 공통-지역커서리스트
	 * @param  req HttpServletRequest
	 * @param  res HttpServletResponse
     * @throws AppException
     **/
	public void mo_selectAreaList(HttpServletRequest req, HttpServletResponse res) throws AppException{ //모바일용

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
     * 공통-지역코드,코드명 목록
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mo_selectBoList(HttpServletRequest req, HttpServletResponse res) throws AppException{  //모바일용

    	SL_MO_L_BOLISTDataSet ds = null;

    	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
    	String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));

    	// DM Setting
        SL_MO_L_BOLISTDM dm = new SL_MO_L_BOLISTDM();

        dm.setAreacd(areacd);
        dm.setUid(uid);

        SSCommon11100DAO dao = new SSCommon11100DAO();
        // DAO 객체의 selectCodeSP 호출
        ds = dao.mo_selectBoList(dm);
        req.setAttribute("ds", ds);

    }


}

