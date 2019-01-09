/***************************************************************************************************
 * 파일명 : SSBrinfo1600DAO.java
 * 기능 : 지국Info-발송노선을 위한 DAO
 * 작성일자 : 2004-04-01
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.ss.sls.brinfo.rec.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국Info-발송노선을 위한 DAO
 */
public class SSBrinfo1600DAO {

    /**
     * 지국Info-지역정보가져오기
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_BSNS_INITDataSet selectAreaList(SS_L_BSNS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BSNS_INITDataSet ds = (SS_L_BSNS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국Info-발송노선(발차노선조회)
     * @param dm SS_L_BSNSDM 객체
     * @return SS_L_BSNSDataSet 객체
     * @throws AppException
     */
    public SS_L_BSNSDataSet selectBsnsList(SS_L_BSNSDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_L_BSNSDataSet ds = (SS_L_BSNSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
        /*SS_L_BSNSDataSet ds = new SS_L_BSNSDataSet();
        DBManager srcMgr         = new DBManager("Bsns");

        PreparedStatement pstmt  = null;
        ResultSet rs             = null;
        ResultSetMetaData rsmd   = null;
        String strSql            = null;
        ArrayList al             = null;   	// records
        String[] values          = null;   	// record  : 사이즈는 쿼리된 컬럼갯수 + 1 (지국지사코드를 하나더 넣을 수 있어야함)
        boolean success          = false;  	// 성공여부
        boolean bo_search        = false;   // 지국 선택 조회여부

        ds.errcode = "";
        ds.errmsg = "";

        //Transaction2(각각의 임시파일 읽기 ~ Oracle CRUD) 시작
        try{
            srcMgr.getConnection();
            srcMgr.setAutoCommit(false);
            try {
                // 검색조건에 맞는 발송노선 목록을 가져온다.
				strSql = " Select distinct  Jigukbae.*, Maeche.mcname, Maeche.mccode, ";
				strSql = strSql + " 		  		Jipan.jpname, Inse.inname, Nosun.noname, Jiguk.jiname ";
				strSql = strSql + " From Jigukbae, Jiguk, Maeche, Jipan, Inse, Nosun ";
				strSql = strSql + " Where jigukbae.jbbhdate between ? and ? ";
				strSql = strSql + " And jigukbae.jbcode = jiguk.jicode ";
				strSql = strSql + " And jigukbae.jbgcode = Maeche.mcgcode ";
				strSql = strSql + " And jigukbae.jbjpcode = Jipan.jpcode ";
				strSql = strSql + " And jigukbae.jbincode = Inse.incode ";
				strSql = strSql + " And jigukbae.jbncode = Nosun.nocode ";
                strSql = strSql + " And jiguk.jisjcode = ? ";

				if(!"".equals(dm.noname)) {
					strSql = strSql + " And Nosun.noname like '%" + dm.noname + "%' ";
				}

                if(!"".equals(dm.bocd)) {
                    strSql = strSql + " And jiguk.jipancode = ? ";
                    bo_search = true;
                }

				strSql = strSql + " ORDER BY jbnorder, jbjiorder ";

                pstmt = srcMgr.m_conn.prepareStatement(strSql);
                pstmt.setString(1, dm.jbbhdatefrom);
                pstmt.setString(2, dm.jbbhdateto);
                pstmt.setString(3, dm.areacd);

                if( bo_search == true ) {
                    pstmt.setString(4, dm.bocd);
                }

//                System.out.println( strSql );
//                System.out.println( "#: " + dm.jbbhdatefrom );
//                System.out.println( "#: " + dm.jbbhdateto );
//                System.out.println( "### " + dm.areacd + " : " + dm.bocd + " ###");

                rs = pstmt.executeQuery();

                if (rs != null) {
                    while (rs.next()) {
						SS_L_CURBSNSLISTRecord rec = new SS_L_CURBSNSLISTRecord();
						rec.mcname = Util.Uni2Ksc(Util.checkString(rs.getString("mcname")));
						rec.jbpansu = Util.checkString(rs.getString("JBPANSU"));
						rec.jpname = Util.Uni2Ksc(Util.checkString(rs.getString("JPNAME")));
						rec.inname = Util.Uni2Ksc(Util.checkString(rs.getString("INNAME")));
						rec.jbjiorder = Util.checkString(rs.getString("JBJIORDER"));
						rec.jiname = Util.Uni2Ksc(Util.checkString(rs.getString("JINAME")));
						rec.jbbusu = Util.checkString(rs.getString("JBBUSU"));
						rec.jbbalcha = Util.checkString(rs.getString("JBBALCHA"));
						rec.jbyetime = Util.checkString(rs.getString("JBYETIME"));
						rec.jbdotime = Util.checkString(rs.getString("JBDOTIME"));
						ds.curbsnslist.add(rec);

                    }
                    rs.close();

                }
                pstmt.close();

            } catch (SQLException se) {
                se.printStackTrace();
                srcMgr.rollback();
                throw new SysException(se);
            } finally {
                try {if(rs != null)rs.close();} catch (SQLException se) {}
                try {if(pstmt != null)pstmt.close();} catch (SQLException se) {}
                //srcMgr.disConnection(); (임시 파일 생성후 정상적으로 쓰기가 이뤄지기 전 까지 살려둔다.)
            }

        }catch(SysException se){
            srcMgr.rollback();
            throw se;
        }catch(Exception e){
            srcMgr.rollback();
            throw new SysException(e);
        }finally{
            srcMgr.disConnection();
        }


        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }*/
    }

    /**
     * 지국Info-발송노선(sms조회)
     * @param dm SS_S_SMSDM 객체
     * @return SS_S_SMSDataSet 객체
     * @throws AppException
     */

    public SS_S_SMSDataSet selectSmsDetail(SS_S_SMSDM dm) throws AppException {
        SS_S_SMSDataSet ds = new SS_S_SMSDataSet();
        DBManager srcMgr         = new DBManager("Bsns");

        PreparedStatement pstmt  = null;
        ResultSet rs             = null;
        ResultSetMetaData rsmd   = null;
        String strSql            = null;
        String strCheck			 = null;
        ArrayList al             = null;   	// records
        String[] values          = null;   	// record  : 사이즈는 쿼리된 컬럼갯수 + 1 (지국지사코드를 하나더 넣을 수 있어야함)
        boolean success          = false;  	// 성공여부

        ds.errcode = "";
        ds.errmsg = "";

        //Transaction2(각각의 임시파일 읽기 ~ Oracle CRUD) 시작
        try{
            srcMgr.getConnection();
            srcMgr.setAutoCommit(false);
            try {
                // 검색조건에 맞는 발송노선 목록을 가져온다.
				strSql = " 			SELECT JISMSNUM1,JISMSNUM2,JISMSNUM3,JIEMAIL,JISMSSET ";
				strSql = strSql + " FROM JIGUK ";
				strSql = strSql + " WHERE JIPANCODE = ? ";

                pstmt = srcMgr.m_conn.prepareStatement(strSql);
                pstmt.setString(1, dm.bocd);
                rs = pstmt.executeQuery();
                if (rs != null) {
                    if(rs.next()) {
						ds.sms1 = Util.checkString(rs.getString("JISMSNUM1"));
						ds.sms2 = Util.checkString(rs.getString("JISMSNUM2"));
						ds.sms3 = Util.checkString(rs.getString("JISMSNUM3"));
						ds.emailnm = Util.checkString(rs.getString("JIEMAIL"));
						strCheck = Util.checkString(rs.getString("JISMSSET"));
                                                if(strCheck.length()==0){
                                                    ds.smsset = "";
                                                    ds.emailset = "";
                                                }
                                                else if(strCheck.length()==1){
                                                    ds.smsset = strCheck;
                                                    ds.emailset = "";
                                                }
                                                else if(strCheck.length()==2){
                                                    ds.smsset = strCheck.substring(0,1);
                                                    ds.emailset = strCheck.substring(1,2);
                                                }
                    }
                    rs.close();

                }
                pstmt.close();

            } catch (SQLException se) {
                se.printStackTrace();
                srcMgr.rollback();
                throw new SysException(se);
            } finally {
                try {if(rs != null)rs.close();} catch (SQLException se) {}
                try {if(pstmt != null)pstmt.close();} catch (SQLException se) {}
                //srcMgr.disConnection(); (임시 파일 생성후 정상적으로 쓰기가 이뤄지기 전 까지 살려둔다.)
            }

        }catch(SysException se){
            srcMgr.rollback();
            throw se;
        }catch(Exception e){
            srcMgr.rollback();
            throw new SysException(e);
        }finally{
            srcMgr.disConnection();
        }


        //if(!"".equals(ds.errcode)){
        //    throw new AppException(ds.errcode, ds.errmsg);
        //} else{
            return ds;
        //}
    }

    /**
     * 지국Info-발송노선(sms수정)
     * @param dm SS_U_SMSDM 객체
     * @return SS_U_SMSDataSet 객체
     * @throws AppException
     */

    public SS_U_SMSDataSet selectSmsUpdate(SS_U_SMSDM dm) throws AppException {
        SS_U_SMSDataSet ds = new SS_U_SMSDataSet();
        DBManager srcMgr         = new DBManager("Bsns");

        PreparedStatement pstmt  = null;
        ResultSet rs             = null;
        ResultSetMetaData rsmd   = null;
        String strSql            = null;
        int cnt                  = 0;      //insert,update,delete 반영 갯수
        ArrayList al             = null;   	// records
        String[] values          = null;   	// record  : 사이즈는 쿼리된 컬럼갯수 + 1 (지국지사코드를 하나더 넣을 수 있어야함)
        boolean success          = false;  	// 성공여부

        ds.errcode = "";
        ds.errmsg = "";

        //Transaction2(각각의 임시파일 읽기 ~ Oracle CRUD) 시작
        try{
            srcMgr.getConnection();
            srcMgr.setAutoCommit(false);
            try {
                strSql = "UPDATE JIGUK WITH(ROWLOCK) SET ";
				strSql = strSql + " JISMSNUM1 = ? , ";
				strSql = strSql + " JISMSNUM2 = ? , ";
				strSql = strSql + " JISMSNUM3 = ? , ";
				strSql = strSql + " JIEMAIL = ? , ";
				strSql = strSql + " JISMSSET = ? ";
				strSql = strSql + " WHERE JIPANCODE = ? ";

                pstmt = srcMgr.m_conn.prepareStatement(strSql);
                pstmt.setString(1, dm.sms1);				//SMS1
                pstmt.setString(2, dm.sms2); 				//SMS2
                pstmt.setString(3, dm.sms3); 				//SMS3
                pstmt.setString(4, dm.emailnm); 			//Email정보
                pstmt.setString(5, dm.smsset+dm.emailset); 	//통보설정여부
                pstmt.setString(6, dm.bocd); 				//지국지사코드
                cnt = pstmt.executeUpdate();

            } catch (SQLException se) {
                se.printStackTrace();
                srcMgr.rollback();
                throw new SysException(se);
            } finally {
                try {if(rs != null)rs.close();} catch (SQLException se) {}
                try {if(pstmt != null)pstmt.close();} catch (SQLException se) {}
                //srcMgr.disConnection(); (임시 파일 생성후 정상적으로 쓰기가 이뤄지기 전 까지 살려둔다.)
            }

        }catch(SysException se){
            srcMgr.rollback();
            throw se;
        }catch(Exception e){
            srcMgr.rollback();
            throw new SysException(e);
        }finally{
            srcMgr.disConnection();
        }

        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        } else{
            return ds;
        }
    }

}
