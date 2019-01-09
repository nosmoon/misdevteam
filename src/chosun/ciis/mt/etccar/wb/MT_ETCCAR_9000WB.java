/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.etccar.wb;

import java.rmi.RemoteException;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.util.SMSSender;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.mt.commatr.dm.MT_COMMATR_4000_LDM;
import chosun.ciis.mt.commatr.dm.MT_COMMATR_4003_ADM;
import chosun.ciis.mt.commatr.ds.MT_COMMATR_4000_LDataSet;
import chosun.ciis.mt.commatr.ds.MT_COMMATR_4003_ADataSet;
import chosun.ciis.mt.etcbook.dm.MT_ETCBOOK_2002_ADM;
import chosun.ciis.mt.etcbook.ds.MT_ETCBOOK_2002_ADataSet;
import chosun.ciis.mt.etccar.dm.*;                    
import chosun.ciis.mt.etccar.ds.*;    


/**
 *  
 */

public class MT_ETCCAR_9000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    // 유류비단가 조회 
    public void mt_etccar_9000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_9000_MDataSet ds = null;
		
		MT_ETCCAR_9000_MDM dm = new MT_ETCCAR_9000_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCCAR_9000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    public void mt_etccar_9001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_9001_LDataSet ds = null;
		
		MT_ETCCAR_9001_LDM dm = new MT_ETCCAR_9001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt = Util.checkString(req.getParameter("driv_dt"));

		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_9001_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    
    public void mt_etccar_9002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_9002_ADataSet ds = null;
		
		MT_ETCCAR_9002_ADM dm = new MT_ETCCAR_9002_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		
		String[] converted      = convertMultiUpdateData(multiUpdateData);
		String drvr_cd          = converted[2];
		String driv_yn          = converted[4];
		String nondriv_clsf     = converted[5];
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt = Util.checkString(req.getParameter("driv_dt"));
		dm.setDrvr_cd(drvr_cd);
		dm.setDriv_yn(driv_yn);
		dm.setNondriv_clsf(nondriv_clsf);
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
    	dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_ETCCAR_9002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    public void mt_etccar_9003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_ETCCAR_9003_LDataSet ds = null;
		
    	MT_ETCCAR_9003_LDM dm = new MT_ETCCAR_9003_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.drvr_nm = Util.checkString(req.getParameter("drvr_nm"));
		dm.start_dt = Util.checkString(req.getParameter("start_dt"));
		dm.start_tm = Util.checkString(req.getParameter("start_tm"));
		dm.ariv_dt = Util.checkString(req.getParameter("ariv_dt"));
		dm.ariv_tm = Util.checkString(req.getParameter("ariv_tm"));
		dm.print();

		ds = (MT_ETCCAR_9003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

    public void mt_etccar_9004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_ETCCAR_9004_LDataSet ds = null;
		
    	MT_ETCCAR_9004_LDM dm = new MT_ETCCAR_9004_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.print();

		ds = (MT_ETCCAR_9004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
     
    public void mt_etccar_9100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_9100_MDataSet ds = null;
		
		MT_ETCCAR_9100_MDM dm = new MT_ETCCAR_9100_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCCAR_9100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    public void mt_etccar_9101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_9101_LDataSet ds = null;
		
		MT_ETCCAR_9101_LDM dm = new MT_ETCCAR_9101_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_9101_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    public void mt_etccar_9102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_9102_ADataSet ds = null;
		MT_ETCCAR_9102_ADM dm = new MT_ETCCAR_9102_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.start_dt = Util.checkString(req.getParameter("start_dt"));
		dm.ariv_dt = Util.checkString(req.getParameter("ariv_dt"));
		dm.start_tm = Util.checkString(req.getParameter("start_tm"));
		dm.ariv_tm = Util.checkString(req.getParameter("ariv_tm"));
		dm.dest = Util.checkString(req.getParameter("dest"));
		dm.rid_pers = Util.checkString(req.getParameter("emp_no"));
		dm.rid_deptcd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.driv_purp = Util.checkString(req.getParameter("driv_purp"));
		dm.drvr_yn = Util.checkString(req.getParameter("drvr_yn"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.rid_pers_cnt = Util.checkString(req.getParameter("rid_pers_cnt"));
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
    	dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.gubun = Util.checkString(req.getParameter("gubun"));

		
		dm.print();

		ds = (MT_ETCCAR_9102_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {	
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
				
		req.setAttribute("ds", ds);
	}
    
    public void mt_etccar_9112_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_9112_ADataSet ds = null;
		MT_ETCCAR_9112_ADM dm = new MT_ETCCAR_9112_ADM();
		
		//dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.start_dt = Util.checkString(req.getParameter("start_dt"));
		dm.ariv_dt = Util.checkString(req.getParameter("ariv_dt"));
		dm.start_tm = Util.checkString(req.getParameter("start_tm"));
		dm.ariv_tm = Util.checkString(req.getParameter("ariv_tm"));
		dm.dest = Util.checkString(req.getParameter("dest"));
		dm.rid_pers = Util.checkString(req.getParameter("emp_no"));
		dm.rid_deptcd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.driv_purp = Util.checkString(req.getParameter("driv_purp"));
		dm.drvr_yn = Util.checkString(req.getParameter("drvr_yn"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.rid_pers_cnt = Util.checkString(req.getParameter("rid_pers_cnt"));
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
    	dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.gubun = Util.checkString(req.getParameter("gubun"));
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.drvr_nm = Util.checkString(req.getParameter("drvr_nm"));
		dm.rid_ptphno = Util.checkString(req.getParameter("rid_ptphno"));
		
		
		dm.print();

		ds = (MT_ETCCAR_9112_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {	
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
				
		req.setAttribute("ds", ds);
	}
    
    public void mt_etccar_9111_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_9111_LDataSet ds = null;
		
		MT_ETCCAR_9111_LDM dm = new MT_ETCCAR_9111_LDM();
		//dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_9111_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    public void mt_etccar_9200_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_9200_MDataSet ds = null;
		
		MT_ETCCAR_9200_MDM dm = new MT_ETCCAR_9200_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCCAR_9200_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    public void mt_etccar_9201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_9201_LDataSet ds = null;
		
		MT_ETCCAR_9201_LDM dm = new MT_ETCCAR_9201_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.req_stat = Util.checkString(req.getParameter("req_stat"));
		dm.search_gubun = Util.checkString(req.getParameter("search_gubun"));
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_9201_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    public void mt_etccar_9202_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_9202_ADataSet ds = null;
		
		MT_ETCCAR_9202_ADM dm = new MT_ETCCAR_9202_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		
		String[] converted      = convertMultiUpdateData(multiUpdateData);
		String cancle_yn   	  = converted[2];	
		String drvr_nm   	  = converted[3];	
        String cmpy_mang_nm   = converted[4];
        String car_no         = converted[5];
        String rid_pers       = converted[6];
        String tel_no         = converted[7];
        String rid_pers_cnt   = converted[8]; 
        String dest           = converted[9]; 
        String start_dt       = converted[11]; 
        String start_tm       = converted[12]; 
        String ariv_dt        = converted[13];
        String ariv_tm        = converted[14];
        String rid_deptcd_nm  = converted[15];
        String driv_purp_nm   = converted[16];
        String req_stat_nm    = converted[17];
        String incmg_dt_tm    = converted[18];
        String req_occr_dt    = converted[19];
        String req_seq        = converted[20];
        String occr_dt        = converted[21];
        String seq            = converted[22];
        String rid_deptcd     = converted[23];
        String driv_purp      = converted[24];
        String cmpy_cd      = converted[28];
        String canc_caus      = converted[29];
           
        //dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.setCmpy_cd(cmpy_cd);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setReq_occr_dt(req_occr_dt);
		dm.setReq_seq(req_seq);
		dm.setStart_dt(start_dt);
		dm.setDriv_dt(ariv_dt);
		dm.setCar_no(car_no);
		dm.setStart_tm(start_tm);
		dm.setAriv_tm(ariv_tm);
		dm.setDest(dest);
		dm.setDrvr_nm(drvr_nm);
		dm.setRid_pers(rid_pers);
		dm.setRid_deptcd(rid_deptcd);
		dm.setRid_dept_nm(rid_deptcd_nm);
		dm.setDriv_purp(driv_purp);
		dm.setCancle_yn(cancle_yn);
		dm.setCanc_caus(canc_caus);
		dm.setDel_gb(Util.checkString(req.getParameter("del_gb")));
		dm.setIncmg_pers_ipaddr(req.getRemoteAddr());
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_ETCCAR_9202_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    public void mt_etccar_9203_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_9203_LDataSet ds = null;
		
		MT_ETCCAR_9203_LDM dm = new MT_ETCCAR_9203_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_9203_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    
    public void mt_etccar_9204_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_9204_ADataSet ds = null;
		
		MT_ETCCAR_9204_ADM dm = new MT_ETCCAR_9204_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		
		String[] converted      = convertMultiUpdateData(multiUpdateData);
		String cancle_yn   	  = converted[2];
		String drvr_nm   	  = converted[3];	
        String cmpy_mang_nm   = converted[4];
		String car_no   	  = converted[5];
		String rid_pers   	  = converted[6];
		String tel_no   	  = converted[7];
		
		String occr_dt        = converted[21];
        String seq            = converted[22];
        String cmpy_cd      = converted[28];
        String drvr_tel_no      = converted[31];
        //   System.out.println(tel_no);
        //dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
        dm.setCmpy_cd(cmpy_cd);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.setCancle_yn(cancle_yn);
		
		dm.setIncmg_pers(Util.getSessionParameterValue(req, "emp_no", true));
		dm.print();

		ds = (MT_ETCCAR_9204_ADataSet)manager.executeCall(dm);

		String sm_code = "MIS-500";
        String titl    = "";
        String[] drvr_nm_ar = StringUtil.toArray(drvr_nm,"#");
        String[] cmpy_mang_nm_ar = StringUtil.toArray(cmpy_mang_nm,"#");
		String[] car_no_ar = StringUtil.toArray(car_no,"#");
        String[] rid_pers_ar = StringUtil.toArray(rid_pers,"#");
        String[] tel_no_ar = StringUtil.toArray(tel_no,"#");
        String[] cancle_yn_ar = StringUtil.toArray(cancle_yn,"#");
        String[] drvr_tel_no_ar = StringUtil.toArray(drvr_tel_no,"#");
        
        for(int i=0; i<cancle_yn_ar.length; i++){
        	    	
	    	//System.out.println("car_no_ar"+car_no_ar[i]);
	    	//System.out.println("rid_pers_ar"+rid_pers_ar[i]);
	    	//System.out.println("tel_no_ar"+tel_no_ar[i]);
	    	//System.out.println("cancle_yn_ar"+cancle_yn_ar[i]);
	        
	        
	            	
			//titl = "차량명 "+cmpy_mang_nm_ar[i]+ "\n차량번호 " +car_no_ar[i]+ "\n 운전자명 "+drvr_nm_ar[i]+"\n 운전자연락처 " + drvr_tel_no_ar[i] +"\n     - 배차과 -";
        	titl = "차량명 "+cmpy_mang_nm_ar[i]+ "\n차량번호 " +car_no_ar[i]+ "\n운전자명 "+drvr_nm_ar[i]+"("+drvr_tel_no_ar[i]+")"+"\n- 배차과 -";
        	//titl = "차량명 "+cmpy_mang_nm_ar[i]+ "\n차량번호 " +car_no_ar[i]+ "\n운전자명 \n- 배차과 -";
	    			
	    			
			//System.out.println(titl);
			if("".equals(ds.errcode)){
	    		//SMS 전송....
				String[] ptph_no_ar = StringUtil.toArray(tel_no_ar[i],"#");
				
	    		String sm_rvmbno = Util.checkString("0221801515"); //발신번호
	    		if(!"".equals(sm_rvmbno)){
	    			//System.out.println("try");
	    			
	    			try{
	    				//System.out.println("try1");
		        		SMSSender sms = new SMSSender();
		        		//System.out.println("try2"+"_"+StringUtil.strip(sm_rvmbno, "-")+"_"+ tel_no_ar[i] +"_"+titl+"_"+sm_code );
		        		//sms.send_one(StringUtil.strip(sm_rvmbno, "-"), tel_no_ar[i], titl, sm_code);
		        		//System.out.println(ptph_no_ar.length);
		        		sms.send(StringUtil.strip(sm_rvmbno, "-"), ptph_no_ar, titl, sm_code);
		        		//System.out.println("try3");
		        		
		        		//sms.send_one("027245948","01032459606","test","MIS-500");
		        	}catch(AppException ae){
	    				throw ae;
	    			}
	    		} 
	        }//if("".equals(ds.errcode))

        }//for
		
		

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_etccar_9301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_9301_LDataSet ds = null;
		
		MT_ETCCAR_9301_LDM dm = new MT_ETCCAR_9301_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt = Util.checkString(req.getParameter("driv_dt"));
		dm.search_gubun = Util.checkString(req.getParameter("search_gubun"));
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_9301_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    public void mt_etccar_9401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_9401_LDataSet ds = null;
		
		MT_ETCCAR_9401_LDM dm = new MT_ETCCAR_9401_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_mm = Util.checkString(req.getParameter("driv_mm"));
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_9401_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    
    public void mt_etccar_9501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_ETCCAR_9501_LDataSet ds = null;
		
		MT_ETCCAR_9501_LDM dm = new MT_ETCCAR_9501_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_mm = Util.checkString(req.getParameter("driv_mm"));
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_ETCCAR_9501_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
}
