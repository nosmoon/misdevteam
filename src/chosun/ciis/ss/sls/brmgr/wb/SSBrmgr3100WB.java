package chosun.ciis.ss.sls.brmgr.wb;

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
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.dao.*;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.Part;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;



public class SSBrmgr3100WB
{

	public int filesize = 5*1024*1024;

	public void initBrmgr3100(HttpServletRequest req, HttpServletResponse res)
			throws AppException
			{
		SS_SLS_BRMGR_3100_ADataSet ds = null;

		String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		String auth_gb = Util.checkString(req.getParameter("auth_gb"));
		String incmg_pers = Util.getSessionParameterValue(req, "uid", true);
		String base_dt = Util.checkString(req.getParameter("base_dt"));

		SS_SLS_BRMGR_3100_ADM dm = new SS_SLS_BRMGR_3100_ADM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setAuth_gb(auth_gb);
		dm.setIncmg_pers(incmg_pers);
		dm.setBase_dt(base_dt);

		dm.print();

		SSBrmgr3100DAO dao = new SSBrmgr3100DAO();
		ds = dao.initBrmgr3100(dm);
		req.setAttribute("ds", ds);
			}


	public void ctinfoBrmgr3105(HttpServletRequest req, HttpServletResponse res)
	  throws AppException
		{
		  SS_SLS_BRMGR_3105_SDataSet ds = null;

		  String bocd = Util.checkString(req.getParameter("bocd"));

		  SS_SLS_BRMGR_3105_SDM dm = new SS_SLS_BRMGR_3105_SDM();
		  dm.setBocd(bocd);

		  dm.print();

		  SSBrmgr3100DAO dao = new SSBrmgr3100DAO();
		  ds = dao.ctinfoBrmgr3105(dm);
		  req.setAttribute("ds", ds);
		}


	  public void gymediBrmgr3110(HttpServletRequest req, HttpServletResponse res)
			  throws AppException
			  {
		  SS_SLS_BRMGR_3110_LDataSet ds = null;

		  SS_SLS_BRMGR_3110_LDM dm = new SS_SLS_BRMGR_3110_LDM();

		  SSBrmgr3100DAO dao = new SSBrmgr3100DAO();
		  ds = dao.gymediBrmgr3110(dm);
		  req.setAttribute("ds", ds);
			  }


	  public void srchBrmgr3120(HttpServletRequest req, HttpServletResponse res)
			  throws AppException
			  {
		  SS_SLS_BRMGR_3120_LDataSet ds = null;

		  String deptcd = Util.checkString(req.getParameter("deptcd"));
		  String partcd = Util.checkString(req.getParameter("partcd"));
		  String areacd = Util.checkString(req.getParameter("areacd"));
		  String bocd = Util.checkString(req.getParameter("bocd"));
		  String frdt = Util.checkString(req.getParameter("frdt"));
		  String todt = Util.checkString(req.getParameter("todt"));
		  String bohead_nm = Util.checkString(req.getParameter("bohead_nm"));
		  String makeid = Util.checkString(req.getParameter("makeid"));
		  String titl = Util.checkString(req.getParameter("titl"));

		  SS_SLS_BRMGR_3120_LDM dm = new SS_SLS_BRMGR_3120_LDM();

		  dm.setDeptcd(deptcd);
		  dm.setPartcd(partcd);
		  dm.setAreacd(areacd);
		  dm.setBocd(bocd);
		  dm.setFrdt(frdt);
		  dm.setTodt(todt);
		  dm.setBohead_nm(bohead_nm);
		  dm.setMakeid(makeid);
		  dm.setTitl(titl);

		  dm.print();

		  SSBrmgr3100DAO dao = new SSBrmgr3100DAO();
		  ds = dao.srchBrmgr3120(dm);
		  req.setAttribute("ds", ds);
			  }


	  public void dtlsBrmgr3125(HttpServletRequest req, HttpServletResponse res)
			  throws AppException
			  {
		  SS_SLS_BRMGR_3125_SDataSet ds = null;

		  String makeid = Util.checkString(req.getParameter("makeid"));
		  String makedt = Util.checkString(req.getParameter("makedt"));
		  String bocd = Util.checkString(req.getParameter("bocd"));

		  SS_SLS_BRMGR_3125_SDM dm = new SS_SLS_BRMGR_3125_SDM();

		  dm.setMakeid(makeid);
		  dm.setMakedt(makedt);
		  dm.setBocd(bocd);

		  dm.print();

		  SSBrmgr3100DAO dao = new SSBrmgr3100DAO();
		  ds = dao.dtlsBrmgr3125(dm);
		  req.setAttribute("ds", ds);
			  }


