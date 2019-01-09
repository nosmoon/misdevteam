/***************************************************************************************************
* 파일명 : SSAdmin1000DAO.java
* 기능 : 관리자-작업-등록을 위한 DAO
* 작성일자 : 2004-04-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dao;

import java.io.*;
import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 관리자-작업-등록을 위한 DAO
 */

public class SSAdmin1400DAO {
    /**
     * 관리자-작업-등록-초기화면
     * @param dm SS_L_WRK_INITDM
     * @return SS_L_WRK_INITDataSet
     * @throws AppException
     */
    public SS_L_WRK_INITDataSet initWrk(SS_L_WRK_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WRK_INITDataSet ds = (SS_L_WRK_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-등록-목록
     * @param dm SS_L_WRKDM
     * @return SS_L_WRKDataSet
     * @throws AppException
     */
    public SS_L_WRKDataSet selectWrkList(SS_L_WRKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WRKDataSet ds = (SS_L_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-등록-상세
     * @param dm SS_S_WRKDM
     * @return SS_S_WRKDataSet
     * @throws AppException
     */
    public SS_S_WRKDataSet selectWrkDetail(SS_S_WRKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_WRKDataSet ds = (SS_S_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-등록-등록
     * @param dm SS_A_WRKDM
     * @return SS_A_WRKDataSet
     * @throws AppException
     */
    public SS_A_WRKDataSet insertWrk(SS_A_WRKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_WRKDataSet ds = (SS_A_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-등록-수정
     * @param dm SS_A_WRKDM
     * @return SS_A_WRKDataSet
     * @throws AppException
     */
    public SS_A_WRKDataSet updateWrk(SS_A_WRKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_WRKDataSet ds = (SS_A_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-등록-삭제
     * @param dm SS_A_WRKDM
     * @return SS_A_WRKDataSet
     * @throws AppException
     */
    public SS_A_WRKDataSet deleteWrk(SS_A_WRKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_WRKDataSet ds = (SS_A_WRKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-등록-수동실행
     * @param id 작업아이디
     * @param incmgpers 작업자
     * @throws AppException
     */
    public void runWrk(String id, String incmgpers) throws AppException {
        // 작업아이디 체크
        if (id == null || id.length() == 0) {
            throw new AppException("[SSAdmin1400DAO.runWrk()]", "작업아이디가 존재하지 않습니다.");
        }
        // 작업자 체크
        if (incmgpers == null || incmgpers.length() == 0) {
            throw new AppException("[SSAdmin1400DAO.runWrk()]", "작업자가 존재하지 않습니다.");
        }
        // 작업 디렉토리 및 실행 스크립트
        String cmdPath = null;
        String cmd = null;

        // 작업ID에 따라 실행파일을 설정한다.
        if("00010".equals(id.trim())){          // MIS 업로드
            // MIS_EXEC 실행
            cmdPath = "ksh /misdata/bin/";
            cmd = "MIS_EXEC " + incmgpers;
        }else if("00020".equals(id.trim())){    // 조선IS 전단 업로드
            // ISLEAF_EXEC.sh 실행
            cmdPath = "ksh /isleaf/";
            cmd = "ISLEAF_EXEC " + incmgpers;
        }else if("00050".equals(id.trim())){    // 독자회원인증
            // PRIENTRMEMB_EXEC.sh 실행
            cmdPath = "ksh /batch/";
            cmd = "PRIENTRMEMB_EXEC " + incmgpers;
        }else if ("00100".equals(id.trim())) { // 지로청구(CD-ATM)송신
            // GIRO_EXEC.sh 실행
            cmdPath = "ksh /batch/";
            cmd = "GIRO_EXEC " + incmgpers;
        }else if ("00180".equals(id.trim())) { // 자동이체적용
            // SHFTAPLY_EXEC.sh 실행
            cmdPath = "ksh /batch/";
            cmd = "SHFTAPLY_EXEC " + incmgpers;
        }else if ("00200".equals(id.trim())) { // 출판지사실적마감
            // BODDRSLTINFO_EXEC.sh 실행
            cmdPath = "ksh /batch/";
            cmd = "BODDRSLTINFO_EXEC " + incmgpers;
        }else{
            throw new AppException("[SSAdmin1400DAO.runWrk()]", "실행한 작업은 수동실행할 수 없습니다.");
        }

        try{
            Runtime r = Runtime.getRuntime();
            Process proc = r.exec(cmdPath+cmd);
// 디버깅 코드 시작
            InputStream stdin = proc.getInputStream();
            InputStreamReader isr = new InputStreamReader(stdin);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            System.out.println("<OUTPUT>");
            while ( (line = br.readLine()) != null)
                System.out.println(line);
            System.out.println("</OUTPUT>");
            int exitVal = proc.waitFor();
            System.out.println("Process exitValue: " + exitVal);
// 디버깅 코드 끝
        }catch(Exception e){
            e.printStackTrace();
            throw new AppException("SSAdmin1400DAO.runWrk()", id+"_EXEC 스크립트 실행시 에러가 발생했습니다.");
        }
    }

    /**
     * 관리자-작업이력-초기화면
     * @param dm SS_L_WRKHIST_INITDM
     * @return SS_L_WRKHIST_INITDataSet
     * @throws AppException
     */
    public SS_L_WRKHIST_INITDataSet initWrkHist(SS_L_WRKHIST_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WRKHIST_INITDataSet ds = (SS_L_WRKHIST_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-이력-목록(이력)
     * @param dm SS_L_WRKHISTDM
     * @return SS_L_WRKHISTDataSet
     * @throws AppException
     */
    public SS_L_WRKHISTDataSet selectWrkHstyList(SS_L_WRKHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WRKHISTDataSet ds = (SS_L_WRKHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-작업-이력-목록(내역)
     * @param dm SS_L_WRKDTLDM
     * @return SS_L_WRKDTLDataSet
     * @throws AppException
     */
    public SS_L_WRKDTLDataSet selectWrkPtcrList(SS_L_WRKDTLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_WRKDTLDataSet ds = (SS_L_WRKDTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
