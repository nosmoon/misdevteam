/***************************************************************************************************
* 파일명 : SSBrsup1800DAO.java
* 기능 : 지국지원-빌링-수납수수료를 위한 DAO
* 작성일자 : 2004-02-23
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.dm.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 지국지원-빌링-수납수수료를 위한 DAO
 */

public class SSBrsup1800DAO {

    /**
     * 지국지원-빌링-수납수수료-기준-초기화면
     * @param dm SS_L_RCPCMSBS_INITDM
     * @return SS_L_RCPCMSBS_INITDataSet
     * @throws AppException
     */
    public SS_L_RCPCMSBS_INITDataSet initRcpcmsbs(SS_L_RCPCMSBS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RCPCMSBS_INITDataSet ds = (SS_L_RCPCMSBS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-기준-목록
     * @param dm SS_L_RCPCMSBSDM
     * @return SS_L_RCPCMSBSDataSet
     * @throws AppException
     */
    public SS_L_RCPCMSBSDataSet selectRcpcmsbsList(SS_L_RCPCMSBSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RCPCMSBSDataSet ds = (SS_L_RCPCMSBSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-기준-상세
     * @param dm  SS_S_RCPCMSBSDM
     * @return  SS_S_RCPCMSBSDataSet
     * @throws AppException
     */
    public SS_S_RCPCMSBSDataSet selectRcpcmsbsDetail(SS_S_RCPCMSBSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RCPCMSBSDataSet ds = (SS_S_RCPCMSBSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-기준-등록
     * @param dm SS_A_RCPCMSBSDM
     * @return SS_A_RCPCMSBSDataSet
     * @throws AppException
     */
    public SS_A_RCPCMSBSDataSet insertRcpcmsbs(SS_A_RCPCMSBSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RCPCMSBSDataSet ds = (SS_A_RCPCMSBSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-기준-수정
     * @param dm SS_A_RCPCMSBSDM
     * @return SS_A_RCPCMSBSDataSet
     * @throws AppException
     */
    public SS_A_RCPCMSBSDataSet updateRcpcmsbs(SS_A_RCPCMSBSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RCPCMSBSDataSet ds = (SS_A_RCPCMSBSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-기준-삭제
     * @param dm SS_A_RCPCMSBSDM
     * @return SS_A_RCPCMSBSDataSet
     * @throws AppException
     */
    public SS_A_RCPCMSBSDataSet deleteRcpcmsbs(SS_A_RCPCMSBSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RCPCMSBSDataSet ds = (SS_A_RCPCMSBSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-마감-목록
     * @param dm SS_L_RECPCOMSCLOSDM
     * @return SS_L_RECPCOMSCLOSDataSet
     * @throws AppException
     */
    public SS_L_RECPCOMSCLOSDataSet selectCloseList(SS_L_RECPCOMSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RECPCOMSCLOSDataSet ds = (SS_L_RECPCOMSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-마감-상세
     * @param dm SS_S_RECPCOMSCLOSDM
     * @return SS_S_RECPCOMSCLOSDataSet
     * @throws AppException
     */
    public SS_S_RECPCOMSCLOSDataSet selectCloseDetail(SS_S_RECPCOMSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RECPCOMSCLOSDataSet ds = (SS_S_RECPCOMSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-마감-등록
     * @param dm SS_A_RECPCOMSCLOSDM
     * @return SS_A_RECPCOMSCLOSDataSet
     * @throws AppException
     */
    public SS_A_RECPCOMSCLOSDataSet insertClose(SS_A_RECPCOMSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RECPCOMSCLOSDataSet ds = (SS_A_RECPCOMSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-마감-수정
     * @param dm SS_A_RECPCOMSCLOSDM
     * @return SS_A_RECPCOMSCLOSDataSet
     * @throws AppException
     */
    public SS_A_RECPCOMSCLOSDataSet updateClose(SS_A_RECPCOMSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RECPCOMSCLOSDataSet ds = (SS_A_RECPCOMSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-마감-삭제
     * @param dm SS_A_RECPCOMSCLOSDM
     * @return SS_A_RECPCOMSCLOSDataSet
     * @throws AppException
     */
    public SS_A_RECPCOMSCLOSDataSet deleteClose(SS_A_RECPCOMSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RECPCOMSCLOSDataSet ds = (SS_A_RECPCOMSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-마감-마감
     * @param dm SS_A_RECPCOMSCLOS_CLOSEDM
     * @return SS_A_RECPCOMSCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RECPCOMSCLOS_CLOSEDataSet executeClose(SS_A_RECPCOMSCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RECPCOMSCLOS_CLOSEDataSet ds = (SS_A_RECPCOMSCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-마감-마감취소
     * @param dm SS_A_RECPCOMSCLOS_CLOSEDM
     * @return SS_A_RECPCOMSCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_RECPCOMSCLOS_CLOSEDataSet cancelClose(SS_A_RECPCOMSCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_RECPCOMSCLOS_CLOSEDataSet ds = (SS_A_RECPCOMSCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-현황-초기화면
     * @param dm SS_L_RCP_INITDM
     * @return SS_L_RCP_INITDataSet
     * @throws AppException
     */
    public SS_L_RCP_INITDataSet initRcp(SS_L_RCP_INITDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RCP_INITDataSet ds = (SS_L_RCP_INITDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-수납수수료-현황-목록
     * @param dm SS_L_RCPDM
     * @return SS_L_RCPDataSet
     * @throws AppException
     */
    public SS_L_RCPDataSet selectRcpList(SS_L_RCPDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RCPDataSet ds = (SS_L_RCPDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-지로수납현황-초기화면
     * @param dm SS_L_GIRORECP_INITDM
     * @return SS_L_GIRORECP_INITDataSet
     * @throws AppException
     */
    public SS_L_GIRORECP_INITDataSet selectGiroRecpInit(SS_L_GIRORECP_INITDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_GIRORECP_INITDataSet ds = (SS_L_GIRORECP_INITDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-지로수납현황-목록조회
     * @param dm SS_L_GIRORECP_LISTDM
     * @return SS_L_GIRORECP_LISTDataSet
     * @throws AppException
     */
    public SS_L_GIRORECP_LISTDataSet selectGiroRecpList(SS_L_GIRORECP_LISTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_GIRORECP_LISTDataSet ds = (SS_L_GIRORECP_LISTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-지로수납현황-목록엑셀저장
     * @param dm SS_L_GIRORECP_PRINTDM
     * @return SS_L_GIRORECP_PRINTDataSet
     * @throws AppException
     */
    public SS_L_GIRORECP_PRINTDataSet selectGiroRecpExcel(SS_L_GIRORECP_PRINTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_GIRORECP_PRINTDataSet ds = (SS_L_GIRORECP_PRINTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-지로수납현황-초기화면
     * @param dm SS_L_CVSRECP_INITDM
     * @return SS_L_CVSRECP_INITDataSet
     * @throws AppException
     */
    public SS_L_CVSRECP_INITDataSet selectCvsRecpInit(SS_L_CVSRECP_INITDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CVSRECP_INITDataSet ds = (SS_L_CVSRECP_INITDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-지로수납현황-목록조회
     * @param dm SS_L_CVSRECP_LISTDM
     * @return SS_L_CVSRECP_LISTDataSet
     * @throws AppException
     */
    public SS_L_CVSRECP_LISTDataSet selectCvsRecpList(SS_L_CVSRECP_LISTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CVSRECP_LISTDataSet ds = (SS_L_CVSRECP_LISTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 지국지원-빌링-편의점수납-엑셀저장
     * @param dm SS_L_CVSRECP_PRINTDM
     * @return SS_L_CVSRECP_PRINTDataSet
     * @throws AppException
     */
    public SS_L_CVSRECP_PRINTDataSet selectCvsRecpPrint(SS_L_CVSRECP_PRINTDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CVSRECP_PRINTDataSet ds = (SS_L_CVSRECP_PRINTDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
