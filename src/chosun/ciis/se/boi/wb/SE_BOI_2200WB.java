/***************************************************************************************************
 * 파일명 : SE_BOI_2200WB.java
 * 기능 : 지국세대구성
 * 작성일자 : 2009-03-26
 * 작성자 : 이민효
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.boi.wb;

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
import chosun.ciis.se.boi.dao.SE_BOI_2200DAO;
import chosun.ciis.se.boi.dm.SE_BOI_2210_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2220_LDM;
import chosun.ciis.se.boi.dm.SE_BOI_2230_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_2240_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_2250_ADM;
import chosun.ciis.se.boi.dm.SE_BOI_2260_ADM;
import chosun.ciis.se.boi.ds.SE_BOI_2210_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2220_LDataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2230_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2240_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2250_ADataSet;
import chosun.ciis.se.boi.ds.SE_BOI_2260_ADataSet;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;
/**
 * 
 */

public class SE_BOI_2200WB extends BaseWB {

    /**
     * 지국별 조회
     *
     * @@param req HttpServletRequest
     * @@param res HttpServletResponse
     * @@throws AppException
     */
	public void se_boi_2210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2210_LDataSet ds = null;
		SE_BOI_2210_LDM dm = new SE_BOI_2210_LDM();

		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String yy = Util.checkString(req.getParameter("yy"));
		String sido = Util.checkString(req.getParameter("sido"));
		String gugun = Util.checkString(req.getParameter("gugun"));
		String dong = Util.checkString(req.getParameter("dong"));
		String gb = Util.checkString(req.getParameter("gb"));
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setYy(yy);
		dm.setSido(sido);
		dm.setGugun(gugun);
		dm.setDong(dong);
		dm.setGb(gb);
		
