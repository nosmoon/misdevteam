/***************************************************************************************************
 * 파일명 : PSShare1201AO.java
 * 기능 : 정보공유 게시판 공지사항 처리를 위한 DAO
 * 작성일자 : 2004-02-20
 * 작성자 : 전현표
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ps.pbs.share.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

import java.sql.*;
import java.io.*;

import oracle.jdbc.driver.*;
import oracle.sql.*;
import oracle.jdbc.*;

import weblogic.jdbc.vendor.oracle.*;

/**
 * 정보공유-게시판 공지사항 위한 DAO
 */
public class PSShare1801DAO {

    /**
     * 정보공유 게시판 공지사항 리스트 조회
     * @param PS_L_INFOEXG_INITDM 객체
     * @return PS_L_INFOEXG_INITDataSet 객체
     * @author CRM 출판국팀
     */

    public PS_L_INFOEXG_INITDataSet selectInitList(PS_L_INFOEXG_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_INFOEXG_INITDataSet ds = (PS_L_INFOEXG_INITDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 정보공유 게시판 공지사항 리스트 조회
     * @param PS_L_INFOEXG_SRCHDM 객체
     * @return PS_L_INFOEXG_SRCHDataSet 객체
     * @author CRM 출판국팀
     */
/*
    public PS_L_INFOEXG_SRCHDataSet selectSrchList(PS_L_INFOEXG_SRCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_INFOEXG_SRCHDataSet ds = (PS_L_INFOEXG_SRCHDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
*/
    /**
     * 정보공유 게시판 공지사항 등록
     * @param PS_I_INFOEXGDM
     * @return boolean
     * @author CRM 출판국팀
     */
/*
    public boolean insertInfoexg(PS_I_INFOEXGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        manager.getConnection();
        try {
            manager.m_conn.setAutoCommit(false);
        } catch (SQLException ex) {}

        PS_I_INFOEXGDataSet ds = (PS_I_INFOEXGDataSet) manager.executeCall(dm, false);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {

            long seq = ds.getSeq();

            String filenm = dm.getFilenm();
            String filepath = dm.getFilepath();

            if (filenm == null) {
                return true;
            } else {

                File fileup = null;
                FileInputStream in = null;
                OutputStream outstream = null;

                ResultSet rset = null;
                Statement stmt = null;
                OracleThinBlob blob = null;

                try {

                    String query = "SELECT filecont FROM TACOM_INFOEXG WHERE seq='" + seq + "' FOR UPDATE";

                    stmt = manager.m_conn.createStatement();
                    rset = stmt.executeQuery(query);

                    if (rset.next()) {

                        blob = (OracleThinBlob) rset.getBlob(1);

                        fileup = new File(filepath);
                        in = new FileInputStream(fileup);
                        outstream = blob.getBinaryOutputStream();

                        byte[] buffer = new byte[10 * 1024];
                        int nread = 0;

                        while ( (nread = in.read(buffer)) != -1)
                            outstream.write(buffer, 0, nread);

                        //inputStream.close();
                        outstream.close();
                        in.close();
                    }
                } catch (FileNotFoundException ex1) {
                    throw new SysException(ex1);
                } catch (SQLException ex2) {
                    throw new SysException(ex2);
                } catch (IOException ex3) {
                    throw new SysException(ex3);
                } catch (Exception ex4) {
                    throw new SysException(ex4);
                } finally {
                    try {
                        outstream.close(); } catch (IOException ex5) {}
                    try {
                        in.close(); } catch (IOException ex6) {}
                    try {
                        stmt.close(); } catch (SQLException sql1) {}
                    try {
                        rset.close(); } catch (SQLException sql2) {}
                    manager.disConnection();
                }
            }
            return true;

        }
    }
*/
    /**
     * 정보공유 게시판 공지사항 수정
     * @param PS_U_INFOEXGDM
     * @return boolean
     * @author CRM 출판국팀
     */
/*
    public boolean updateInfoexg(PS_U_INFOEXGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        manager.getConnection();
        try {
            manager.m_conn.setAutoCommit(false);
        } catch (SQLException ex) {
            System.out.println("ex1 : " + ex);
        }
        PS_U_INFOEXGDataSet ds = (PS_U_INFOEXGDataSet) manager.executeCall(dm, false);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {

            long seq = dm.getSeq();

            String filenm = dm.getFilenm();
            String filepath = dm.getFilepath();

            if (filenm == null) {
                return true;
            } else {
                File fileup = null;
                FileInputStream in = null;
                OutputStream outstream = null;
                ResultSet rset = null;
                Statement stmt = null;
                OracleThinBlob blob = null;

                try {
                    String query = "SELECT filecont FROM TACOM_INFOEXG WHERE seq='" + seq + "' FOR UPDATE";
                    stmt = manager.m_conn.createStatement();
                    rset = stmt.executeQuery(query);

                    if (rset.next()) {

                        blob = (OracleThinBlob) rset.getBlob(1);

                        fileup = new File(filepath);
                        in = new FileInputStream(fileup);
                        outstream = blob.getBinaryOutputStream();

                        byte[] buffer = new byte[10 * 1024];
                        int nread = 0;

                        while ( (nread = in.read(buffer)) != -1)
                            outstream.write(buffer, 0, nread);
                    }
                } catch (FileNotFoundException ex1) {
                    throw new SysException(ex1);
                } catch (SQLException ex2) {
                    throw new SysException(ex2);
                } catch (IOException ex3) {
                    throw new SysException(ex3);
                } catch (Exception ex4) {
                    throw new SysException(ex4);
                } finally {
                    try {
                        outstream.close(); } catch (IOException ex5) {}
                    try {
                        in.close(); } catch (IOException ex6) {}
                    try {
                        stmt.close(); } catch (SQLException sql1) {}
                    try {
                        rset.close(); } catch (SQLException sql2) {}
                    manager.disConnection();
                }
            }
            return true;
        }
    }
*/
    /**
     * 정보공유 게시판 공지사항 삭제
     * @param PS_D_INFOEXGDM
     * @return boolean
     * @author CRM 출판국팀
     */
/*
    public boolean deleteInfoexg(PS_D_INFOEXGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_D_INFOEXGDataSet ds = (PS_D_INFOEXGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }
*/
    /**
     * 정보공유 게시판 공지사항 상세정보 조회
     * @param PS_S_INFOEXGDM
     * @return PS_S_INFOEXGDataSet
     * @author CRM 출판국팀
     */

    public PS_S_INFOEXGDataSet selectInfoexgDetail(PS_S_INFOEXGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_INFOEXGDataSet ds = (PS_S_INFOEXGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 정보공유 게시판 공지사항 다운로드
     * @param PS_S_INFOEXG_DWLOADDM
     * @return PS_S_INFOEXG_DWLOADDataSet
     * @author CRM 출판국팀
     */

    public PS_S_INFOEXG_DWLOADDataSet dwloadInfoexg(PS_S_INFOEXG_DWLOADDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_INFOEXG_DWLOADDataSet ds = (PS_S_INFOEXG_DWLOADDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 정보공유 게시판 공지사항 추천
     * @param PS_U_INFOEXGDM
     * @return boolean
     * @author CRM 출판국팀
     */
/*
    public boolean recomInfoexg(PS_U_INFOEXG_RECOMDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_INFOEXG_RECOMDataSet ds = (PS_U_INFOEXG_RECOMDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        } else {
            return true;
        }
    }
*/
    /**
     * 출판 - 콤보박스
     * @param dm PS_S_SEPBKDM 객체
     * @return ds PS_S_SEPBKDataSet 객체
     * @throws AppException
     * @throws RemoteException
     */
    public PS_S_SEPBKDataSet selectCombo(PS_S_SEPBKDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_SEPBKDataSet ds = (PS_S_SEPBKDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}