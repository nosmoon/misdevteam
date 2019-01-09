/***************************************************************************************************
* 파일명 : SSAdmin1100DAO.java
* 기능 : 관리자-작업-마이그레이션을 위한 DAO
* 작성일자 : 2004-03-12
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;
import somo.framework.prop.*;

import java.sql.*;
import java.util.*;
import java.io.*;
import java.text.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;


/**
 * 관리자-작업-마이그레이션을 위한 DAO
 */

public class SSAdmin1100DAO {
    /**
     * 관리자-작업-마이그레이션-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet initMig(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-목록
     * @param dm SS_S_MIGRWORKINFODM
     * @return SS_S_MIGRWORKINFODataSet
     * @throws AppException
     */
    public SS_S_MIGRWORKINFODataSet selectMigList(SS_S_MIGRWORKINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_MIGRWORKINFODataSet ds = (SS_S_MIGRWORKINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-지국DB업로드
     * @param bocd 지국지사코드
     * @param bonm 지국지사명
     * @param incmgpers 입력자
     * @throws AppException
     */
    public void boUpload(String bocd, String bonm, String incmgpers) throws AppException {
        // 지국 마이그레이션 완료여부 체크
        SS_L_MIGRWORKINFODM migDM = new SS_L_MIGRWORKINFODM();
        migDM.setBocd(bocd);
        DBManager migManager = new DBManager("Oracle");
        SS_L_MIGRWORKINFODataSet migDS = (SS_L_MIGRWORKINFODataSet) migManager.executeCall(migDM);
        if (!"".equals(migDS.errcode)) {
           throw new AppException(migDS.errcode, migDS.errmsg);
       }

// 지국이 이미 마이그레이션완료된 지국이면 예외처리
       if(migDS.curcommlist.size() != 0){

           SS_L_MIGRWORKINFOCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKINFOCURCOMMLISTRecord)migDS.curcommlist.get(0);
           if ("Y".equals(curcommlistRec.getEndcnfmyn())) {
               throw new AppException("SSAdmin1100DAO.boUpload()", "이미 마이그레이션이 완료된 지국입니다.");
           }
       }

        // 지국DB업로드 상태확인, 최종작업번호를 얻기
        SS_S_MIGR_DBUPDM upDM = new SS_S_MIGR_DBUPDM();
        upDM.setBocd(bocd);
        DBManager upManager = new DBManager("Oracle");
        SS_S_MIGR_DBUPDataSet upDS = (SS_S_MIGR_DBUPDataSet) upManager.executeCall(upDM);
        if (!"".equals(upDS.errcode)) {
            throw new AppException(upDS.errcode, upDS.errmsg);
        }
        // 지국DB업로드 상태가 진행중이면 예외처리
        if ("1".equals(upDS.getBodbupstatcd())) {
            throw new AppException("SSAdmin1100DAO.boUpload()", "해당 지국의 지국DB업로드 작업이 진행중입니다.");
        }
        try{

            // default.properties 파일로부터 sqlload의 실행경로를 얻는다.
            Properties p = new Properties();
            File propFile = new File("//was//salesdept//prop//default.properties");

            FileInputStream fis = new FileInputStream(propFile);
            p.load(fis);
            fis.close();

            // SQL*Loader script 실행
//      String cmdPath = "ksh /isdata/chosunis/dataload/";
            String cmdPath = "ksh " + p.get("MIG.SQLLOAD.PATH");
            String cmd = "sqlload " + bocd + " " + bonm + " " + upDS.workno + " " + incmgpers;
            Runtime r = Runtime.getRuntime();
            Process proc = r.exec(cmdPath + cmd);
// 디버깅 코드 시작
            InputStream stdin = proc.getInputStream();
            InputStreamReader isr = new InputStreamReader(stdin);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            System.out.println("<OUTPUT>");
            while ( (line = br.readLine()) != null){
                System.out.println(line);
                if(line.indexOf("ORA-") != -1 || line.indexOf("Exception") != -1){
                    throw new Exception();
                }
            }
            System.out.println("</OUTPUT>");
            int exitVal = proc.waitFor();
            System.out.println("Process exitValue: " + exitVal);
            if(exitVal == -1){
                throw new Exception();
            }
// 디버깅 코드 끝
        }catch(Exception e){
            e.printStackTrace();
            throw new AppException("SSAdmin1100DAO.boUpload()", "sqlload 실행시 에러가 발생했습니다.");
        }
    }


    /**
     * Deletes all files and subdirectories under dir.
     * Returns true if all deletions were successful.
     * If a deletion fails, the method stops attempting to delete and returns false.
     * @param dir File
     * @return success
     */
    private boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }

