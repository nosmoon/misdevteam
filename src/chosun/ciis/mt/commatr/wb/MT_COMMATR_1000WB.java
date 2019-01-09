package chosun.ciis.mt.commatr.wb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;
import chosun.ciis.as.aset.dm.AS_ASET_1008_ADM;
import chosun.ciis.as.aset.ds.AS_ASET_1008_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

public class MT_COMMATR_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * TAB 1 자재 내역 등록
     */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    /**
     * 콤보 셋팅
     */
    public void mt_commatr_1100(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMATR_1100_LDataSet ds = null;
    	
        // DM Setting
    	MT_COMMATR_1100_LDM dm = new MT_COMMATR_1100_LDM();
       	dm.setCmpy_cd("100");
       	dm.setRmjj_cd(  Util.checkString(req.getParameter("rmjj_cd")))  ;
       	dm.print();

       	ds = (MT_COMMATR_1100_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	throw new AppException(ds.errcode, ds.errmsg);
        }

        req.setAttribute("ds", ds);
    }
    /**
     * 자재코드에 따른 자재코드 명칭 가져오기
     */
    public void mt_commatr_1101(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMATR_1101_LDataSet ds = null;

        // DM Setting
    	MT_COMMATR_1101_LDM dm = new MT_COMMATR_1101_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    	dm.setMatr_cd(  Util.checkString(req.getParameter("matr_cd")))  ;
    	dm.print();
    	
    	ds = (MT_COMMATR_1101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }
    
	public void mt_commatr_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1102_LDataSet ds = null;
		
		MT_COMMATR_1102_LDM dm = new MT_COMMATR_1102_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.print();

		ds = (MT_COMMATR_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_commatr_1103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1103_ADataSet ds = null;
		
		MT_COMMATR_1103_ADM dm = new MT_COMMATR_1103_ADM();
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.matr_nm = Util.checkString(req.getParameter("matr_nm"));
		dm.matr_clas = Util.checkString(req.getParameter("matr_clas"));
		dm.purc_uprc = Util.checkString(req.getParameter("purc_uprc"));
		dm.std_modl = Util.checkString(req.getParameter("std_modl"));
		dm.unit = Util.checkString(req.getParameter("unit"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.abc_clas = Util.checkString(req.getParameter("abc_clas"));
		dm.dstb_rat_cd = Util.checkString(req.getParameter("dstb_rat_cd"));
		dm.ewh_budg_cd = Util.checkString(req.getParameter("ewh_budg_cd"));
		dm.owh_budg_cd = Util.checkString(req.getParameter("owh_budg_cd"));
		dm.eps_no = Util.checkString(req.getParameter("eps_no"));
		dm.prt_seq = Util.checkString(req.getParameter("prt_seq"));
		dm.usag = Util.checkString(req.getParameter("usag"));
		dm.impt_yn = Util.checkString(req.getParameter("impt_yn"));
		dm.daily_rept_yn = Util.checkString(req.getParameter("daily_rept_yn"));
		dm.stok_mang_yn = Util.checkString(req.getParameter("stok_mang_yn"));
		dm.remk_use_yn = Util.checkString(req.getParameter("remk_use_yn"));
		dm.wste_yn = Util.checkString(req.getParameter("wste_yn"));
		dm.wste_dt = Util.checkString(req.getParameter("wste_dt"));
		dm.vip_matr_yn = Util.checkString(req.getParameter("vip_matr_yn"));
		dm.brws_obj_yn = Util.checkString(req.getParameter("brws_obj_yn"));
		dm.item_req_mt_yn = Util.checkString(req.getParameter("item_req_mt_yn"));
		dm.item_req_usag_yn = Util.checkString(req.getParameter("item_req_usag_yn"));
		dm.via_dept_yn = Util.checkString(req.getParameter("via_dept_yn"));
		dm.item_req_mand_yn = Util.checkString(req.getParameter("item_req_mand_yn"));
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.rela_yn = Util.checkString(req.getParameter("rela_yn"));
		dm.print();

		ds = (MT_COMMATR_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_commatr_1104_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1104_MDataSet ds = null;
		
		MT_COMMATR_1104_MDM dm = new MT_COMMATR_1104_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_COMMATR_1104_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_commatr_1110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1110_LDataSet ds = null;
		
		MT_COMMATR_1110_LDM dm = new MT_COMMATR_1110_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.matr_nm = Util.checkString(req.getParameter("matr_nm"));
		dm.print();

		ds = (MT_COMMATR_1110_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

    /**
     * TAB 메뉴 자재내역 조회
     */
	public void mt_commatr_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1201_LDataSet ds = null;
		
		MT_COMMATR_1201_LDM dm = new MT_COMMATR_1201_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dstb_rat_cd = Util.checkString(req.getParameter("dstb_rat_cd"));
		dm.print();

		ds = (MT_COMMATR_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

    /**
     * TAB 3 메체코드 조회
     */
    public void mt_commatr_1301(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_COMMATR_1301_LDataSet ds = null;

        // DM Setting
    	MT_COMMATR_1301_LDM dm = new MT_COMMATR_1301_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    	dm.print();
    	
    	ds = (MT_COMMATR_1301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
    }

    /**
     * TAB 3 조회
     */
	public void mt_commatr_1302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1302_LDataSet ds = null;
		
		MT_COMMATR_1302_LDM dm = new MT_COMMATR_1302_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd_fr = Util.checkString(req.getParameter("matr_cd_fr"));
		dm.matr_cd_to = Util.checkString(req.getParameter("matr_cd_to"));
		dm.print();

		ds = (MT_COMMATR_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_commatr_1303_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1303_ADataSet ds = null;
		
		MT_COMMATR_1303_ADM dm = new MT_COMMATR_1303_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd   = Util.checkString(req.getParameter("matr_cd"));
		dm.dstb_rat_cd = Util.checkString(req.getParameter("dstb_rat_cd"));
		dm.ewh_budg_cd = Util.checkString(req.getParameter("ewh_budg_cd"));
		dm.owh_budg_cd = Util.checkString(req.getParameter("owh_budg_cd"));
		dm.wste_yn = Util.checkString(req.getParameter("wste_yn"));
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_COMMATR_1303_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_commatr_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1400_LDataSet ds = null;
		
		MT_COMMATR_1400_LDM dm = new MT_COMMATR_1400_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.print();

		ds = (MT_COMMATR_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1401_LDataSet ds = null;
		
		MT_COMMATR_1401_LDM dm = new MT_COMMATR_1401_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_COMMATR_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	/*
	 * 안전재고량 등록
	 */
	public void mt_commatr_1410_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1410_ADataSet ds = null;
		
		MT_COMMATR_1410_ADM dm = new MT_COMMATR_1410_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted      = convertMultiUpdateData(multiUpdateData);

		String gubun              = converted[0];
		String fac_clsf           = converted[3];
		String matr_cd            = converted[4];
		String safe_stok          = converted[6];
		String dd_time_ordr_qunt  = converted[7];

		dm.setGubun(gubun);
		dm.setFac_clsf(fac_clsf);
		dm.setMatr_cd(matr_cd);
		dm.setSafe_stok(safe_stok);
		dm.setDd_time_ordr_qunt(dd_time_ordr_qunt);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (MT_COMMATR_1410_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	 
	public void mt_commatr_1601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1601_LDataSet ds = null;
		
		MT_COMMATR_1601_LDM dm = new MT_COMMATR_1601_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.print();

		ds = (MT_COMMATR_1601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void mt_commatr_1602_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1602_LDataSet ds = null;
		
		MT_COMMATR_1602_LDM dm = new MT_COMMATR_1602_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.print();

		ds = (MT_COMMATR_1602_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}


	public void mt_commatr_1603_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1603_ADataSet ds = null;
		
		MT_COMMATR_1603_ADM dm = new MT_COMMATR_1603_ADM();
		
		Hashtable ht = new Hashtable();
		//byte[] up_phot_img = null;
		byte[] up_phot_img = new byte[1048576]; //10Mb
		 
    	String file_name = "";
    	String file_size = "";
        
        int sizeLimit = 10 * 1024 * 1024 ;
        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB 

        
        Part part; 
        while ((part = mp.readNextPart()) != null) {
            String name  = part.getName();
            if (part.isParam()) {
    			ht.put(part.getName(), ((ParamPart)part).getStringValue());
            }else if (part.isFile()) {
                FilePart filePart = (FilePart) part;
                file_name = filePart.getFileName();

                if ( file_name != null ) {
                	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    				((FilePart)part).writeTo(byteArrayOutputStream);
    				up_phot_img = byteArrayOutputStream.toByteArray();
    	    		//dm.up_phot_img = up_phot_img;
    	    		//dm.setUp_phot_img(up_phot_img);
    	    		file_size = String.valueOf(up_phot_img.length);
    	    		
                }
            }
        }
		System.out.println(up_phot_img.length);
		//String img_chk = Util.checkString((String)ht.get("img_chk"));	
		dm.gubun = Util.checkString((String)ht.get("gubun"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.part_cd = Util.checkString((String)ht.get("part_cd"));
		dm.part_nm = Util.checkString((String)ht.get("part_nm"));
		dm.part_dtl_nm = Util.checkString((String)ht.get("part_dtl_nm"));
		dm.part_clas1 = Util.checkString((String)ht.get("part_clas1"));
		dm.part_clas2 = Util.checkString((String)ht.get("part_clas2"));
		dm.purc_uprc = Util.checkString((String)ht.get("purc_uprc"));
		dm.std_modl = Util.checkString((String)ht.get("std_modl"));
		dm.unit = Util.checkString((String)ht.get("unit"));
		dm.prt_seq = Util.checkString((String)ht.get("prt_seq"));
		dm.usag = Util.checkString((String)ht.get("usag"));
		dm.purc_info = Util.checkString((String)ht.get("purc_info"));
		dm.barcode = Util.checkString((String)ht.get("barcode"));
		dm.maker = Util.checkString((String)ht.get("maker"));
		dm.use_yn = Util.checkString((String)ht.get("use_yn"));
//		dm.mode = Util.checkString(req.getParameter("mode"));
//		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
//		dm.nw_stok = Util.checkString(req.getParameter("nw_stok"));
		dm.up_phot_img = "1010".getBytes();
		dm.file_size = file_size;

		
		String multiUpdateData = Util.checkString((String)ht.get("multiUpdateData"));
		
		//String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		//System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		System.out.println(hash);
     
		
		dm.mode = Util.checkString((String)hash.get("m")).toUpperCase();
		dm.fac_clsf = Util.checkString((String)hash.get("fac_clsf"));
		dm.nw_stok = Util.checkString((String)hash.get("nw_stok"));
		//System.out.println(Util.checkString((String)hash.get("m")).toUpperCase());
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));


		ds = (MT_COMMATR_1603_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}else{
			//System.out.println("bb");
			// BLOB 구하기
			//manager.m_conn.setAutoCommit(false);		
            //System.out.println("file_name:" + file_name);
            //System.out.println("file_size:" + file_size);
			if(file_size != ""){
				try {
					//System.out.println("update:::");
					manager.getConnection();
					manager.m_conn.setAutoCommit(false);
					//System.out.println("manager:"+manager);
					Statement stmt = manager.m_conn.createStatement();
					
					//System.out.println("stmt:"+stmt);
					String blobQuery = "SELECT PHOT_IMG FROM TAMTC_PTPHOT WHERE CMPY_CD = '" + dm.cmpy_cd + "' AND PART_CD = '" + dm.part_cd + "' FOR UPDATE";			
					//String blobQuery = "SELECT BO_HEAD_PHOT FROM TASEM_BOHEADPHOT WHERE CMPY_CD = '"+dm.cmpy_cd+"' AND BO_HEAD_PRN = '"+dm.bo_head_prn+"' FOR UPDATE";
					//System.out.println("blobQuery:"+blobQuery);
					//System.out.println("up_phot_img.length:"+up_phot_img.length);
					
					OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
					//System.out.println("kkk");
					
					if (rset.next()) {             
						//weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
						//BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	           	   		//레진용(ep1)
						
						//System.out.println("kkk2");
	           	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
						
						OutputStream os = oracle_blob.getBinaryOutputStream();
						  
						// 파일로부터 읽어서 BLOB 에 WRITE 한다.
						for(int i=0; i<up_phot_img.length; i++){
							os.write(up_phot_img[i]);
						}
						os.close();
					}
					stmt.close();
					manager.m_conn.commit();
					manager.disConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					try{
						manager.m_conn.rollback();
						manager.disConnection();
					}catch(SQLException se){
						manager.disConnection();
						throw new SysException(se);
					}
					manager.disConnection();
					throw new SysException(e);
				}
			}
		}
		
		req.setAttribute("ds", ds);
	}
	public void mt_commatr_1604_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1604_ADataSet ds = null;
		
		MT_COMMATR_1604_ADM dm = new MT_COMMATR_1604_ADM();
		
		Hashtable ht = new Hashtable();
		//byte[] up_phot_img = null;
		byte[] up_phot_img = new byte[1048576]; //10Mb
		 
    	String file_name = "";
    	String file_size = "";
        
        int sizeLimit = 10 * 1024 * 1024 ;
        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB 

        
        Part part; 
        while ((part = mp.readNextPart()) != null) {
            String name  = part.getName();
            if (part.isParam()) {
    			ht.put(part.getName(), ((ParamPart)part).getStringValue());
            }else if (part.isFile()) {
                FilePart filePart = (FilePart) part;
                file_name = filePart.getFileName();

                if ( file_name != null ) {
                	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    				((FilePart)part).writeTo(byteArrayOutputStream);
    				up_phot_img = byteArrayOutputStream.toByteArray();
    	    		//dm.up_phot_img = up_phot_img;
    	    		//dm.setUp_phot_img(up_phot_img);
    	    		file_size = String.valueOf(up_phot_img.length);
    	    		
                }
            }
        }
        //System.out.println(file_name);
        //System.out.println(file_size);
				
     	
		dm.gubun = Util.checkString((String)ht.get("gubun")); 
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.part_cd = Util.checkString((String)ht.get("part_cd")); 
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.up_phot_img = "1010".getBytes();
		dm.file_size = file_size;

		ds = (MT_COMMATR_1604_ADataSet)manager.executeCall(dm);
		//System.out.println(ds.getErrmsg());
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		else{
			//System.out.println("bb");
			// BLOB 구하기
			//manager.m_conn.setAutoCommit(false);		
            //System.out.println("file_name:" + file_name);
            //System.out.println("file_size:" + file_size);
			if(file_name != ""){
				try {
					//System.out.println("update:::");
					manager.getConnection();
					manager.m_conn.setAutoCommit(false);
					//System.out.println("manager:"+manager);
					Statement stmt = manager.m_conn.createStatement();
					
					//System.out.println("stmt:"+stmt);
					String blobQuery = "SELECT PHOT_IMG FROM TAMTC_PTPHOT WHERE CMPY_CD = '" + dm.cmpy_cd + "' AND PART_CD = '" + dm.part_cd + "' FOR UPDATE";			
					//String blobQuery = "SELECT BO_HEAD_PHOT FROM TASEM_BOHEADPHOT WHERE CMPY_CD = '"+dm.cmpy_cd+"' AND BO_HEAD_PRN = '"+dm.bo_head_prn+"' FOR UPDATE";
					//System.out.println("blobQuery:"+blobQuery);
					//System.out.println("up_phot_img.length:"+up_phot_img.length);
					
					OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
					//System.out.println("kkk");
					
					if (rset.next()) {             
						//weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
						//BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	           	   		//레진용(ep1)
						
						//System.out.println("kkk2");
	           	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
						
						OutputStream os = oracle_blob.getBinaryOutputStream();
						  
						// 파일로부터 읽어서 BLOB 에 WRITE 한다.
						for(int i=0; i<up_phot_img.length; i++){
							os.write(up_phot_img[i]);
						}
						os.close();
					}
					stmt.close();
					manager.m_conn.commit();
					manager.disConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					try{
						manager.m_conn.rollback();
						manager.disConnection();
					}catch(SQLException se){
						manager.disConnection();
						throw new SysException(se);
					}
					manager.disConnection();
					throw new SysException(e);
				}
			}
		}
		
		req.setAttribute("ds", ds);
	} 
	public void mt_commatr_1610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_1610_LDataSet ds = null;
		
		MT_COMMATR_1610_LDM dm = new MT_COMMATR_1610_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.part_cd = Util.checkString(req.getParameter("part_cd"));
		dm.part_nm = Util.checkString(req.getParameter("part_nm"));
		dm.part_clsf = Util.checkString(req.getParameter("part_clsf"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.print();

		ds = (MT_COMMATR_1610_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}


}