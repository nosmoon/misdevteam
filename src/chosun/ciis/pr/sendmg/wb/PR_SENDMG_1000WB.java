package chosun.ciis.pr.sendmg.wb;

import java.net.URL;

import java.net.URLConnection;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import sun.net.ftp.FtpClient;
//import org.apache.commons.net.ftp.*;

import java.io.FileOutputStream;
//import java.lang.StringBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;
//import chosun.ciis.co.base.util.FtpUtil;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.pr.sendmg.dao.PR_SENDMG_1000DAO;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.PR_SENDMG_1039_LCURLISTRecord;
 
public class PR_SENDMG_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 발송정보 조회
     */
	public void pr_sendmg_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager		= new DBManager("MISMAT");
		PR_SENDMG_1000_LDataSet ds = null;
		
		PR_SENDMG_1000_LDM dm = new PR_SENDMG_1000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_SENDMG_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/**
     * 발송정보를 구성하는 광고면수정보 조회
     */
	public void pr_sendmg_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager		= new DBManager("MISMAT");
		PR_SENDMG_1001_LDataSet ds = null;
		
		PR_SENDMG_1001_LDM dm = new PR_SENDMG_1001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_yymm = Util.checkString(req.getParameter("issu_yymm"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.print();

		ds = (PR_SENDMG_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/**
     * 발송정보 조회
     */
	public void pr_sendmg_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager		= new DBManager("MISMAT");
		PR_SENDMG_1002_LDataSet ds = null;
		
		PR_SENDMG_1002_LDM dm = new PR_SENDMG_1002_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_SENDMG_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_sendmg_1010_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager		= new DBManager("MISMAT");
		PR_SENDMG_1010_ADataSet ds = null;
		
		PR_SENDMG_1010_ADM dm = new PR_SENDMG_1010_ADM();
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
		String[] converted2      = convertMultiUpdateData(multiUpdateData2);
		
		//for (int i=0; i<converted2.length; i++){
		//	System.out.println("converted2[" + i + "]=" + converted2[i] );
		//}
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.medi_cd = Util.checkString(req.getParameter("send_medi_cd"));
		String medi_cd			= "";
		String fac_clsf_1     	= "";
		String ecnt          	= "";
		String prt_bgn_tm       = "";
		String prt_end_tm       = "";
		String off_plat_tm     	= "";
		
		String fac_clsf_2		= "";
		String chrg_pers		= "";
		String fst_route		= "";
		String fst_route_tm		= "";
		String last_route		= "";
		String last_route_tm	= "";
		//System.out.println(converted2.length);
		for (int i=4; i<converted2.length-4; i+=5){
			if (i > 4 && i<10){
				//medi_cd		= Util.checkString(req.getParameter("send_medi_cd"));
				if (!converted2[3].equals("")){
					fac_clsf_1 	= converted2[3];
					off_plat_tm	= converted2[5];
					prt_bgn_tm  = converted2[6];
					prt_end_tm  = converted2[7];
					ecnt       	= converted2[8];
				}
			} else if (i > 10 && i<15){
				if (!converted2[3].equals("")){
					fac_clsf_1 	= fac_clsf_1 + COL_SEPARATOR + converted2[3];
					off_plat_tm	= off_plat_tm + COL_SEPARATOR + converted2[10];
					prt_bgn_tm  = prt_bgn_tm + COL_SEPARATOR + converted2[11];
					prt_end_tm  = prt_end_tm + COL_SEPARATOR + converted2[12];
					ecnt       	= ecnt + COL_SEPARATOR + converted2[13];
				}
			} else if (i > 15 && i<20){
				if (!converted2[3].equals("")){
					fac_clsf_1 	= fac_clsf_1 + COL_SEPARATOR + converted2[3];
					off_plat_tm	= off_plat_tm + COL_SEPARATOR + converted2[15];
					prt_bgn_tm  = prt_bgn_tm + COL_SEPARATOR + converted2[16];
					prt_end_tm  = prt_end_tm + COL_SEPARATOR + converted2[17];
					ecnt       	= ecnt + COL_SEPARATOR + converted2[18];
				}
			} else if (i > 20 && i<25){
				if (!converted2[3].equals("")){
					fac_clsf_1 	= fac_clsf_1 + COL_SEPARATOR + converted2[3];
					off_plat_tm	= off_plat_tm + COL_SEPARATOR + converted2[20];
					prt_bgn_tm  = prt_bgn_tm + COL_SEPARATOR + converted2[21];
					prt_end_tm  = prt_end_tm + COL_SEPARATOR + converted2[22];
					ecnt       	= ecnt + COL_SEPARATOR + converted2[23];
				}
			} else if (i > 25 && i<30){
				if (!converted2[3].equals("")){
					fac_clsf_1 	= fac_clsf_1 + COL_SEPARATOR + converted2[3];
					off_plat_tm	= off_plat_tm + COL_SEPARATOR + converted2[25];
					prt_bgn_tm  = prt_bgn_tm + COL_SEPARATOR + converted2[26];
					prt_end_tm  = prt_end_tm + COL_SEPARATOR + converted2[27];
					ecnt       	= ecnt + COL_SEPARATOR + converted2[28];
				}
			} else if (i > 30 && i<35){
				if (!converted2[3].equals("")){
					fac_clsf_1 	= fac_clsf_1 + COL_SEPARATOR + converted2[3];
					off_plat_tm	= off_plat_tm + COL_SEPARATOR + converted2[30];
					prt_bgn_tm  = prt_bgn_tm + COL_SEPARATOR + converted2[31];
					prt_end_tm  = prt_end_tm + COL_SEPARATOR + converted2[32];
					ecnt       	= ecnt + COL_SEPARATOR + converted2[33];
				}
			}
		}
		fac_clsf_2				= converted2[3];
		chrg_pers				= converted2[4];
		fst_route				= converted2[converted2.length - 4];
		fst_route_tm			= converted2[converted2.length - 3];
		last_route				= converted2[converted2.length - 2];
		last_route_tm			= converted2[converted2.length - 1];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.make_pers = Util.checkString(req.getParameter("make_pers"));
		dm.weth = Util.checkString(req.getParameter("weth"));
		dm.ser_no = Util.checkString(req.getParameter("ser_no"));
		dm.side1_atic = Util.checkString(req.getParameter("side1_atic"));
		dm.rept_matt = Util.checkString(req.getParameter("rept_matt"));
		dm.rept_matt = dm.rept_matt.replaceAll("<", "&lt;");
		dm.rept_matt = dm.rept_matt.replaceAll(">", "&gt;");
		dm.fac_clsf_1 = fac_clsf_1;
		dm.ecnt = ecnt;
		dm.prt_bgn_tm = prt_bgn_tm;
		dm.prt_end_tm = prt_end_tm;
		dm.fac_clsf_2 = fac_clsf_2;
		dm.chrg_pers = chrg_pers;
		dm.fst_route = fst_route;
		dm.fst_route_tm = fst_route_tm;
		dm.last_route = last_route;
		dm.last_route_tm = last_route_tm;
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_SENDMG_1010_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_sendmg_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager		= new DBManager("MISMAT");
		PR_SENDMG_1020_LDataSet ds = null;
		
		PR_SENDMG_1020_LDM dm = new PR_SENDMG_1020_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.print();

		ds = (PR_SENDMG_1020_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_sendmg_1021_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager		= new DBManager("MISMAT");
		PR_SENDMG_1021_LDataSet ds = null;
		
		PR_SENDMG_1021_LDM dm = new PR_SENDMG_1021_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.print();

		ds = (PR_SENDMG_1021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_sendmg_1030_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager		= new DBManager("MISMAT");
		PR_SENDMG_1030_ADataSet ds = null;
		
		PR_SENDMG_1030_ADM dm = new PR_SENDMG_1030_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted      = convertMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		
		String gubun 	        = converted[0];
		String medi_cd          = converted[12];
		String issu_dt          = converted[11];
		String fac_clsf         = converted[3];
		String excp_qty         = converted[13];
		
		dm.setGubun(gubun);
		dm.setMedi_cd(medi_cd);
		dm.setIssu_dt(issu_dt);
		dm.setFac_clsf(fac_clsf);
		dm.setExcp_qty(excp_qty);
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (PR_SENDMG_1030_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void pr_sendmg_1039_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISBS");
		PR_SENDMG_1039_LDataSet ds = null;
		
		PR_SENDMG_1039_LDM dm = new PR_SENDMG_1039_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pr_dt = Util.checkString(req.getParameter("pr_dt"));
		dm.print();

//		String tempSeq		= "";
//      String stroccr_dt	= "";
//      String strseq		= "";
        ResultSet rs		= null;
        Statement stmt		= null;
        
        ds = new PR_SENDMG_1039_LDataSet();
		
        try {        	
            manager.getConnection();
            
            // 발송데이터 구하기
           	stmt = manager.m_conn.createStatement();
           
           	String sql =	" SELECT cprdate " +
               		", cdmedia " +
               		", cpansu " + 
               		", cdcntry " + 
               		", iseqno " + 
               		", ifdno " +
               		", cnmedia " + 
               		", cncntry " + 
               		", iprpage " + 
               		", cprout " + 
               		", cprfin " +
               		", lhdbusu " +
               		", laddbusu " +
               		", lprbusu " +
               		", lbabusu " +
               		", laddo " +
               		", lmins " +
               		", cdfact " +
               		", ctrans " +
               		", inpause " +
               		", crpause " +
               		", inabn " +
               		", crabn " +
               		", cpabn " +
               		", idanres1 " +
               		", ijungres1 " +
               		", idanres2 " +
               		", ijungres2 " +
               		", cdummy " +
               		"  FROM PRESULT " +
	               	" WHERE cprdate     = '" + dm.getPr_dt() + "' " +
	               	" ORDER BY cdmedia, cpansu, cdcntry ";

               	//System.out.println(sql);
            rs = (ResultSet)stmt.executeQuery(sql);
            
            //System.out.println("loop START!!");
            while(rs.next()) {
            	PR_SENDMG_1039_LCURLISTRecord rec = new PR_SENDMG_1039_LCURLISTRecord();
            	
            	rec.cprdate		= Util.checkString(rs.getString("cprdate"));
            	rec.cdmedia		= Util.checkString(rs.getString("cdmedia"));
            	rec.cpansu		= Util.checkString(rs.getString("cpansu"));
            	rec.cdcntry		= Util.checkString(rs.getString("cdcntry"));
            	rec.iseqno		= Util.checkString(rs.getString("iseqno"));
            	rec.ifdno		= Util.checkString(rs.getString("ifdno"));
            	rec.cnmedia		= Util.checkString(rs.getString("cnmedia"));
            	rec.cncntry		= Util.checkString(rs.getString("cncntry"));
            	rec.iprpage		= Util.checkString(rs.getString("iprpage"));
            	rec.cprout		= Util.checkString(rs.getString("cprout"));
            	rec.cprfin		= Util.checkString(rs.getString("cprfin"));
            	rec.lhdbusu		= Util.checkString(rs.getString("lhdbusu"));
            	rec.laddbusu	= Util.checkString(rs.getString("laddbusu"));
            	rec.lprbusu		= Util.checkString(rs.getString("lprbusu"));
            	rec.lbabusu		= Util.checkString(rs.getString("lbabusu"));
            	rec.laddo		= Util.checkString(rs.getString("laddo"));
            	rec.lmins		= Util.checkString(rs.getString("lmins"));
            	rec.cdfact		= Util.checkString(rs.getString("cdfact"));
            	rec.ctrans		= Util.checkString(rs.getString("ctrans"));
            	rec.inpause		= Util.checkString(rs.getString("inpause"));
            	rec.crpause		= Util.checkString(rs.getString("crpause"));
            	rec.inabn		= Util.checkString(rs.getString("inabn"));
            	rec.crabn		= Util.checkString(rs.getString("crabn"));
            	rec.cpabn		= Util.checkString(rs.getString("cpabn"));
            	rec.idanres1	= Util.checkString(rs.getString("idanres1"));
            	rec.ijungres1	= Util.checkString(rs.getString("ijungres1"));
            	rec.idanres2	= Util.checkString(rs.getString("idanres2"));
            	rec.ijungres2	= Util.checkString(rs.getString("ijungres2"));
            	rec.cdummy		= Util.checkString(rs.getString("cdummy"));
           		ds.curlist.add(rec);
            }
            //System.out.println("loop end!!");
            
            rs.close();
           	stmt.close();
            manager.disConnection();
            
        } catch (Exception e) {
        	e.printStackTrace();
        	try{
        		if (rs != null){
        			rs.close();
        		}
        		if (stmt!= null){
        			stmt.close();
        		}
        		if (manager.m_conn != null){
     		   		manager.m_conn.close();
        		}
     	   	}catch(SQLException se){
     	   		throw new SysException(se);
     	   	}
     	   	manager.disConnection();
     	   	throw new SysException(e);
        }
        
        req.setAttribute("ds", ds);
	}
	
	public void pr_sendmg_1040_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		//DBManager manager		= new DBManager("MISMAT");
		PR_SENDMG_1039_LDataSet ds = null;
		PR_SENDMG_1040_ADataSet ds2 = null;
		
		PR_SENDMG_1039_LDM dm = new PR_SENDMG_1039_LDM();
		PR_SENDMG_1040_ADM dm2 = new PR_SENDMG_1040_ADM();
		
		String tmp_cprdate	= "";
        String tmp_cdmedia	= "";
        String tmp_cpansu	= "";
        String tmp_cdcntry	= "";
        String tmp_iseqno	= "";
        String tmp_ifdno	= "";
        String tmp_cnmedia	= "";
        String tmp_cncntry	= "";
        String tmp_iprpage	= "";
        String tmp_cprout	= "";
        String tmp_cprfin	= "";
        String tmp_lhdbusu	= "";
        String tmp_laddbusu	= "";
        String tmp_lprbusu	= "";
        String tmp_lbabusu	= "";
        String tmp_laddo	= "";
        String tmp_lmins	= "";
        String tmp_cdfact	= "";
        String tmp_ctrans	= "";
        String tmp_inpause	= "";
        String tmp_crpause	= "";
        String tmp_inabn	= "";
        String tmp_crabn	= "";
        String tmp_cpabn	= "";
        String tmp_idanres1	= "";
        String tmp_ijungres1	= "";
        String tmp_idanres2		= "";
        String tmp_ijungres2	= "";
        String tmp_cdummy		= "";
        
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pr_dt = Util.checkString(req.getParameter("pr_dt"));
		dm.print();

		try {
			PR_SENDMG_1000DAO dao = new PR_SENDMG_1000DAO();
			ds = dao.pr_sendmg_1039_l(dm);
			
			//PR_SENDMG_1000EJBHome home = (PR_SENDMG_1000EJBHome)JNDIManager.getInstance().getHome("PR_SENDMG_1000EJB");
			//PR_SENDMG_1000EJB ejb = home.create();

			//ds = ejb.pr_sendmg_1039_l(dm);
			
			System.out.println("ds.curlist.size()=" + ds.curlist.size());
			
			if (ds.curlist.size() == 0) {
				System.out.println("발송정보가 없습니다.");
				ds2 = new PR_SENDMG_1040_ADataSet();
				ds2.errcode = "100";
				ds2.errmsg	= "발송정보가 없습니다.";
			} else {
				for(int i = 0; i < ds.curlist.size(); i++) {
					PR_SENDMG_1039_LCURLISTRecord rec = (PR_SENDMG_1039_LCURLISTRecord)ds.curlist.get(i);
					if (tmp_cprdate.equals("")){
						tmp_cprdate		= rec.cprdate;
						tmp_cdmedia		= rec.cdmedia;
						tmp_cpansu		= rec.cpansu;
						tmp_cdcntry		= rec.cdcntry;
						tmp_iseqno		= rec.iseqno;
						tmp_ifdno		= rec.ifdno;
						tmp_cnmedia		= rec.cnmedia;
						tmp_cncntry		= rec.cncntry;
						tmp_iprpage		= rec.iprpage;
						tmp_cprout		= rec.cprout;
						tmp_cprfin		= rec.cprfin;
						tmp_lhdbusu		= rec.lhdbusu;
						tmp_laddbusu	= rec.laddbusu;
						tmp_lprbusu		= rec.lprbusu;
						tmp_lbabusu		= rec.lbabusu;
						tmp_laddo		= rec.laddo;
						tmp_lmins		= rec.lmins;
						tmp_cdfact		= rec.cdfact;
						tmp_ctrans		= rec.ctrans;
						tmp_inpause		= rec.inpause;
						tmp_crpause		= rec.crpause;
						tmp_inabn		= rec.inabn;
						tmp_crabn		= rec.crabn;
						tmp_cpabn		= rec.cpabn;
						tmp_idanres1	= rec.idanres1;
						tmp_ijungres1	= rec.ijungres1;
						tmp_idanres2	= rec.idanres2;
						tmp_ijungres2	= rec.ijungres2;
						tmp_cdummy		= rec.cdummy;
					} else {
						tmp_cprdate		+= "#" + rec.cprdate;
						tmp_cdmedia		+= "#" + rec.cdmedia;
						tmp_cpansu		+= "#" + rec.cpansu;
						tmp_cdcntry		+= "#" + rec.cdcntry;
						tmp_iseqno		+= "#" + rec.iseqno;
						tmp_ifdno		+= "#" + rec.ifdno;
						tmp_cnmedia		+= "#" + rec.cnmedia;
						tmp_cncntry		+= "#" + rec.cncntry;
						tmp_iprpage		+= "#" + rec.iprpage;
						tmp_cprout		+= "#" + rec.cprout;
						tmp_cprfin		+= "#" + rec.cprfin;
						tmp_lhdbusu		+= "#" + rec.lhdbusu;
						tmp_laddbusu	+= "#" + rec.laddbusu;
						tmp_lprbusu		+= "#" + rec.lprbusu;
						tmp_lbabusu		+= "#" + rec.lbabusu;
						tmp_laddo		+= "#" + rec.laddo;
						tmp_lmins		+= "#" + rec.lmins;
						tmp_cdfact		+= "#" + rec.cdfact;
						tmp_ctrans		+= "#" + rec.ctrans;
						tmp_inpause		+= "#" + rec.inpause;
						tmp_crpause		+= "#" + rec.crpause;
						tmp_inabn		+= "#" + rec.inabn;
						tmp_crabn		+= "#" + rec.crabn;
						tmp_cpabn		+= "#" + rec.cpabn;
						tmp_idanres1	+= "#" + rec.idanres1;
						tmp_ijungres1	+= "#" + rec.ijungres1;
						tmp_idanres2	+= "#" + rec.idanres2;
						tmp_ijungres2	+= "#" + rec.ijungres2;
						tmp_cdummy		+= "#" + rec.cdummy;
					}
				}
				
				dm2.cmpy_cd 			= Util.getSessionParameterValue(req,"cmpycd",true);
				dm2.issu_dt				= tmp_cprdate;
	        	dm2.medi_cd				= tmp_cdmedia;
	        	dm2.ecnt				= tmp_cpansu;
	        	dm2.ledt_cd				= tmp_cdcntry;
	        	dm2.prt_seq				= tmp_iseqno;
	        	dm2.fld_no				= tmp_ifdno;
	        	dm2.medi_nm				= tmp_cnmedia;
	        	dm2.ledt_nm				= tmp_cncntry;
	        	dm2.issu_pcnt			= tmp_iprpage;
	        	dm2.prt_ex_tm			= tmp_cprout;
	        	dm2.prt_end_tm			= tmp_cprfin;
	        	dm2.qty					= tmp_lhdbusu;
	        	dm2.chg_qty				= tmp_laddbusu;
	        	dm2.prt_qty				= tmp_lprbusu;
	        	dm2.bad_nwsp_qty		= tmp_lbabusu;
	        	dm2.card_qty			= tmp_laddo;
	        	dm2.dqty				= tmp_lmins;
	        	dm2.prt_plac_clsf		= tmp_cdfact;
	        	dm2.nwsp_side_trsm_tm	= tmp_ctrans;
	        	dm2.dt_tm_stop_tms		= tmp_inpause;
	        	dm2.dt_tm_stop_resn		= tmp_crpause;
	        	dm2.fail_tms			= tmp_inabn;
	        	dm2.fail_resn			= tmp_crabn;
	        	dm2.chrg_pers_nm		= tmp_cpabn;
	        	dm2.cs1_clas_rslt		= tmp_idanres1;
	        	dm2.cs1_cnt_rslt		= tmp_ijungres1;
	        	dm2.cs2_clas_rslt		= tmp_idanres2;
	        	dm2.cs2_cnt_rslt		= tmp_ijungres2;
	        	dm2.remk				= tmp_cdummy;
	        	dm2.print();
				
	        	PR_SENDMG_1000DAO dao2 = new PR_SENDMG_1000DAO();
				ds2 = dao2.pr_sendmg_1040_a(dm2);
				
	        	//ds2 = ejb.pr_sendmg_1040_a(dm2);
			}
			
			
			if(!ds2.getErrcode().equals("")) {
				throw new AppException(ds2.getErrcode(), ds2.getErrmsg());
			}
			req.setAttribute("ds", ds2);
		}
		catch (SysException e) {
			throw new EJBException();
		}
	}
	
	public void pr_sendmg_1050_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
		DBManager manager		= new DBManager("MISMAT");
		PR_SENDMG_1050_ADataSet ds2 = null;
		PR_SENDMG_1050_ADM dm2 = new PR_SENDMG_1050_ADM();
		
		String pr_dt				= "";
		String tmp_issu_dt			= "";
        String tmp_nwsp_type		= "";
        String tmp_fac				= "";
        String tmp_ecnt				= "";
        String tmp_off_plat_basi_tm	= "";
        String tmp_trsm_end_basi_tm	= "";
        String tmp_sect				= "";
        String tmp_last_edt_page	= "";
        String tmp_off_plat_tm		= "";
        String tmp_off_plat_end_tm	= "";
        String tmp_re_off_plat_clr		= "";
        String tmp_re_re_off_plat_clr	= "";
        String tmp_re_off_plat_bw		= "";
        String tmp_re_re_off_plat_bw	= "";
        String filename  			= "";
        String hostname  			= "";
        String username  			= "";
        String password  			= "";
        String directory			= "";
        String strUrl				= "";
        String strResult			= "";
        String[] tmpVal				= null;
        String buff					= "";
        URL url					= null;
		URLConnection httpConn	= null;
		BufferedReader in		= null;
		PrintWriter pout		= null;
		String resultStr		= "";


		pr_dt = Util.checkString(req.getParameter("pr_dt"));
		filename  = pr_dt + ".txt";
        //hostname  = "192.9.3.5";	// 내부아이피     
        hostname  = "218.152.29.5";	// 공인아이피
        username  = "csiftp";
        password  = "csi2009";
        //directory  = "c3plt/csi/plt"; 
        directory  = "plt"; 
        strUrl = "ftp://" + username + ":" + password + "@" + hostname + "/" + directory + "/" + filename;
        System.out.println(strUrl);
	        
        url		= new URL(strUrl);
		httpConn = url.openConnection();
			
		InputStream is = httpConn.getInputStream();
		in = new BufferedReader(new InputStreamReader(is),8*1024);
		
		String line = null;
		int i = 0;
		while( (line=in.readLine())!= null ){
			if (i > 0){
		       	tmpVal = line.split(",");
		       	//System.out.println("line 정보=" + line);
		       	//System.out.println("칼럼 정보=" + tmpVal.length);
		       	
		       	if (tmp_issu_dt.equals("")){
		       		tmp_issu_dt				= tmpVal[0];	//  일자
		       		tmp_nwsp_type			= tmpVal[1];	//	지종
		       		tmp_fac					= tmpVal[2];	//	공장
		       		tmp_ecnt				= tmpVal[3];	//	판수
		       		tmp_off_plat_basi_tm	= tmpVal[4];	//	강판기준시각
		       		tmp_trsm_end_basi_tm	= tmpVal[5];	//	전송완료기준시각
		       		tmp_sect				= tmpVal[6];	//	섹션
		       		tmp_last_edt_page		= tmpVal[7];	//	최종면
		       		tmp_off_plat_tm			= tmpVal[8];	//	강판시각
		       		tmp_off_plat_end_tm		= tmpVal[9];	//	강판완료시각
		       		tmp_re_off_plat_clr		= tmpVal[10];	//	컬러재강판
		       		tmp_re_off_plat_bw		= tmpVal[11];	//	흑백재강판
		       		tmp_re_re_off_plat_clr	= tmpVal[12];	//	컬러재재강판
		       		tmp_re_re_off_plat_bw	= tmpVal[13];	//	흑백재재강판
		       	} else {
		       		tmp_issu_dt				+= "#" + tmpVal[0];
		       		tmp_nwsp_type			+= "#" + tmpVal[1];
		       		tmp_fac					+= "#" + tmpVal[2];
		       		tmp_ecnt				+= "#" + tmpVal[3];
		       		tmp_off_plat_basi_tm	+= "#" + tmpVal[4];
		       		tmp_trsm_end_basi_tm	+= "#" + tmpVal[5];
		       		tmp_sect				+= "#" + tmpVal[6];
		       		tmp_last_edt_page		+= "#" + tmpVal[7];
		       		tmp_off_plat_tm			+= "#" + tmpVal[8].trim();
		       		tmp_off_plat_end_tm		+= "#" + tmpVal[9];
		       		tmp_re_off_plat_clr		+= "#" + tmpVal[10];
		       		tmp_re_off_plat_bw		+= "#" + tmpVal[11];
		       		tmp_re_re_off_plat_clr	+= "#" + tmpVal[12];
		       		tmp_re_re_off_plat_bw	+= "#" + tmpVal[13];
		       	}
	       	}
			i++;
			resultStr += line;
				
		}

	    //System.out.println(strResult);
				
		tmp_off_plat_basi_tm	= tmp_off_plat_basi_tm.replaceAll(":", "");
		tmp_trsm_end_basi_tm	= tmp_trsm_end_basi_tm.replaceAll(":", "");
		tmp_off_plat_tm			= tmp_off_plat_tm.replaceAll(":", "");
		tmp_off_plat_end_tm		= tmp_off_plat_end_tm.replaceAll(":", "");
			
		dm2.cmpy_cd 			= Util.getSessionParameterValue(req,"cmpycd",true);
		dm2.issu_dt				= tmp_issu_dt;
        dm2.nwsp_type			= tmp_nwsp_type;
        dm2.fac					= tmp_fac;
        dm2.ecnt				= tmp_ecnt;
        dm2.off_plat_basi_tm	= tmp_off_plat_basi_tm;
        dm2.trsm_end_basi_tm	= tmp_trsm_end_basi_tm;
        dm2.sect				= tmp_sect;
        dm2.last_edt_page		= tmp_last_edt_page;
        dm2.off_plat_tm			= tmp_off_plat_tm;
        dm2.off_plat_end_tm		= tmp_off_plat_end_tm;
        dm2.re_off_plat_clr		= tmp_re_off_plat_clr;
        dm2.re_off_plat_bw		= tmp_re_off_plat_bw;
        dm2.re_re_off_plat_clr	= tmp_re_re_off_plat_clr;
        dm2.re_re_off_plat_bw	= tmp_re_re_off_plat_bw;
        dm2.incmg_pers_ipaddr	= req.getRemoteAddr();
        dm2.incmg_pers			= Util.getSessionParameterValue(req,"emp_no",true);
        dm2.print();
		
        ds2 = (PR_SENDMG_1050_ADataSet)manager.executeCall(dm2);

		if(!ds2.getErrcode().equals("")) {
			throw new AppException(ds2.getErrcode(), ds2.getErrmsg());
		}
			
		req.setAttribute("ds", ds2);
	}
	
	/*
	public void pr_sendmg_1050_a1(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
		DBManager manager		= new DBManager("MISMAT");
		PR_SENDMG_1050_ADataSet ds2 = null;
		
		PR_SENDMG_1050_ADM dm2 = new PR_SENDMG_1050_ADM();
		
		String pr_dt				= "";
		String tmp_issu_dt			= "";
        String tmp_nwsp_type		= "";
        String tmp_fac				= "";
        String tmp_ecnt				= "";
        String tmp_off_plat_basi_tm	= "";
        String tmp_trsm_end_basi_tm	= "";
        String tmp_sect				= "";
        String tmp_last_edt_page	= "";
        String tmp_off_plat_tm		= "";
        String tmp_off_plat_end_tm	= "";
        String tmp_re_off_plat		= "";
        String tmp_re_re_off_plat	= "";
        String filename  			= "";
        String hostname  			= "";
        String username  			= "";
        String password  			= "";
        String directory			= "";
        String[] tmpVal				= null;
        
        InputStreamReader isr		= null;
        BufferedReader br			= null;
        FTPClient fc 				= new FTPClient();

		try {
			pr_dt = Util.checkString(req.getParameter("pr_dt"));
			filename  = pr_dt + ".txt";
	        hostname  = "192.9.3.5";
	        username  = "csiftp";
	        password  = "csi2009";
	        directory  = "/c3plt/csi/plt"; 
	        //directory  = "plt"; 

	        System.out.println("1...1");
	        fc.connect(hostname, 21);
	        fc.login(username, password);
	        fc.pasv();
	        
	        System.out.println("1...2");
	        InputStream is	= fc.retrieveFileStream(directory + "/" + filename);
	        if(is == null){
	        	System.out.println("null=" + directory + "/" + filename);
	        } else {
	        	System.out.println("not null");
	        }
	        System.out.println("1...3");
	        isr				= new InputStreamReader(is);
	        System.out.println("1...4");
	        br				= new BufferedReader(isr);
	        
	        System.out.println("1...5");
	        String buff		= "";
	        int i			= 0;
	        while(true) {
	        	if (i > 0){
		        	buff = br.readLine();
		        	if (buff == null){
		        		break;
		        	}
		        	tmpVal = buff.split(",");
		        	if (tmp_issu_dt.equals("")){
		        		tmp_issu_dt				= tmpVal[0];
		        		tmp_nwsp_type			= tmpVal[1];
		        		tmp_fac					= tmpVal[2];
		        		tmp_ecnt				= tmpVal[3];
		        		tmp_off_plat_basi_tm	= tmpVal[4];
		        		tmp_trsm_end_basi_tm	= tmpVal[5];
		        		tmp_sect				= tmpVal[6];
		        		tmp_last_edt_page		= tmpVal[7];
		        		tmp_off_plat_tm			= tmpVal[8];
		        		tmp_off_plat_end_tm		= tmpVal[9];
		        		tmp_re_off_plat			= tmpVal[10];
		        		tmp_re_re_off_plat		= tmpVal[11];
		        	} else {
		        		tmp_issu_dt				+= "#" + tmpVal[0];
		        		tmp_nwsp_type			+= "#" + tmpVal[1];
		        		tmp_fac					+= "#" + tmpVal[2];
		        		tmp_ecnt				+= "#" + tmpVal[3];
		        		tmp_off_plat_basi_tm	+= "#" + tmpVal[4];
		        		tmp_trsm_end_basi_tm	+= "#" + tmpVal[5];
		        		tmp_sect				+= "#" + tmpVal[6];
		        		tmp_last_edt_page		+= "#" + tmpVal[7];
		        		tmp_off_plat_tm			+= "#" + tmpVal[8];
		        		tmp_off_plat_end_tm		+= "#" + tmpVal[9];
		        		tmp_re_off_plat			+= "#" + tmpVal[10];
		        		tmp_re_re_off_plat		+= "#" + tmpVal[11];
		        	}
	        	}
	        	i++;
	        	
	        	System.out.println(buff);
	        }

	        fc.disconnect();

			PR_SENDMG_1000EJBHome home = (PR_SENDMG_1000EJBHome)JNDIManager.getInstance().getHome("PR_SENDMG_1000EJB");
			PR_SENDMG_1000EJB ejb = home.create();
				
			dm2.cmpy_cd 			= Util.getSessionParameterValue(req,"cmpycd",true);
			dm2.issu_dt				= tmp_issu_dt;
        	dm2.nwsp_type			= tmp_nwsp_type;
        	dm2.fac					= tmp_fac;
        	dm2.ecnt				= tmp_ecnt;
        	dm2.off_plat_basi_tm	= tmp_off_plat_basi_tm;
        	dm2.trsm_end_basi_tm	= tmp_trsm_end_basi_tm;
        	dm2.sect				= tmp_sect;
        	dm2.last_edt_page		= tmp_last_edt_page;
        	dm2.off_plat_tm			= tmp_off_plat_tm;
        	dm2.off_plat_end_tm		= tmp_off_plat_end_tm;
        	dm2.re_off_plat			= tmp_re_off_plat;
        	dm2.re_re_off_plat		= tmp_re_re_off_plat;
        	dm2.print();
			
        	ds2 = ejb.pr_sendmg_1050_a(dm2);
        	
			req.setAttribute("ds", ds2);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (IOException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
	}
	*/
}