        // The directory is now empty so delete it
        return dir.delete();
    }

    /**
     * 임시파일로 부터 읽어들인 문자열에서
     * 하나의 라인구분자까지의 레코드 ArrayList를 구한 후 리턴
     * @param str String Souce String
     * @param cd String  Column Delimiter
     * @param ld String  Line Delimiter
     * @return ArrayList
     */
    private ArrayList parseRecords(String str, String cd, String ld) {
        ArrayList al = new ArrayList();
        if(str == null || str.length() == 0) return al;
        int ldIdx = str.indexOf(ld,0); //라인 구분자의 위치
        //System.out.println("str : " + str);
        //System.out.println("ldIdx : " + ldIdx);
        //System.out.println("first cd idx : " + str.indexOf(cd));
        int idx = -1;
        while(idx != ldIdx ){
            al.add(str.substring(idx+1, (str.indexOf(cd, idx+1) == -1)? ldIdx : str.indexOf(cd, idx+1)));
            idx = (str.indexOf(cd, idx+1) == -1)? ldIdx : str.indexOf(cd, idx+1);
        }
        return al;
    }

    /**
     *
     * @param destMgr
     * @param statecd
     * @throws AppException
     */
    private SS_A_MIG_BILLUPDataSet setWorkState(DBManager destMgr, SS_A_MIG_BILLUPDM dm, SS_A_MIG_BILLUPDataSet ds, String statecd) throws AppException{
       //local variables
       //SS_A_MIG_BILLUPDataSet ds = new SS_A_MIG_BILLUPDataSet();
       PreparedStatement pstmt = null;
       ResultSet rs            = null;
       String strSql           = null;
       ArrayList al            = null;   //records
       String[] values         = null;   //record  : 사이즈는 쿼리된 컬럼갯수 + 1 (지국지사코드를 하나더 넣을 수 있어야함)

       //마이그레이션 빌링UPLOAD 작업상태 확인및 셋팅
       destMgr.getConnection();
       destMgr.setAutoCommit(false);
       try {
           //이미 해당지국이 마이그레시션 중인지 검증

           strSql = "SELECT BILLDBUPSTATCD FROM TACOM_MIGRWORKINFO WHERE BOCD = ? ";
           pstmt = destMgr.m_conn.prepareStatement(strSql);
           pstmt.setString(1, dm.bocd);
           rs = pstmt.executeQuery();
           if (rs != null) {
               al = new ArrayList();
               values = new String[1];
               while (rs.next()) {
                   values[0] = rs.getString(1);
                   al.add(values);
               }
               rs.close();

               if (!"3".equals(statecd) && "1".equals(values[0])) {
                   ds.errcode = "[SSAdmin1100DAO.java-setWorkState](1)";
                   ds.errmsg = "[SSAdmin1100DAO.java-setWorkState](1) 해당지국(" + dm.bocd + ")은 마이그레이션 작업중 입니다.";
                   throw new AppException(ds.errcode, ds.errmsg);
               }
           }
           pstmt.close();
           if (al.size() == 0) { //해당지국의 TACOM_MIGRWORKINFO에 레코드 자체가 없을 경우 신규 추가
               strSql = "INSERT INTO TACOM_MIGRWORKINFO(BOCD, BILLDBUPFRDT, BILLDBUPSTATCD, ENDCNFMYN ) VALUES ( ?, SYSDATE, ?, ?)";
               pstmt = destMgr.m_conn.prepareStatement(strSql);
               pstmt.setString(1, dm.bocd); //지국지사코드
               pstmt.setString(2, statecd); //(1:작업중,2:작업완료, 3:작업오류) 셋팅
               pstmt.setString(3, "N"); //완료확인여부 "N" 셋팅

               pstmt.executeUpdate();
           } else { //해당지국의 레코드가 존재 할 경우
               strSql = "UPDATE TACOM_MIGRWORKINFO SET BILLDBUPFRDT = SYSDATE, BILLDBUPSTATCD = ?, ENDCNFMYN = ?, ENDCNFMPERS = NULL, ENDCNFMDT = NULL WHERE BOCD = ? ";
               pstmt = destMgr.m_conn.prepareStatement(strSql);
               pstmt.setString(1, statecd); //(1:작업중,2:작업완료, 3:작업오류) 셋팅
               pstmt.setString(2, "N"); //완료확인여부 "N" 셋팅
               pstmt.setString(3, dm.bocd); //지국지사코드
               pstmt.executeUpdate();
           }
           destMgr.commit();
           if("3".equals(statecd)){
               throw new AppException(ds.errcode, ds.errmsg);
           }
       } catch (SQLException se) {
           se.printStackTrace();
           destMgr.rollback();
           ds.errcode = "[SSAdmin1100DAO.java-setWorkState](3)";
           ds.errmsg = "[SSAdmin1100DAO.java-setWorkState](3) 해당지국(" + dm.bocd + ")은 마이그레이션 작업중 정보 셋팅중 에러발생";
           throw new AppException(ds.errcode, ds.errmsg);
       } finally {
           try {if (rs != null)rs.close();} catch (SQLException se) {se.printStackTrace();}
           try {if (pstmt != null)pstmt.close();} catch (SQLException se) {se.printStackTrace();}
           destMgr.disConnection();
       }
       return ds;
    }

    /**
     * 관리자-마이그레이션-전환
     *  [Transaction1 시작](조선IS빌링 DB select ~ 각각의 임시파일들 생성)
     *  0. 최초 작업 시작시 지국지사시스템 DB의 마이그레이션작업정보 TB에서 해당 지국지사코드의 빌링UP상태코드가 "작업중"이면 AppException 발생
     *  1.  마이그레이션작업정보 TB의 빌링UP상태코드가 "작업완료", "작업오류" 라면  "작업중"으로 update (단, 해당지국의 최초작업시는 신규행 추가)
     *  2. 마이그레이션작업정보 TB "작업중" 셋팅 (Update)
     *  3. 조선IS의 MS-SQL AutoGiro DB에서 테이블별 Select
     *  4. Select 된 테이블별 임시 파일 생성(기존파일존재하면 삭제) 후 write
     *  5. 위 항목들 정상 수행시만 commit;
     *  6. Exception 처리 : AppException, SysException 시 모두 rollback
     *  [Transaction1 끝]
     *
     *  [Transaction2 시작](각각의 임시파일 읽기 ~ Oracle CRUD)(파일별)
     *  5. (최초파일 read 전)마이그레이션작업이력 TB 신규 행 추가
     *  6. (각 파일 read 전)파일에 해당하는 임시테이블에서 기존자료 Delete
     *  7. (각 파일 read 전)각각의 파일당 마이그레이션작업내역 TB 에 하나의 신규 행 추가 ==>commit
     *  8. (각 파일 Line by Line)Read 후 Insert ==>addBatch
     *  9. (각 파일 마지막 line Read 후) batch 실행
     *  10.batch 실행 정상시 마이그레이션작업내역 TB 에  작업종료일자, 추출건수 update ==>commit
     *  11.batch 실행 오류시 (System Exception 발생할 경우)
     *                     마이그레이션작업내역TB의 (작업종료일자, 에러코드, 에러메세지) update ==>commit
     *  12.(마지막파일에 대한 batch 실행후)
     *        (정상시 - updateCounts 가 0보다 적은 경우)
     *               마이그레이션작업이력TB의 작업종료일자, 작업비고(2:작업완료) update
     *               마이그레이션작업정보TB의 빌링UP종료일자, 빌링UP상태코드(2:작업완료) update ==>commit
     *        (오류시)
     *               마이그레이션작업이력TB의 작업종료일자, 작업비고(3:작업오류) update
     *               마이그레이션작업정보TB의 빌링UP종료일자, 빌링UP상태코드(3:작업오류) update ==>commit
     *  13. (마무리작업) 임시폴더내 파일들 삭제
     *  14. Exception 처리 : SysException 시 rollback 후 12번 항목의 (오류시)
     *  [Transaction2 끝]
     *
     * %작업비고에 추가되는 로그는 자세한 기록을 원칙으로 한다.
     *
     * @param dm SS_A_MIG_BILLUPDM
     * @return SS_A_MIG_BILLUPDataSet
     * @throws AppException
     */
    public SS_A_MIG_BILLUPDataSet billUpload(SS_A_MIG_BILLUPDM dm) throws AppException {
        // PropertyManager를 통해 컬럼구분자, 라인구분자, 파일경로의 값을 읽어온다.

        PropertyManager pm = PropertyManager.getInstance();
        String col_delimiterStr = (String) pm.get("IS.COLUMN.DELIMITER");
        char col_delimiter = (char) Integer.parseInt(col_delimiterStr);
        final String COL_DELIMITER = new Character(col_delimiter).toString();

        String line_delimiterStr = (String) pm.get("IS.LINE.DELIMITER");
        char line_delimiter = (char) Integer.parseInt(line_delimiterStr);
        final String LINE_DELIMITER = new Character(line_delimiter).toString();
        final String FILE_PATH = (String) pm.get("IS.DIR");
       //constants

       //local variables
       String[][] columns      = null;   //마이그레이션 대상 테이블의 컬럼 정보
       SS_A_MIG_BILLUPDataSet ds = new SS_A_MIG_BILLUPDataSet();
       DBManager srcMgr        = new DBManager("MSSQL");
       DBManager destMgr       = new DBManager("Oracle");
       PreparedStatement pstmt = null;
       ResultSet rs            = null;
       ResultSetMetaData rsmd  = null;
       String strSql           = null;
       ArrayList al            = null;   //records
       String[] values         = null;   //record  : 사이즈는 쿼리된 컬럼갯수 + 1 (지국지사코드를 하나더 넣을 수 있어야함)
       int cnt                 = 0;      //insert,update,delete 반영 갯수
       boolean success         = false;  //성공여부
       File dir                = null;   //조선IS 빌링 DB 에서 select 한 정보를 담을 임시디렉토리
       File file               = null;   //조선IS 빌링 DB 에서 select 한 정보를 담을 임시파일
       String[] children       = null;   //임시디렉토리내 파일명 배열
       String tempFileName     = null;   //임시파일명
       BufferedReader in       = null;
       BufferedWriter out      = null;

       int i = 0; //outer for loop counter
       int j = 0; //inner for loop counter

       int[] updateCounts      = null;   //배치실행 후 각 command 수행시 반영된 row 수 의 배열
       String workno           = null;   //작업번호
       String dtlsworkno       = null;   //내역번호

       //지국지사DB 마이그레이션 작업정보 테이블에 "작업중(1)" 셋팅
       ds = setWorkState(destMgr, dm, ds, "1");

       //Transaction1(조선IS빌링 DB select ~ 각각의 임시파일들 생성) 시작
System.out.println("Transaction1 시작");
       try{
           //조선is DB에 연결
           srcMgr.getConnection();
           for(i=0; i<dm.tables.size(); i++){

               strSql = dm.getSelQry(i);
               tempFileName = FILE_PATH + dm.bocd + "_" + dm.tables.get(i) + ".tmp";

               //임시 디렉토리 및 파일 생성
               dir = new File(FILE_PATH);
               boolean exists = dir.exists();
               if (!exists) { // directory exists
                   dir.mkdirs(); //임시 디렉토리 생성 시도
               }

               file = new File(tempFileName);
               success = file.createNewFile();
               if (!success) { //파일이 이미 생성된 상태라면 삭제 후 재 생성
                   success = file.delete();
                   if("".equals(ds.errcode) && !success){
	                   ds.errcode = "[SSAdmin1100DAO.java-billUpload](1)";
	                   ds.errmsg = "[SSAdmin1100DAO.java-billUpload](1) 임시파일("+tempFileName+")을 삭제하지 못했습니다.";
                   }

                   success = file.createNewFile();
                   if("".equals(ds.errcode) && !success){
                   	   ds.errcode = "[SSAdmin1100DAO.java-billUpload](2)";
                       ds.errmsg = "[SSAdmin1100DAO.java-billUpload](2) 임시파일("+tempFileName+")을 생성하지 못했습니다.";
                   }
               }

               //조선IS DB에 접속후 billing data 조회
               pstmt = srcMgr.m_conn.prepareStatement(dm.getSelQry(i));
               dm.setSelQryParams(pstmt, dm, i);

               rs = pstmt.executeQuery();

               if (rs != null) {
                   rsmd = rs.getMetaData();
                   //al = new ArrayList();
                   while (rs.next()) {
                       values = new String[rsmd.getColumnCount() + 1]; //사이즈는 쿼리된 컬럼갯수 + 1 (지국지사코드를 하나더 넣을 수 있어야함)
                       for (j = 0; j < rsmd.getColumnCount(); j++) {
                           if (rs.getString(j + 1) != null) {
                               values[j] = Util.Uni2Ksc(rs.getString(j + 1)).trim() + COL_DELIMITER;
                           } else {
                               values[j] = "" + COL_DELIMITER;
                           }
                       }
                       values[j] = dm.bocd + LINE_DELIMITER + "\n"; //마지막 컬럼은 지국지사코드를 할당 ('\n'을 +하는 이유는 FileReader 의 readLine 메쏘드 활용하기 위함)

                       out = new BufferedWriter(new FileWriter(tempFileName, true));

                       for (int k = 0; k < values.length; k++) {
                           out.write(values[k]);
                       }
                       out.close();

                   }
                   rs.close();
               }
               pstmt.close();
           }
       }catch(IOException ioe){
       	   ioe.printStackTrace();
           ds.errcode = "[SSAdmin1100DAO.java-billUpload](3)";
           ds.errmsg = "[SSAdmin1100DAO.java-billUpload](3) 빌링업로드시 파일 관련 에러발생";
       }catch(SQLException sqle){
       	   sqle.printStackTrace();
           ds.errcode = "[SSAdmin1100DAO.java-billUpload](3)";
           ds.errmsg = "[SSAdmin1100DAO.java-billUpload](3) 빌링업로드시 DB 관련 에러발생";
       }catch(Exception e){
       	   e.printStackTrace();
           ds.errcode = "[SSAdmin1100DAO.java-billUpload](4)";
           ds.errmsg = "[SSAdmin1100DAO.java-billUpload](4) 빌링업로드시 알수 없는 에러발생";
       } finally {
           try { if (out != null)out.close();} catch (IOException ioe) {}
           try {if (rs != null)rs.close();} catch (SQLException se) {}
           try {if (pstmt != null)pstmt.close();} catch (SQLException se) {}
           srcMgr.disConnection();
       }

       //작업오류 정보 셋팅
       if(!"".equals(ds.errcode)){
           ds = setWorkState(destMgr, dm, ds, "3");
       }
       //Transaction1(조선IS빌링 DB select ~ 각각의 임시파일들 생성) 끝

       //Transaction2(각각의 임시파일 읽기 ~ Oracle CRUD) 시작
       try{
           i = 0;
System.out.println("Transaction2 시작");
           destMgr.getConnection();
           destMgr.setAutoCommit(false);

           for( i=0; i<dm.tables.size();i++){
               updateCounts = null;
               columns = (String[][])dm.columns.get(i);
               cnt = 0; //파일로 부터 읽어들인 라인수 카운트
               tempFileName = FILE_PATH + dm.bocd + "_" + dm.tables.get(i) + ".tmp";
               try{
                   //초기화 작업 시작
                   if(i==0){ //TACOM_MIGRWORKHIST 테이블에는 최초파일 처리시 한번만 신규행추가
                       //신규행추가를 위해 작업번호 채번
                       strSql = "SELECT LPAD(TO_CHAR(TO_NUMBER(NVL(MAX(WORKNO), '000')) + 1), 3, '0') FROM TACOM_MIGRWORKHIST WHERE BOCD = ? AND WORKCLSF = ? ";

                       pstmt = destMgr.m_conn.prepareStatement(strSql);
                       pstmt.setString(1, dm.bocd); //지국지사코드
                       pstmt.setString(2, dm.workclsf); //작업구분
                       rs = pstmt.executeQuery();
                       rs.next();
                       workno = rs.getString(1); //작업번호
                       rs.close();
                       //pstmt.close();

                       //마이그레이션작업이력TB에 신규행추가
                       strSql = "INSERT INTO TACOM_MIGRWORKHIST VALUES (?, ?, ?, SYSDATE, NULL, ?, ?) ";
                       pstmt = destMgr.m_conn.prepareStatement(strSql);
                       pstmt.setString(1, dm.bocd); //지국지사코드
                       pstmt.setString(2, dm.workclsf); //작업구분코드
                       pstmt.setString(3, workno); //작업번호
                       pstmt.setString(4, dm.incmgpers); //작업자 ID
                       pstmt.setString(5, "원본소스에서 해당정보를 읽어 임시파일이 정상적으로 생성되었습니다."); //작업비고에 현재 작업상태 셋팅
                       pstmt.executeUpdate();
                       pstmt.close();
                   }

                   //마이그레이션작업이력TB에 비고사항 기록
                   strSql = "UPDATE TACOM_MIGRWORKHIST SET WORKREMK = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? ";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, (i+1)+"번 테이블["+dm.tables.get(i)+"] migration을 시작합니다."); //작업비고
                   pstmt.setString(2, dm.bocd); //지국지사코드
                   pstmt.setString(3, dm.workclsf); //작업구분코드
                   pstmt.setString(4, workno); //작업번호
                   pstmt.executeUpdate();
                   pstmt.close();

                   //마이그레이션작업내역 TB  insert
                   //마이그레이션작업내역TB에 신규행추가를 위해 내역번호 채번
                   strSql = "SELECT LPAD(TO_CHAR(TO_NUMBER(NVL(MAX(DTLSWORKNO), '000')) + 1), 3, '0') FROM TACOM_MIGRWORKPTCR WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? ";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, dm.bocd); //지국지사코드
                   pstmt.setString(2, dm.workclsf); //작업구분
                   pstmt.setString(3, workno); //작업번호
                   rs = pstmt.executeQuery();
                   rs.next();
                   dtlsworkno = rs.getString(1); //내역번호
                   rs.close();
                   pstmt.close();

                   //마이그레이션작업내역TB에 신규행추가
                   strSql = "INSERT INTO TACOM_MIGRWORKPTCR VALUES (?, ?, ?, ?, ?, SYSDATE, NULL, ?, ?, ?, 0, NULL, NULL) ";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, dm.bocd); //지국지사코드
                   pstmt.setString(2, dm.workclsf); //작업구분코드
                   pstmt.setString(3, workno); //작업번호
                   pstmt.setString(4, dtlsworkno); //내역번호
                   pstmt.setString(5, ""); //작업설명
                   pstmt.setString(6, (String)dm.tables.get(i)); //소스테이블
                   pstmt.setString(7, "TEMP_" + (String)dm.tables.get(i)); //타깃테이블
                   pstmt.setString(8, "0"); //추출건수
                   pstmt.executeUpdate();
                   pstmt.close();


                   //해당지국의 기존 레코드들을 임시테이블에서 삭제
                   strSql = "DELETE CRMSAL_MIG.TEMP_" + (String) dm.tables.get(i) + " WHERE BOCD = ?";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, dm.bocd);
                   pstmt.executeUpdate();

                   destMgr.commit();
                   //초기화 작업 끝
               }catch(SQLException se){
                    se.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(se);
               }finally{
                   try {if(rs != null)rs.close();} catch (SQLException se) { se.printStackTrace();}
                   try {if(pstmt != null)pstmt.close();} catch (SQLException se) {se.printStackTrace();}
               }

               try {
                   in = new BufferedReader(new InputStreamReader(new FileInputStream(tempFileName), "KSC5601"));
                   String str = null;
                   ArrayList record = null;

                   j = 0;

                   while ((str = in.readLine()) != null) {
                       cnt++; //라인 카운트 + 1
                   }
                   in.close();

                   //prepared statement 생성
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   strSql = "UPDATE TACOM_MIGRWORKPTCR SET WORKTODT = SYSDATE, ABSTRNOIT = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? AND DTLSWORKNO = ?";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, String.valueOf(cnt));  // 추출건수
                   pstmt.setString(2, dm.bocd); //지국지사코드
                   pstmt.setString(3, dm.workclsf); //작업구분코드
                   pstmt.setString(4, workno); //작업번호
                   pstmt.setString(5, dtlsworkno); //내역번호
                   pstmt.executeUpdate(); //추출건수 업데이트
                   pstmt.close();

                   //(Line by Line)Read & Insert(read & insert 중 오류 작업정보, 이력, 내역 update) 다음 파일
                   strSql = "INSERT INTO  CRMSAL_MIG.TEMP_" + dm.tables.get(i) + "(";
                   if(columns != null){
                       for (int k = 0; k < columns.length; k++) {
                           strSql += columns[k][1];
                           strSql += (k + 1 == columns.length) ? ")" : ", ";
                       }
                       strSql += "VALUES( ";
                       //insert 쿼리 완성
                       if (dm.columns.get(i) != null) {
                           for (int k = 0; k < columns.length; k++) {
                               strSql += "?";
                               strSql += (k + 1 == columns.length) ? ")" : ", ";
                           }
                       }
                   }

                   in = new BufferedReader(new InputStreamReader(new FileInputStream(tempFileName), "KSC5601"));
                   str = null;
                   record = null;
                   cnt = 0; //파일로 부터 읽어들인 라인수 카운트
                   j = 0;

                   //prepared statement 생성
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   while ((str = in.readLine()) != null) {
                       record = parseRecords(str, COL_DELIMITER, LINE_DELIMITER);
                       //parameter 셋팅
                       if(record.size() > 0){
                           for (int k = 0; k < record.size(); k++) {
                               if(columns != null && "DATE".equalsIgnoreCase(columns[k][2])){
                                   SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                   java.util.Date dt = sf.parse((String) record.get(k), new ParsePosition(0));
                                   if(dt != null){
                                       Timestamp ts = new Timestamp(dt.getTime());
                                       pstmt.setTimestamp(k + 1, ts);
                                   }else{
                                       pstmt.setTimestamp(k + 1, null); //시간이 없으면
                                   }
                               }else{
                                   pstmt.setString(k + 1, (String) record.get(k));
                               }

                           }
                           //파일로 부터 파싱된 레코드가 존재 할 경우에만 배치에 추가
                           pstmt.addBatch();
                       }
                       cnt++; //라인 카운트 + 1
                   }

                   //배치실행
                   updateCounts = pstmt.executeBatch();
                   in.close();
                   pstmt.close();

                   //마이그레이션작업내역TB 의 종료일자, 전환건수 update
                   strSql = "UPDATE TACOM_MIGRWORKPTCR SET SWITNOIT = ?, WORKTODT = SYSDATE WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? AND DTLSWORKNO = ?";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, (updateCounts == null)? "0" : String.valueOf(updateCounts.length)); // 전환건수
                   pstmt.setString(2, dm.bocd); //지국지사코드
                   pstmt.setString(3, dm.workclsf); //작업구분코드
                   pstmt.setString(4, workno); //작업번호
                   pstmt.setString(5, dtlsworkno); //내역번호
                   pstmt.executeUpdate();
                   pstmt.close();

                   //마이그레이션작업이력TB의 비고사항 업데이트
                   strSql = "UPDATE TACOM_MIGRWORKHIST SET WORKREMK = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? ";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, (i+1)+"번 테이블["+dm.tables.get(i)+"] migration이 완료 되었습니다."); //작업비고
                   pstmt.setString(2, dm.bocd); //지국지사코드
                   pstmt.setString(3, dm.workclsf); //작업구분코드
                   pstmt.setString(4, workno); //작업번호
                   pstmt.executeUpdate();
                   pstmt.close();


                   if(i + 1 == dm.tables.size()){ //마지막 테이블일 경우
                       //마이그레이션작업이력TB의 작업종료일자, 작업비고(2:작업완료) update
                       strSql = "UPDATE TACOM_MIGRWORKHIST SET WORKTODT = SYSDATE, WORKREMK = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? ";
                       pstmt = destMgr.m_conn.prepareStatement(strSql);
                       pstmt.setString(1, "지국("+dm.bocd+")의 빌링 migration이 완료 되었습니다."); //작업비고
                       pstmt.setString(2, dm.bocd); //지국지사코드
                       pstmt.setString(3, dm.workclsf); //작업구분코드
                       pstmt.setString(4, workno); //작업번호
                       pstmt.executeUpdate();
                       pstmt.close();

                       //마이그레이션작업정보TB의 빌링DBUP종료일자, 빌링DBUP상태코드(2:작업완료) update
                       strSql = "UPDATE TACOM_MIGRWORKINFO SET BILLDBUPTODT = SYSDATE, BILLDBUPSTATCD = '2' WHERE BOCD = ? ";
                       pstmt = destMgr.m_conn.prepareStatement(strSql);
                       pstmt.setString(1, dm.bocd); //지국지사코드
                       pstmt.executeUpdate();
                       pstmt.close();
                   }

                   destMgr.commit();
               } catch (FileNotFoundException fnfe) {
                   fnfe.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(fnfe);
               } catch (IOException ioe) {
                   ioe.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(ioe);
               } catch (BatchUpdateException bue){
                   bue.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(bue);
               } catch (SQLException se) {
                   se.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(se);
               } catch (Exception e) {
                   e.printStackTrace();
                   destMgr.rollback();
                   throw new SysException(e);
               } finally {
                   try {if(in != null)in.close();} catch (IOException ioe) {}
                   try {if(rs != null)rs.close();} catch (SQLException se) {}
                   try {if(pstmt != null)pstmt.close();} catch (SQLException se) {}
               }
           }
       }catch(SysException se){
           se.printStackTrace();
           destMgr.rollback();
           try{
               //마이그레이션작업정보TB의 빌링DBUP종료일자, 빌링DBUP상태코드(3:작업오류) update
               strSql = "UPDATE TACOM_MIGRWORKINFO SET BILLDBUPTODT = SYSDATE, BILLDBUPSTATCD = '3' WHERE BOCD = ?";
               pstmt = destMgr.m_conn.prepareStatement(strSql);
               pstmt.setString(1, dm.bocd);
               pstmt.executeUpdate();
               pstmt.close();
               destMgr.commit();

               //마이그레이션작업내역TB 의 종료일자, 전환건수, 에러코드, 에러메세지 update
               if(workno != null && dtlsworkno != null){
                   strSql = "UPDATE TACOM_MIGRWORKPTCR SET WORKTODT = SYSDATE, SWITNOIT = ?, ERRCD = ?, ERRMSG = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ? AND DTLSWORKNO = ?";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);

                   pstmt.setString(1, "0");  // 전환건수 0 건(테이블당 하나의 트랜잭션이므로..)
                   //Batch실행 이외에 SQLException 일 경우
                   if ("java.sql.SQLException".equals(se.getException().getClass().getName())) {
                       pstmt.setString(2, String.valueOf( ( (SQLException) se.getException()).getErrorCode()));
                       pstmt.setString(3, String.valueOf( ( (SQLException) se.getException()).getMessage()));
                       //Batch실행 중 SQLException 일 경우
                   } else if ("java.sql.BatchUpdateException".equals(se.getException().getClass().getName())) {
                       updateCounts = ((BatchUpdateException) se.getException()).getUpdateCounts();
                       pstmt.setString(2, String.valueOf( ( (BatchUpdateException) se.getException()).getErrorCode()));
                       pstmt.setString(3, "\nBatch Line Number : "
                                          + String.valueOf( ( (BatchUpdateException) se.getException()).getUpdateCounts().length + 1)
                                          + "\n" + String.valueOf( ( (BatchUpdateException) se.getException()).getMessage()));
                   } else {
                       pstmt.setString(2, "");
                       pstmt.setString(3, se.getException().getClass().getName() + ":" + se.getException().getMessage());
                   }
                   pstmt.setString(4, dm.bocd); //지국지사코드
                   pstmt.setString(5, dm.workclsf); //작업구분코드
                   pstmt.setString(6, workno); //작업번호
                   pstmt.setString(7, dtlsworkno); //내역번호
                   pstmt.executeUpdate();
                   pstmt.close();
               }

               //마이그레이션작업이력TB의 작업종료일자, 작업비고(3:작업오류) update
               if(workno != null){
                   strSql = "UPDATE TACOM_MIGRWORKHIST SET WORKTODT = SYSDATE, WORKREMK = ? WHERE BOCD = ? AND WORKCLSF = ? AND WORKNO = ?";
                   pstmt = destMgr.m_conn.prepareStatement(strSql);
                   pstmt.setString(1, (i+1)+"번 테이블["+dm.tables.get(i)+"] migration중 오류"+cnt+" 번째 레코드 이후)가 발생 되었습니다."); //작업비고
                   pstmt.setString(2, dm.bocd);
                   pstmt.setString(3, dm.workclsf);
                   pstmt.setString(4, workno);
                   pstmt.executeUpdate();
                   pstmt.close();
               }
               destMgr.commit();
               ds.errcode = "[SSAdmin1100DAO.java-billUpload](3)";
               ds.errmsg = "[SSAdmin1100DAO.java-billUpload](3) 해당지국("+dm.bocd+")의 빌링 데이터 로딩중 오류가 발생하여 종료되었습니다. 자세항 사항은 관련 테이블을 확인하세요.";
               throw new AppException(ds.errcode, ds.errmsg);
           }catch(SQLException sqle){
               destMgr.rollback();
               throw new SysException(sqle);
           }
       }finally{
           destMgr.disConnection();
           /*
           for(int k=0; k<dm.tables.size(); k++){
               tempFileName = FILE_PATH + dm.bocd + "_" + dm.tables.get(k) + ".tmp";
               file = new File(tempFileName);
               if (file.exists()) {
                   file.delete(); //임시 파일 삭제 시도
               }
           }
           */
       }
       //Transaction2 끝
       return ds;
    }

    /**
     * 관리자-작업-마이그레이션-지국자료전환
     * @param dm SS_A_MIGRWORKINFODM
     * @return SS_A_MIGRWORKINFODataSet
     * @throws AppException
     */
    public SS_A_MIGRWORKINFODataSet boConvert(SS_A_MIGRWORKINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGRWORKINFODataSet ds = (SS_A_MIGRWORKINFODataSet) manager.executeCall(dm);
System.out.println("SSAdmin1100 : ds.errcode : "+ds.errcode+ " ds.errmsg : "+ds.errmsg);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-빌링자료전환
     * @param dm SS_A_MIGRWORKINFODM
     * @return SS_A_MIGRWORKINFODataSet
     * @throws AppException
     */
    public SS_A_MIGRWORKINFODataSet billConvert(SS_A_MIGRWORKINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGRWORKINFODataSet ds = (SS_A_MIGRWORKINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-지국DB업로드 작업이력
     * @param dm SS_L_MIGRWORKHISTDM
     * @return SS_L_MIGRWORKHISTDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKHISTDataSet selectBoUploadHstyList(SS_L_MIGRWORKHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKHISTDataSet ds = (SS_L_MIGRWORKHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-빌링DB업로드 작업이력
     * @param dm SS_L_MIGRWORKHISTDM
     * @return SS_L_MIGRWORKHISTDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKHISTDataSet selectBillUploadHstyList(SS_L_MIGRWORKHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKHISTDataSet ds = (SS_L_MIGRWORKHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-지국자료전환 작업이력
     * @param dm SS_L_MIGRWORKHISTDM
     * @return SS_L_MIGRWORKHISTDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKHISTDataSet selectBoConvertHstyList(SS_L_MIGRWORKHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKHISTDataSet ds = (SS_L_MIGRWORKHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-빌링자료전환 작업이력
     * @param dm SS_L_MIGRWORKHISTDM
     * @return SS_L_MIGRWORKHISTDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKHISTDataSet selectBillConvertHstyList(SS_L_MIGRWORKHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKHISTDataSet ds = (SS_L_MIGRWORKHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-지국DB업로드 작업내역
     * @param dm SS_L_MIGRWORKPTCRDM
     * @return SS_L_MIGRWORKPTCRDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKPTCRDataSet selectBoUploadPtcrList(SS_L_MIGRWORKPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-빌링DB업로드 작업내역
     * @param dm SS_L_MIGRWORKPTCRDM
     * @return SS_L_MIGRWORKPTCRDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKPTCRDataSet selectBillUploadPtcrList(SS_L_MIGRWORKPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-지국자료전환 작업내역
     * @param dm SS_L_MIGRWORKPTCRDM
     * @return SS_L_MIGRWORKPTCRDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKPTCRDataSet selectBoConvertPtcrList(SS_L_MIGRWORKPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션-빌링자료전환 작업내역
     * @param dm SS_L_MIGRWORKPTCRDM
     * @return SS_L_MIGRWORKPTCRDataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKPTCRDataSet selectBillConvertPtcrList(SS_L_MIGRWORKPTCRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션 현황-초기화면
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_NWBUSEOCDDataSet initMigInfo(SS_L_NWBUSEOCDDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션 현황-목록
     * @param dm SS_L_MIGRWORKINFODM
     * @return SS_L_MIGRWORKINFODataSet
     * @throws AppException
     */
    public SS_L_MIGRWORKINFODataSet selectMigInfoList(SS_L_MIGRWORKINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGRWORKINFODataSet ds = (SS_L_MIGRWORKINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-마이그레이션 현황-저장
     * @param dm SS_U_MIGRWORKINFODM
     * @return SS_U_MIGRWORKINFODataSet
     * @throws AppException
     */
    public SS_U_MIGRWORKINFODataSet updateMigInfo(SS_U_MIGRWORKINFODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_MIGRWORKINFODataSet ds = (SS_U_MIGRWORKINFODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