        try {
        	SE_BOI_2200DAO dao = new SE_BOI_2200DAO();
            ds = dao.se_boi_2210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//		dm.print();
//		SE_BOI_2200EJBHome home = (SE_BOI_2200EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2200EJB");
//		try {
//			
//			SE_BOI_2200EJB ejb = home.create();
//			System.out.println("1111111111111111111111::::::::::");
//			ds = ejb.se_boi_2210_l(dm);
//			System.out.println("2222222222222222222222::::::::::");
//			req.setAttribute("ds", ds);
//		}
//		catch (CreateException e) {
//			SysException se = new SysException(e);
//			System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//			LogManager.getInstance().log(se);
//			throw se;
//		}
//		catch (RemoteException e) {
//			SysException se = new SysException(e);
//			System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
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
	public void se_boi_2220_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2220_LDataSet ds = null;
		SE_BOI_2220_LDM dm = new SE_BOI_2220_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yy = Util.checkString(req.getParameter("yy"));
		dm.dong_cd = Util.checkString(req.getParameter("dong_cd"));
		//dm.bo_seq = Util.checkString(req.getParameter("bo_seq"));
		//dm.yyyy = Util.checkString(req.getParameter("yyyy"));

        try {
        	SE_BOI_2200DAO dao = new SE_BOI_2200DAO();
            ds = dao.se_boi_2220_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//	    dm.print();
//	    SE_BOI_2200EJBHome home = (SE_BOI_2200EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2200EJB");
//		try {			
//			SE_BOI_2200EJB ejb = home.create();
//			System.out.println("1111111111111111111111::::::::::");
//			ds = ejb.se_boi_2220_l(dm);
//			System.out.println("222222222222222222::::::::::");
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
	public void se_boi_2230_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2230_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    	System.out.println("multiUpdateData: " + multiUpdateData);

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	String mode_ar = (String)hash.get("m"); 
		String dong_cd_ar = (String)hash.get("dong_cd");
		String yy_ar = (String)hash.get("yy");
		String mvin_apt_cnt_ar = (String)hash.get("mvin_apt_cnt");
		
        String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers_ip    = req.getRemoteAddr();
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        //DM Setting
        SE_BOI_2230_ADM dm = new SE_BOI_2230_ADM();

        dm.setCmpy_cd(cmpy_cd);
        System.out.println("mode_ar: " + mode_ar);        
        dm.setMode(mode_ar.toUpperCase());
        dm.setDong_cd(dong_cd_ar);
        dm.setYy(yy_ar);
        dm.setMvin_apt_cnt(mvin_apt_cnt_ar);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmgpers(incmg_pers);
        
        try {
        	SE_BOI_2200DAO dao = new SE_BOI_2200DAO();
            ds = dao.se_boi_2230_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BOI_2200EJBHome home = (SE_BOI_2200EJBHome) JNDIManager.getInstance().getHome("SE_BOI_2200EJB");
//        
//        try {
//        	SE_BOI_2200EJB ejb = home.create();
//            ds = ejb.se_boi_2230_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
	}
	
	public void se_boi_2240_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2240_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    	System.out.println("multiUpdateData: " + multiUpdateData);

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	String mode_ar = (String)hash.get("m"); 
		String dong_cd_ar = (String)hash.get("dong_cd");
		String yy_ar = (String)hash.get("yy");
		String mvin_apt_cnt_ar = (String)hash.get("mvin_apt_cnt");
		
        String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers_ip    = req.getRemoteAddr();
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        //DM Setting
        SE_BOI_2240_ADM dm = new SE_BOI_2240_ADM();

        dm.setCmpy_cd(cmpy_cd);
        System.out.println("mode_ar: " + mode_ar);        
        dm.setMode(mode_ar.toUpperCase());
        dm.setDong_cd(dong_cd_ar);
        dm.setYy(yy_ar);
        dm.setMvin_apt_cnt(mvin_apt_cnt_ar);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmgpers(incmg_pers);
        
        try {
        	SE_BOI_2200DAO dao = new SE_BOI_2200DAO();
            ds = dao.se_boi_2240_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BOI_2200EJBHome home = (SE_BOI_2200EJBHome) JNDIManager.getInstance().getHome("SE_BOI_2200EJB");
//        
//        try {
//        	SE_BOI_2200EJB ejb = home.create();
//            ds = ejb.se_boi_2240_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
	}
	
	public void se_boi_2250_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		SE_BOI_2250_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    	System.out.println("multiUpdateData: " + multiUpdateData);

    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	String mode_ar = (String)hash.get("m");
    	String bo_cd_ar = (String)hash.get("bo_cd");
		String ratio_ar = (String)hash.get("ratio");
		
        String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
        String yy               = Util.checkString(req.getParameter("yy"));
        String dong_cd          = Util.checkString(req.getParameter("dong_cd"));
        String incmg_pers_ip    = req.getRemoteAddr();
        String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
        
        //DM Setting
        SE_BOI_2250_ADM dm = new SE_BOI_2250_ADM();

        dm.setCmpy_cd(cmpy_cd);
        System.out.println("mode_ar: " + mode_ar);        
        dm.setMode(mode_ar.toUpperCase());
        dm.setBo_cd(bo_cd_ar);
        dm.setRatio(ratio_ar);
        dm.setYy(yy);
        dm.setDong_cd(dong_cd);        
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmgpers(incmg_pers);
        
        try {
        	SE_BOI_2200DAO dao = new SE_BOI_2200DAO();
            ds = dao.se_boi_2250_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BOI_2200EJBHome home = (SE_BOI_2200EJBHome) JNDIManager.getInstance().getHome("SE_BOI_2200EJB");
//        
//        try {
//        	SE_BOI_2200EJB ejb = home.create();
//            ds = ejb.se_boi_2250_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
	}
	
	public void se_boi_2260_a(HttpServletRequest req, HttpServletResponse res) throws AppException {

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
            throw new AppException("[SE_BOI_2200WB.se_boi_2260_i()]","[SE_BOI_2200WB.se_boi_2260_i()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
        } catch (Exception e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }

        Workbook workbook = null;
        Sheet sheet = null;
        Cell cell = null;
        File xlsfile = new File(svrRoot+"/"+filenm);
        
        String sSido = "";
        String sGugun = "";
        String sDong = "";
        String sRemk = "";
        String sApt_cnt = "";
        String sMvin_apt_cnt = "";
        String sHous_cnt = "";
        String sShop_cnt = "";
        String sOffi_room_cnt = "";
        String sPopl_cnt = "";
        
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
                    int nRowStartIndex = 5;		//다섯줄은 타이틀 row
                    //기록물철의 경우 실제 데이터가 끝 Row지정
                    int nRowEndIndex   = sheet.getColumn( 2).length - 1;

                    //기록물철의 경우 실제 데이터가 시작되는 Column지정
                    int nColumnStartIndex = 1;
                    //기록물철의 경우 실제 데이터가 끝나는 Column지정
                    int nColumnEndIndex = sheet.getRow( 3).length - 1;

                    if(nColumnEndIndex != 24){
        	            throw new AppException("SE_BOI_2200WB", "엑셀 형식이 맞지 않습니다.");
                    }
                    
                    for( int nRow = nRowStartIndex; nRow <= nRowEndIndex; nRow++ )
                    {
                        sSido = sSido + "#" + sheet.getCell( 0, nRow).getContents();
                        sGugun = sGugun + "#" + sheet.getCell( 1, nRow).getContents();
                        sDong = sDong + "#" + sheet.getCell( 2, nRow).getContents();
                        sRemk = sRemk + "#" + sheet.getCell( 24, nRow).getContents();
                        sApt_cnt = sApt_cnt + "#" + sheet.getCell( 18, nRow).getContents();
                        sMvin_apt_cnt = sMvin_apt_cnt + "#" + sheet.getCell( 23, nRow).getContents();
                        sHous_cnt = sHous_cnt + "#" + sheet.getCell( 16, nRow).getContents();
                        sShop_cnt = sShop_cnt + "#" + sheet.getCell( 21, nRow).getContents();
                        sOffi_room_cnt = sOffi_room_cnt + "#" + sheet.getCell( 22, nRow).getContents();
                        sPopl_cnt = sPopl_cnt + "#" + sheet.getCell( 3, nRow).getContents();
                        
                       
                        if ( nRow%500 == 0 || nRow == nRowEndIndex) {
                        	sSido = sSido.substring(1);
                            sGugun = sGugun.substring(1);
                            sDong = sDong.substring(1);
                            sRemk = sRemk.substring(1);
                            sApt_cnt = sApt_cnt.substring(1);
                            sMvin_apt_cnt = sMvin_apt_cnt.substring(1);
                            sHous_cnt = sHous_cnt.substring(1);
                            sShop_cnt = sShop_cnt.substring(1);
                            sOffi_room_cnt = sOffi_room_cnt.substring(1);
                            sPopl_cnt = sPopl_cnt.substring(1);
                        	
                            String yyyy = Util.checkString((String)ht.get("yyyy"));    //년도
                            
                            SE_BOI_2260_ADataSet ds = null;
                    		SE_BOI_2260_ADM dm = new SE_BOI_2260_ADM();

                    		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
                    		dm.incmgpers = Util.getSessionParameterValue(req, "emp_no", true);
                    		dm.incmg_pers_ip = req.getRemoteAddr();
                    		dm.yy = yyyy;
                    		dm.sido = sSido;
                    		dm.gugun = sGugun;
                    		dm.dong = sDong;
                    		dm.remk = sRemk;
                    		dm.apt_cnt = sApt_cnt;
                    		dm.mvin_apt_cnt = sMvin_apt_cnt;
                    		dm.hous_cnt = sHous_cnt;
                    		dm.shop_cnt = sShop_cnt;
                    		dm.offi_room_cnt = sOffi_room_cnt;
                    		dm.popl_cnt = sPopl_cnt;

					        try {
					        	SE_BOI_2200DAO dao = new SE_BOI_2200DAO();
					            ds = dao.se_boi_2260_a(dm);
					            req.setAttribute("ds", ds);
					        }
					        catch (AppException e) {
					            LogManager.getInstance().log(e);
					            throw e;
					        }

//                    		dm.print();
//                    		try {
//                    			SE_BOI_2200EJBHome home = (SE_BOI_2200EJBHome)JNDIManager.getInstance().getHome("SE_BOI_2200EJB");
//                    			SE_BOI_2200EJB ejb = home.create();
//
//                    			ds = ejb.se_boi_2260_a(dm);
//                    			req.setAttribute("ds", ds);
//                    		}
//                    		catch (CreateException e) {
//                    			SysException se = new SysException(e);
//                    			LogManager.getInstance().log(se);
//                    			throw se;
//                    		}
//                    		catch (RemoteException e) {
//                    			SysException se = new SysException(e);
//                    			LogManager.getInstance().log(se);
//                    			throw se;
//                    		}
                    		
                    		sSido = "";
                            sGugun = "";
                            sDong = "";
                            sRemk = "";
                            sApt_cnt = "";
                            sMvin_apt_cnt = "";
                            sHous_cnt = "";
                            sShop_cnt = "";
                            sOffi_room_cnt = "";
                            sPopl_cnt = "";
                        }
                    }

                    sSido = sSido.substring(1);
                    sGugun = sGugun.substring(1);
                    sDong = sDong.substring(1);
                    sRemk = sRemk.substring(1);
                    sApt_cnt = sApt_cnt.substring(1);
                    sMvin_apt_cnt = sMvin_apt_cnt.substring(1);
                    sHous_cnt = sHous_cnt.substring(1);
                    sShop_cnt = sShop_cnt.substring(1);
                    sOffi_room_cnt = sOffi_room_cnt.substring(1);
                    sPopl_cnt = sPopl_cnt.substring(1);
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
	}
    
}