	  public void insertBrmgr3130(HttpServletRequest req, HttpServletResponse res) throws AppException{
		  	//파일첨부 관련.
	        PrintWriter out = null;
	        Hashtable ht = new Hashtable();

	        boolean bResult = false;
	        String sResult = "false";       // request로 반환할 String Type 결과
	        byte[] filecont = (byte[])null;

	        //파일을 ByteArray에 담고 input name과 imput value를 Hashtable에 저장한다.
	        try {
	            out = res.getWriter();
	        	MultipartParser multi = new MultipartParser(req, filesize);
	            Part part = null;
	            FilePart filePart = null;
	            ParamPart parampart = null;
	            String parmName = null;
	            String parmValue = null;


	            for (int i=0; (part = multi.readNextPart()) != null;i++ ) {

	                if (part.isFile()) {
	                    filePart = (FilePart) part;
	                    //파일을 첨부했을 경우
	                    if(filePart.getFileName() != null){
		                    ht.put(part.getName(), filePart.getFileName());
		                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		                    filePart.writeTo(byteArrayOutputStream);
		                    filecont = byteArrayOutputStream.toByteArray();
	                    	break;
	                    }
	                    //파일을 첨부하지 않았을 경우
	                    else{
	                    	ht.put(part.getName(), "");
	                    }
	                }
	                else if(part.isParam()){
	                    parampart = (ParamPart)part;
	                    ht.put(part.getName(), parampart.getStringValue());
	                }
	            }
	        } catch (IOException e) {
	            throw new AppException("[SSBrmgr3100WB.insertBrmgr3130()]","[SSBrmgr3100WB.insertBrmgr3130()]첨부한 파일의 크기가 너무 크거나, 파일이 올바르지 않습니다.");
	        } catch (Exception e) {
	            SysException se = new SysException(e);
	            LogManager.getInstance().log(se);
	            throw se;
	        }
		  String filenm 	    = Util.Uni2Ksc(Util.checkString((String)ht.get("filenm")));

		  //보고서내용들.
		  String makeid = Util.checkString(req.getParameter("makeid"));
		  String makenm = Util.checkString(req.getParameter("makenm"));
		  String bocd = Util.checkString(req.getParameter("bocd"));
		  String bo_seq = Util.checkString(req.getParameter("bo_seq"));
		  String bonm = Util.checkString(req.getParameter("bonm"));
		  String titl = Util.checkString(req.getParameter("titl"));
		  String bo_cntr_dt = Util.checkString(req.getParameter("bo_cntr_dt"));
		  String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
		  String bohead_bidt = Util.checkString(req.getParameter("bohead_bidt"));
		  String bo_addr = Util.checkString(req.getParameter("bo_addr"));
		  String issu_qty = Util.checkString(req.getParameter("issu_qty"));
		  String rdr_qty = Util.checkString(req.getParameter("rdr_qty"));
		  String post_dlvqty = Util.checkString(req.getParameter("post_dlvqty"));
		  String jursareanm = Util.checkString(req.getParameter("jursareanm"));
		  String dd_issu_qty = Util.checkString(req.getParameter("dd_issu_qty"));
		  String dd_rdr_qty = Util.checkString(req.getParameter("dd_rdr_qty"));
		  String side_csyn = Util.checkString(req.getParameter("side_csyn"));
		  String dlv_wonqty = Util.checkString(req.getParameter("dlv_wonqty"));
		  String dlv_proctm = Util.checkString(req.getParameter("dlv_proctm"));
		  String dlv_endtm = Util.checkString(req.getParameter("dlv_endtm"));
		  String davg_dlvdist = Util.checkString(req.getParameter("davg_dlvdist"));
		  String mavg_clamt = Util.checkString(req.getParameter("mavg_clamt"));
		  String net_sale_amt = Util.checkString(req.getParameter("net_sale_amt"));
		  String web_utablty = Util.checkString(req.getParameter("web_utablty"));
		  String app_utablty = Util.checkString(req.getParameter("app_utablty"));
		  String dlv_solut = Util.checkString(req.getParameter("dlv_solut"));
		  String brdrnm_stat = Util.checkString(req.getParameter("brdrnm_stat"));
		  String area_feat = Util.checkString(req.getParameter("area_feat"));
		  String cent_feat = Util.checkString(req.getParameter("cent_feat"));
		  String bohead_feat = Util.checkString(req.getParameter("bohead_feat"));
		  String prb_solut = Util.checkString(req.getParameter("prb_solut"));
		  String rdrnm_stat = Util.checkString(req.getParameter("rdrnm_stat"));

		  //겸영지관련
		  String gy_medicd1 = Util.checkString(req.getParameter("gy_medicd1"));
		  String gy_issu_qty1 = Util.checkString(req.getParameter("gy_issu_qty1"));
		  String gy_rdr_qty1 = Util.checkString(req.getParameter("gy_rdr_qty1"));
		  String gy_medicd2 = Util.checkString(req.getParameter("gy_medicd2"));
		  String gy_issu_qty2 = Util.checkString(req.getParameter("gy_issu_qty2"));
		  String gy_rdr_qty2 = Util.checkString(req.getParameter("gy_rdr_qty2"));
		  String gy_medicd3 = Util.checkString(req.getParameter("gy_medicd3"));
		  String gy_issu_qty3 = Util.checkString(req.getParameter("gy_issu_qty3"));
		  String gy_rdr_qty3 = Util.checkString(req.getParameter("gy_rdr_qty3"));
		  String gy_medicd4 = Util.checkString(req.getParameter("gy_medicd4"));
		  String gy_issu_qty4 = Util.checkString(req.getParameter("gy_issu_qty4"));
		  String gy_rdr_qty4 = Util.checkString(req.getParameter("gy_rdr_qty4"));
		  String gy_medicd5 = Util.checkString(req.getParameter("gy_medicd5"));
		  String gy_issu_qty5 = Util.checkString(req.getParameter("gy_issu_qty5"));
		  String gy_rdr_qty5 = Util.checkString(req.getParameter("gy_rdr_qty5"));
		  String gy_medi_etc = Util.checkString(req.getParameter("gy_medi_etc"));


		  SS_SLS_BRMGR_3130_IDM dm = new SS_SLS_BRMGR_3130_IDM();

			  //파일첨부 관련
			  if(!filenm.equals("")){
				  dm.setFilenm(filenm);
				  dm.setFilecont(filecont);
			  }

		  //보고서내용 관련
		  dm.setMakeid(makeid);
		  dm.setMakenm(makenm);
		  dm.setBocd(bocd);
		  dm.setBo_seq(bo_seq);
		  dm.setBonm(bonm);
		  dm.setTitl(titl);
		  dm.setBo_cntr_dt(bo_cntr_dt);
		  dm.setBo_head_nm(bo_head_nm);
		  dm.setBohead_bidt(bohead_bidt);
		  dm.setBo_addr(bo_addr);
		  dm.setIssu_qty(issu_qty);
		  dm.setRdr_qty(rdr_qty);
		  dm.setPost_dlvqty(post_dlvqty);
		  dm.setJursareanm(jursareanm);
		  dm.setDd_issu_qty(dd_issu_qty);
		  dm.setDd_rdr_qty(dd_rdr_qty);
		  dm.setSide_csyn(side_csyn);
		  dm.setDlv_wonqty(dlv_wonqty);
		  dm.setDlv_proctm(dlv_proctm);
		  dm.setDlv_endtm(dlv_endtm);
		  dm.setDavg_dlvdist(davg_dlvdist);
		  dm.setMavg_clamt(mavg_clamt);
		  dm.setNet_sale_amt(net_sale_amt);
		  dm.setWeb_utablty(web_utablty);
		  dm.setApp_utablty(app_utablty);
		  dm.setDlv_solut(dlv_solut);
		  dm.setBrdrnm_stat(brdrnm_stat);
		  dm.setArea_feat(area_feat);
		  dm.setCent_feat(cent_feat);
		  dm.setBohead_feat(bohead_feat);
		  dm.setPrb_solut(prb_solut);
		  dm.setRdrnm_stat(rdrnm_stat);

		  //겸영지 관련
		  dm.setGy_medicd1(gy_medicd1);
		  dm.setGy_issu_qty1(gy_issu_qty1);
		  dm.setGy_rdr_qty1(gy_rdr_qty1);
		  dm.setGy_medicd2(gy_medicd2);
		  dm.setGy_issu_qty2(gy_issu_qty2);
		  dm.setGy_rdr_qty2(gy_rdr_qty2);
		  dm.setGy_medicd3(gy_medicd3);
		  dm.setGy_issu_qty3(gy_issu_qty3);
		  dm.setGy_rdr_qty3(gy_rdr_qty3);
		  dm.setGy_medicd4(gy_medicd4);
		  dm.setGy_issu_qty4(gy_issu_qty4);
		  dm.setGy_rdr_qty4(gy_rdr_qty4);
		  dm.setGy_medicd5(gy_medicd5);
		  dm.setGy_issu_qty5(gy_issu_qty5);
		  dm.setGy_rdr_qty5(gy_rdr_qty5);
		  dm.setGy_medi_etc(gy_medi_etc);

		  dm.print();

		  SSBrmgr3100DAO dao = new SSBrmgr3100DAO();
		  bResult = dao.insertBrmgr3130(dm);
		  if(bResult == true){	//성공적으로 입력된 경우
			  sResult = "true";
		  }
		  req.setAttribute("result", sResult);
			  }




}