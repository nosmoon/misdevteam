/***************************************************************************************************
 * 파일명 : SE_TRG_1100WB.java
 * 기능 : 지국별 목표등록
 * 작성일자 : 2009-03-26
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.trg.wb;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.se.trg.dao.SE_TRG_1100DAO;
import chosun.ciis.se.trg.dm.SE_TRG_1100_MDM;
import chosun.ciis.se.trg.dm.SE_TRG_1110_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1120_LDM;
import chosun.ciis.se.trg.dm.SE_TRG_1130_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1140_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1150_SDM;
import chosun.ciis.se.trg.dm.SE_TRG_1160_ADM;
import chosun.ciis.se.trg.dm.SE_TRG_1170_ADM;
import chosun.ciis.se.trg.ds.SE_TRG_1100_MDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1110_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1120_LDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1130_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1140_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1150_SDataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1160_ADataSet;
import chosun.ciis.se.trg.ds.SE_TRG_1170_ADataSet;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;
/**
 * 
 */

public class SE_TRG_1100WB extends BaseWB {

    /**
     * 초기 화면
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1100_MDataSet ds = null;
		SE_TRG_1100_MDM dm = new SE_TRG_1100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        try {
        	SE_TRG_1100DAO dao = new SE_TRG_1100DAO();
            ds = dao.se_trg_1100_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1100EJBHome home = (SE_TRG_1100EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1100EJB");
//			SE_TRG_1100EJB ejb = home.create();
//
//			ds = ejb.se_trg_1100_m(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}

    
    /**
     * 지국별 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1110_LDataSet ds = null;
		SE_TRG_1110_LDM dm = new SE_TRG_1110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.callgb = Util.checkString(req.getParameter("callgb"));
		dm.team_cd = Util.checkString(req.getParameter("team_cd"));
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bo_nm = Util.checkString(req.getParameter("bo_nm"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

        try {
        	SE_TRG_1100DAO dao = new SE_TRG_1100DAO();
            ds = dao.se_trg_1110_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1100EJBHome home = (SE_TRG_1100EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1100EJB");
//			SE_TRG_1100EJB ejb = home.create();
//
//			ds = ejb.se_trg_1110_l(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}

    
    /**
     * 목표구분별 내역조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1120_LDataSet ds = null;
		SE_TRG_1120_LDM dm = new SE_TRG_1120_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

        try {
        	SE_TRG_1100DAO dao = new SE_TRG_1100DAO();
            ds = dao.se_trg_1120_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	//dm.print();
//		try {
//			SE_TRG_1100EJBHome home = (SE_TRG_1100EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1100EJB");
//			SE_TRG_1100EJB ejb = home.create();
//
//			ds = ejb.se_trg_1120_l(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}

    /**
     * 목표 등록/수정
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1130_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1130_ADataSet ds = null;
		SE_TRG_1130_ADM dm = new SE_TRG_1130_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.busn_dept_yn = Util.checkString(req.getParameter("busn_dept_yn"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.bo_cd = Util.checkString(req.getParameter("bo_cd"));
		dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		
    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpDate);

    	String mode_ar = (String)hash.get("m"); 
		String trgt_clsf_ar = (String)hash.get("trgt_clsf"); 
		String trgt_01_ar = (String)hash.get("trgt_01"); 
		String trgt_02_ar = (String)hash.get("trgt_02"); 
		String trgt_03_ar = (String)hash.get("trgt_03"); 
		String trgt_04_ar = (String)hash.get("trgt_04"); 
		String trgt_05_ar = (String)hash.get("trgt_05"); 
		String trgt_06_ar = (String)hash.get("trgt_06"); 
		String trgt_07_ar = (String)hash.get("trgt_07"); 
		String trgt_08_ar = (String)hash.get("trgt_08"); 
		String trgt_09_ar = (String)hash.get("trgt_09"); 
		String trgt_10_ar = (String)hash.get("trgt_10"); 
		String trgt_11_ar = (String)hash.get("trgt_11"); 
		String trgt_12_ar = (String)hash.get("trgt_12"); 
		
		dm.mode_ar = mode_ar.toUpperCase();
		dm.trgt_clsf_ar = trgt_clsf_ar;
		dm.trgt_01_ar = trgt_01_ar;
		dm.trgt_02_ar = trgt_02_ar;
		dm.trgt_03_ar = trgt_03_ar;
		dm.trgt_04_ar = trgt_04_ar;
		dm.trgt_05_ar = trgt_05_ar;
		dm.trgt_06_ar = trgt_06_ar;
		dm.trgt_07_ar = trgt_07_ar;
		dm.trgt_08_ar = trgt_08_ar;
		dm.trgt_09_ar = trgt_09_ar;
		dm.trgt_10_ar = trgt_10_ar;
		dm.trgt_11_ar = trgt_11_ar;
		dm.trgt_12_ar = trgt_12_ar;
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_TRG_1100DAO dao = new SE_TRG_1100DAO();
            ds = dao.se_trg_1130_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_TRG_1100EJBHome home = (SE_TRG_1100EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1100EJB");
//			SE_TRG_1100EJB ejb = home.create();
//
//			ds = ejb.se_trg_1130_a(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}

	
    /**
     * 지국 마감/마감취소
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1140_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1140_ADataSet ds = null;
		SE_TRG_1140_ADM dm = new SE_TRG_1140_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.incmg_pers_ip = req.getRemoteAddr();

    	String multiUpDate = Util.checkString(req.getParameter("multiUpDate"));

    	Hashtable hash = getHashMultiUpdateData(multiUpDate);

    	String mode_ar = (String)hash.get("m"); 
		String area_cd_ar = (String)hash.get("area_cd"); 
		String bo_cd_ar = (String)hash.get("bo_cdseq"); 

		dm.mode_ar = mode_ar.toUpperCase();
		dm.area_cd_ar = area_cd_ar;
		dm.bo_cd_ar = bo_cd_ar;

        try {
        	SE_TRG_1100DAO dao = new SE_TRG_1100DAO();
            ds = dao.se_trg_1140_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
		
//		try {
//			SE_TRG_1100EJBHome home = (SE_TRG_1100EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1100EJB");
//			SE_TRG_1100EJB ejb = home.create();
//
//			ds = ejb.se_trg_1140_a(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}
	
    /**
     * 목표구분 수
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1150_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1150_SDataSet ds = null;
		SE_TRG_1150_SDM dm = new SE_TRG_1150_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

        try {
        	SE_TRG_1100DAO dao = new SE_TRG_1100DAO();
            ds = dao.se_trg_1150_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		try {
//			SE_TRG_1100EJBHome home = (SE_TRG_1100EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1100EJB");
//			SE_TRG_1100EJB ejb = home.create();
//
//			ds = ejb.se_trg_1150_s(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}

    
    /**
     * 목표 일괄등록(분배)
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1160_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_TRG_1160_ADataSet ds = null;
		SE_TRG_1160_ADM dm = new SE_TRG_1160_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.area_cd = Util.checkString(req.getParameter("area_cd"));
		dm.trgt_clsf = Util.checkString(req.getParameter("trgt_clsf"));
		dm.trgt_tot = Util.checkString(req.getParameter("trgt_tot"));
		dm.incmg_pers_ip = req.getRemoteAddr();

        try {
        	SE_TRG_1100DAO dao = new SE_TRG_1100DAO();
            ds = dao.se_trg_1160_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//dm.print();
//		try {
//			SE_TRG_1100EJBHome home = (SE_TRG_1100EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1100EJB");
//			SE_TRG_1100EJB ejb = home.create();
//
//			ds = ejb.se_trg_1160_a(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}

	}

    /**
     * 목표 업로드
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_trg_1170_a(HttpServletRequest req, HttpServletResponse res) throws AppException {

        int limitsize = 10*1024*1024;  // 파일크기
        Hashtable ht = new Hashtable();
        String filenm = "";
        File upfile = null;

        String svrRoot = req.getSession().getServletContext().getRealPath("/")+"/jsp/se/trg/";

   		File f = new File(svrRoot);
		if (!f.exists()){
        	f.mkdirs();                 
		}
			
        try {
            MultipartParser multi = new MultipartParser(req, limitsize, true, true, "euc_kr");
            Part part = null;
            
           	for (int i = 0; (part = multi.readNextPart()) != null; i++) {
           		if(part instanceof FilePart){
           			if(((FilePart) part).getFileName() != null) {
           				
           				FilePart filePart = (FilePart) part; 
           				filenm = filePart.getFileName(); 
           			
           				if (filenm != null){
           			        upfile = new File(svrRoot);
           					long size = filePart.writeTo(upfile); 
           					
           				}

           			}
           		}else if(part instanceof ParamPart){
           			ht.put(part.getName(), ((ParamPart)part).getStringValue());
           		}
           	}
           	
        } catch (IOException e) {
            throw new AppException("[SE_TRG_1100WB.se_trg_1170_i()]","[SE_TRG_1100WB.se_trg_1170_i()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        Workbook workbook = null;
        Sheet sheet = null;
        Cell cell = null;
        File xlsfile = new File(svrRoot+"/"+filenm);
        
        String sArea_cd = "";
        String sBo_cd = "";
        String sTrgt1_1 = "";
        String sTrgt1_2 = "";
        String sTrgt1_3 = "";
        String sTrgt1_4 = "";
        String sTrgt1_5 = "";
        String sTrgt1_6 = "";
        String sTrgt1_7 = "";
        String sTrgt1_8 = "";
        String sTrgt1_9 = "";
        String sTrgt1_10 = "";
        String sTrgt1_11 = "";
        String sTrgt1_12 = "";
        String sTrgt2_1 = "";
        String sTrgt2_2 = "";
        String sTrgt2_3 = "";
        String sTrgt2_4 = "";
        String sTrgt2_5 = "";
        String sTrgt2_6 = "";
        String sTrgt2_7 = "";
        String sTrgt2_8 = "";
        String sTrgt2_9 = "";
        String sTrgt2_10 = "";
        String sTrgt2_11 = "";
        String sTrgt2_12 = "";
        String sTrgt3_1 = "";
        String sTrgt3_2 = "";
        String sTrgt3_3 = "";
        String sTrgt3_4 = "";
        String sTrgt3_5 = "";
        String sTrgt3_6 = "";
        String sTrgt3_7 = "";
        String sTrgt3_8 = "";
        String sTrgt3_9 = "";
        String sTrgt3_10 = "";
        String sTrgt3_11 = "";
        String sTrgt3_12 = "";
        
        try
        {
            //엑셀파일을 인식
            workbook = Workbook.getWorkbook(xlsfile);

            //엑셀파일에 포함된 sheet의 배열을 리턴한다.
            //workbook.getSheets();

            if( workbook != null)
            {
                //엑셀파일에서 첫번째 Sheet를 인식
                sheet = workbook.getSheet(0);

                if( sheet != null)
                {
                    //셀인식 Cell a1 = sheet.getCell( 컬럼 Index, 열 Index);
                    //셀 내용 String stringa1 = a1.getContents();

                    //기록물철의 경우 실제 데이터가 시작되는 Row지정
                    int nRowStartIndex = 2;		//두줄은 타이틀 row
                    //기록물철의 경우 실제 데이터가 끝 Row지정
                    int nRowEndIndex   = sheet.getColumn( 2).length - 1;

                    //기록물철의 경우 실제 데이터가 시작되는 Column지정
                    int nColumnStartIndex = 1;
                    //기록물철의 경우 실제 데이터가 끝나는 Column지정
                    int nColumnEndIndex = sheet.getRow( 2).length - 1;

                    if(nColumnEndIndex != 38){
        	            throw new AppException("SE_TRG_1100WB", "엑셀 형식이 맞지 않습니다.");
                    }
                    
                    for( int nRow = nRowStartIndex; nRow <= nRowEndIndex; nRow++ )
                    {
                        sArea_cd = sArea_cd + "#" + sheet.getCell( 0, nRow).getContents();
                        sBo_cd = sBo_cd + "#" + sheet.getCell( 1, nRow).getContents();
                        sTrgt1_1 = sTrgt1_1 + "#" + sheet.getCell( 3, nRow).getContents();
                        sTrgt1_2 = sTrgt1_2 + "#" + sheet.getCell( 4, nRow).getContents();
                        sTrgt1_3 = sTrgt1_3 + "#" + sheet.getCell( 5, nRow).getContents();
                        sTrgt1_4 = sTrgt1_4 + "#" + sheet.getCell( 6, nRow).getContents();
                        sTrgt1_5 = sTrgt1_5 + "#" + sheet.getCell( 7, nRow).getContents();
                        sTrgt1_6 = sTrgt1_6 + "#" + sheet.getCell( 8, nRow).getContents();
                        sTrgt1_7 = sTrgt1_7 + "#" + sheet.getCell( 9, nRow).getContents();
                        sTrgt1_8 = sTrgt1_8 + "#" + sheet.getCell( 10, nRow).getContents();
                        sTrgt1_9 = sTrgt1_9 + "#" + sheet.getCell( 11, nRow).getContents();
                        sTrgt1_10 = sTrgt1_10 + "#" + sheet.getCell( 12, nRow).getContents();
                        sTrgt1_11 = sTrgt1_11 + "#" + sheet.getCell( 13, nRow).getContents();
                        sTrgt1_12 = sTrgt1_12 + "#" + sheet.getCell( 14, nRow).getContents();
                        sTrgt2_1 = sTrgt2_1 + "#" + sheet.getCell( 15, nRow).getContents();
                        sTrgt2_2 = sTrgt2_2 + "#" + sheet.getCell( 16, nRow).getContents();
                        sTrgt2_3 = sTrgt2_3 + "#" + sheet.getCell( 17, nRow).getContents();
                        sTrgt2_4 = sTrgt2_4 + "#" + sheet.getCell( 18, nRow).getContents();
                        sTrgt2_5 = sTrgt2_5 + "#" + sheet.getCell( 19, nRow).getContents();
                        sTrgt2_6 = sTrgt2_6 + "#" + sheet.getCell( 20, nRow).getContents();
                        sTrgt2_7 = sTrgt2_7 + "#" + sheet.getCell( 21, nRow).getContents();
                        sTrgt2_8 = sTrgt2_8 + "#" + sheet.getCell( 22, nRow).getContents();
                        sTrgt2_9 = sTrgt2_9 + "#" + sheet.getCell( 23, nRow).getContents();
                        sTrgt2_10 = sTrgt2_10 + "#" + sheet.getCell( 24, nRow).getContents();
                        sTrgt2_11 = sTrgt2_11 + "#" + sheet.getCell( 25, nRow).getContents();
                        sTrgt2_12 = sTrgt2_12 + "#" + sheet.getCell( 26, nRow).getContents();
                        sTrgt3_1 = sTrgt3_1 + "#" + sheet.getCell( 27, nRow).getContents();
                        sTrgt3_2 = sTrgt3_2 + "#" + sheet.getCell( 28, nRow).getContents();
                        sTrgt3_3 = sTrgt3_3 + "#" + sheet.getCell( 29, nRow).getContents();
                        sTrgt3_4 = sTrgt3_4 + "#" + sheet.getCell( 30, nRow).getContents();
                        sTrgt3_5 = sTrgt3_5 + "#" + sheet.getCell( 31, nRow).getContents();
                        sTrgt3_6 = sTrgt3_6 + "#" + sheet.getCell( 32, nRow).getContents();
                        sTrgt3_7 = sTrgt3_7 + "#" + sheet.getCell( 33, nRow).getContents();
                        sTrgt3_8 = sTrgt3_8 + "#" + sheet.getCell( 34, nRow).getContents();
                        sTrgt3_9 = sTrgt3_9 + "#" + sheet.getCell( 35, nRow).getContents();
                        sTrgt3_10 = sTrgt3_10 + "#" + sheet.getCell( 36, nRow).getContents();
                        sTrgt3_11 = sTrgt3_11 + "#" + sheet.getCell( 37, nRow).getContents();
                        sTrgt3_12 = sTrgt3_12 + "#" + sheet.getCell( 38, nRow).getContents();
                    }

                    sArea_cd = sArea_cd.substring(1);
                    sBo_cd = sBo_cd.substring(1);
                    sTrgt1_1 = sTrgt1_1.substring(1);
                    sTrgt1_2 = sTrgt1_2.substring(1);
                    sTrgt1_3 = sTrgt1_3.substring(1);
                    sTrgt1_4 = sTrgt1_4.substring(1);
                    sTrgt1_5 = sTrgt1_5.substring(1);
                    sTrgt1_6 = sTrgt1_6.substring(1);
                    sTrgt1_7 = sTrgt1_7.substring(1);
                    sTrgt1_8 = sTrgt1_8.substring(1);
                    sTrgt1_9 = sTrgt1_9.substring(1);
                    sTrgt1_10 = sTrgt1_10.substring(1);
                    sTrgt1_11 = sTrgt1_11.substring(1);
                    sTrgt1_12 = sTrgt1_12.substring(1);
                    sTrgt2_1 = sTrgt2_1.substring(1);
                    sTrgt2_2 = sTrgt2_2.substring(1);
                    sTrgt2_3 = sTrgt2_3.substring(1);
                    sTrgt2_4 = sTrgt2_4.substring(1);
                    sTrgt2_5 = sTrgt2_5.substring(1);
                    sTrgt2_6 = sTrgt2_6.substring(1);
                    sTrgt2_7 = sTrgt2_7.substring(1);
                    sTrgt2_8 = sTrgt2_8.substring(1);
                    sTrgt2_9 = sTrgt2_9.substring(1);
                    sTrgt2_10 = sTrgt2_10.substring(1);
                    sTrgt2_11 = sTrgt2_11.substring(1);
                    sTrgt2_12 = sTrgt2_12.substring(1);
                    sTrgt3_1 = sTrgt3_1.substring(1);
                    sTrgt3_2 = sTrgt3_2.substring(1);
                    sTrgt3_3 = sTrgt3_3.substring(1);
                    sTrgt3_4 = sTrgt3_4.substring(1);
                    sTrgt3_5 = sTrgt3_5.substring(1);
                    sTrgt3_6 = sTrgt3_6.substring(1);
                    sTrgt3_7 = sTrgt3_7.substring(1);
                    sTrgt3_8 = sTrgt3_8.substring(1);
                    sTrgt3_9 = sTrgt3_9.substring(1);
                    sTrgt3_10 = sTrgt3_10.substring(1);
                    sTrgt3_11 = sTrgt3_11.substring(1);
                    sTrgt3_12 = sTrgt3_12.substring(1);
                    
                }
                else
                {
                    System.out.println( "Sheet is null!!" );
                }
            }
            else
            {
                System.out.println( "WorkBook is null!!" );
            }
        }
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}catch(AppException e){
        	LogManager.getInstance().log(e);
            throw e;
        } catch(Exception e){
        	SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        finally
        {
            if( workbook != null)
            {
                workbook.close();
            }
        }
    
        //엑셀읽은후 파일삭제
        xlsfile.delete();

        String yyyy = Util.checkString((String)ht.get("yyyy"));    //년도
        
        SE_TRG_1170_ADataSet ds = null;
		SE_TRG_1170_ADM dm = new SE_TRG_1170_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.yyyy = yyyy;
		dm.area_cd = sArea_cd;
		dm.bo_cdseq = sBo_cd;
		dm.trgt1_1 = sTrgt1_1;
		dm.trgt1_2 = sTrgt1_2;
		dm.trgt1_3 = sTrgt1_3;
		dm.trgt1_4 = sTrgt1_4;
		dm.trgt1_5 = sTrgt1_5;
		dm.trgt1_6 = sTrgt1_6;
		dm.trgt1_7 = sTrgt1_7;
		dm.trgt1_8 = sTrgt1_8;
		dm.trgt1_9 = sTrgt1_9;
		dm.trgt1_10 = sTrgt1_10;
		dm.trgt1_11 = sTrgt1_11;
		dm.trgt1_12 = sTrgt1_12;
		dm.trgt2_1 = sTrgt2_1;
		dm.trgt2_2 = sTrgt2_2;
		dm.trgt2_3 = sTrgt2_3;
		dm.trgt2_4 = sTrgt2_4;
		dm.trgt2_5 = sTrgt2_5;
		dm.trgt2_6 = sTrgt2_6;
		dm.trgt2_7 = sTrgt2_7;
		dm.trgt2_8 = sTrgt2_8;
		dm.trgt2_9 = sTrgt2_9;
		dm.trgt2_10 = sTrgt2_10;
		dm.trgt2_11 = sTrgt2_11;
		dm.trgt2_12 = sTrgt2_12;
		dm.trgt3_1 = sTrgt3_1;
		dm.trgt3_2 = sTrgt3_2;
		dm.trgt3_3 = sTrgt3_3;
		dm.trgt3_4 = sTrgt3_4;
		dm.trgt3_5 = sTrgt3_5;
		dm.trgt3_6 = sTrgt3_6;
		dm.trgt3_7 = sTrgt3_7;
		dm.trgt3_8 = sTrgt3_8;
		dm.trgt3_9 = sTrgt3_9;
		dm.trgt3_10 = sTrgt3_10;
		dm.trgt3_11 = sTrgt3_11;
		dm.trgt3_12 = sTrgt3_12;

        try {
        	SE_TRG_1100DAO dao = new SE_TRG_1100DAO();
            ds = dao.se_trg_1170_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
//		try {
//			SE_TRG_1100EJBHome home = (SE_TRG_1100EJBHome)JNDIManager.getInstance().getHome("SE_TRG_1100EJB");
//			SE_TRG_1100EJB ejb = home.create();
//
//			ds = ejb.se_trg_1170_a(dm);
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			LogManager.getInstance().log(se);
//			throw se;
//		}
		
	}

}
