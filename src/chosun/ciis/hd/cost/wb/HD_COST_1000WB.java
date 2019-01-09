package chosun.ciis.hd.cost.wb;

import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.hd.cost.dm.HD_COST_1000_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1001_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1002_500_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1002_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1003_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1004_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1006_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1007_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1008_MDM;
import chosun.ciis.hd.cost.dm.HD_COST_1009_MDM;
import chosun.ciis.hd.cost.dm.HD_COST_1100_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1101_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1102_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1103_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1104_DDM;
import chosun.ciis.hd.cost.dm.HD_COST_1105_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1106_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1108_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1109_MDM;
import chosun.ciis.hd.cost.dm.HD_COST_1200_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1201_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1202_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1300_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1301_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1302_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1303_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1400_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1401_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1402_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1403_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1404_MDM;
import chosun.ciis.hd.cost.dm.HD_COST_1500_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1501_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1502_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_1503_DDM;
import chosun.ciis.hd.cost.dm.HD_COST_1506_MDM;
import chosun.ciis.hd.cost.dm.HD_COST_1600_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_1700_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_2002_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_2003_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_2006_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_2007_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_2100_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_2101_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_2102_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_2103_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_2104_DDM;
import chosun.ciis.hd.cost.dm.HD_COST_2108_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_3002_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_3003_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_3006_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_3100_LDM;
import chosun.ciis.hd.cost.dm.HD_COST_3101_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_3103_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_3105_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_3106_ADM;
import chosun.ciis.hd.cost.dm.HD_COST_3108_ADM;
import chosun.ciis.hd.cost.ds.HD_COST_1000_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1001_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1002_500_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1002_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1003_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1004_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1006_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1007_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1008_MDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1009_MDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1100_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1101_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1102_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1103_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1104_DDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1105_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1106_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1108_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1109_MDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1200_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1201_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1202_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1300_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1301_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1302_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1303_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1400_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1401_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1402_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1403_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1404_MDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1500_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1501_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1502_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1503_DDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1506_MDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1600_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_1700_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_2002_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_2003_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_2006_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_2007_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_2100_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_2101_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_2102_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_2103_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_2104_DDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_2108_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_3002_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_3003_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_3006_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_3100_LDataSet;
import chosun.ciis.hd.cost.ds.HD_COST_3101_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_3103_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_3105_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_3106_ADataSet;
import chosun.ciis.hd.cost.ds.HD_COST_3108_ADataSet;
import java.io.PrintStream;
import java.util.Hashtable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.util.Util;

public class HD_COST_1000WB extends BaseWB
{
  public final String ROW_SEPARATOR = "|";

  public final String COL_SEPARATOR = "#";

  public void hd_cost_1000_l(HttpServletRequest req, HttpServletResponse res)
    throws AppException
  {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1000_LDataSet ds = null;
    HD_COST_1000_LDM dm = new HD_COST_1000_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    ds = (HD_COST_1000_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1001_LDataSet ds = null;
    HD_COST_1001_LDM dm = new HD_COST_1001_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.emp_no = Util.checkString(req.getParameter("emp_no"));

    ds = (HD_COST_1001_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1002_LDataSet ds = null;
    HD_COST_1002_LDM dm = new HD_COST_1002_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
    dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
    dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

    dm.print();

    ds = (HD_COST_1002_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1002_500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1002_500_LDataSet ds = null;
    HD_COST_1002_500_LDM dm = new HD_COST_1002_500_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
    dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
    dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
    dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
    dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

    dm.print();

    ds = (HD_COST_1002_500_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1003_ADataSet ds = null;
    HD_COST_1003_ADM dm = new HD_COST_1003_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    String[] converted = convertMultiUpdateData(multiUpdateData);

    String mode = converted[0];
    String emp_no = converted[3];
    String flnm = converted[4];
    String subj_sel_dt = converted[7];
    String real_fee_subj_sel_cd = converted[8];
    String itme_seq = converted[9];
    String real_fee_subj_sel_fee = converted[10];
    String subj_sel_ptcr = converted[11];
    String dept_cd = converted[15];
    String dty_cd = converted[16];
    String posi_cd = converted[17];
    String seq = converted[18];
    String occr_dt = converted[19];
    String medi_cd = converted[12];
    String dtl_medi_cd = converted[13];

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.setMode(mode.toUpperCase());
    dm.setEmp_no(emp_no);
    dm.setFlnm(flnm);
    dm.setSubj_sel_dt(subj_sel_dt);
    dm.setReal_fee_subj_sel_cd(real_fee_subj_sel_cd);
    dm.setItme_seq(itme_seq);
    dm.setReal_fee_subj_sel_fee(real_fee_subj_sel_fee);
    dm.setSubj_sel_ptcr(subj_sel_ptcr);
    dm.setDept_cd(dept_cd);
    dm.setDty_cd(dty_cd);
    dm.setPosi_cd(posi_cd);
    dm.setSeq(seq);
    dm.setOccr_dt(occr_dt);
    dm.setMedi_cd(medi_cd);
    dm.setDtl_medi_cd(dtl_medi_cd);
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_1003_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1004_a(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1004_ADataSet ds = null;
    HD_COST_1004_ADM dm = new HD_COST_1004_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    String[] converted = convertMultiUpdateData(multiUpdateData);

    String mode = converted[0];
    String slip_proc_mang_dt = converted[18];
    String slip_proc_mang_seq = converted[19];

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.setMode(mode.toUpperCase());
    dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
    dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    ds = (HD_COST_1004_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1100_LDataSet ds = null;
    HD_COST_1100_LDM dm = new HD_COST_1100_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
    dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
    dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
    dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
    dm.emp_no = Util.checkString(req.getParameter("emp_no"));
    dm.src_real_fee_cd = Util.checkString(req.getParameter("src_real_fee_cd"));

    dm.print();

    ds = (HD_COST_1100_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1101_ADataSet ds = null;
    HD_COST_1101_ADM dm = new HD_COST_1101_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    String[] converted = convertMultiUpdateData(multiUpdateData);

    String mode = converted[0];
    String emp_no = converted[3];
    String flnm = converted[4];
    String subj_sel_dt = converted[8];
    String real_fee_subj_sel_cd = converted[9];
    String itme_seq = converted[10];
    String real_fee_subj_sel_fee = converted[11];
    String subj_sel_ptcr = converted[12];
    String dept_cd = converted[19];
    String dty_cd = converted[20];
    String posi_cd = converted[21];
    String seq = converted[22];
    String occr_dt = converted[23];
    String medi_cd = converted[13];
    String dtl_medi_cd = converted[14];

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.setMode(mode.toUpperCase());
    dm.setEmp_no(emp_no);
    dm.setFlnm(flnm);
    dm.setSubj_sel_dt(subj_sel_dt);
    dm.setReal_fee_subj_sel_cd(real_fee_subj_sel_cd);
    dm.setItme_seq(itme_seq);
    dm.setReal_fee_subj_sel_fee(real_fee_subj_sel_fee);
    dm.setSubj_sel_ptcr(subj_sel_ptcr);
    dm.setDept_cd(dept_cd);
    dm.setDty_cd(dty_cd);
    dm.setPosi_cd(posi_cd);
    dm.setSeq(seq);
    dm.setOccr_dt(occr_dt);
    dm.setMedi_cd(medi_cd);
    dm.setDtl_medi_cd(dtl_medi_cd);
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    ds = (HD_COST_1101_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1102_LDataSet ds = null;
    HD_COST_1102_LDM dm = new HD_COST_1102_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
    dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
    dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

    dm.print();

    ds = (HD_COST_1102_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1103_ADataSet ds = null;
    HD_COST_1103_ADM dm = new HD_COST_1103_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    String incmg_pers_ipadd = req.getRemoteAddr();
    dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
    dm.setSs_emp_no(ss_emp_no);
    dm.setCmpy_cd(cmpy_cd);

    String mode = (String)hash.get("m");
    String emp_no = (String)hash.get("emp_no");
    String real_fee_subj_sel_fee = (String)hash.get("real_fee_subj_sel_fee");
    String subj_sel_dt = (String)hash.get("subj_sel_dt");
    String flnm = (String)hash.get("flnm");
    String dept_cd = (String)hash.get("dept_cd");
    String slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
    String slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
    String medi_cd = (String)hash.get("medi_cd");
    String dtl_medi_cd = (String)hash.get("dtl_medi_cd");

    dm.setMode(mode.toUpperCase());
    dm.setEmp_no(emp_no);
    dm.setReal_fee_subj_sel_fee(real_fee_subj_sel_fee);
    dm.setSubj_sel_dt(subj_sel_dt);
    dm.setFlnm(flnm);
    dm.setDept_cd(dept_cd);
    dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
    dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
    dm.setMedi_cd(medi_cd);
    dm.setDtls_medi_cd(dtl_medi_cd);

    String s_mode = (String)hash1.get("m");
    String tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
    String titl = Util.checkString(req.getParameter("titl"));

    dm.setS_mode(s_mode.toUpperCase());
    dm.setTmp_crdt_amt(tmp_crdt_amt);
    dm.setTitl(titl);

    dm.print();

    ds = (HD_COST_1103_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1104_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1104_DDataSet ds = null;
    HD_COST_1104_DDM dm = new HD_COST_1104_DDM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    String[] converted = convertMultiUpdateData(multiUpdateData);

    String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    String incmg_pers_ipadd = req.getRemoteAddr();
    dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
    dm.setSs_emp_no(ss_emp_no);
    dm.setCmpy_cd(cmpy_cd);

    String mode = converted[0];
    String slip_proc_mang_dt = converted[25];
    String slip_proc_mang_seq = converted[26];

    dm.setMode(mode.toUpperCase());
    dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
    dm.setSlip_proc_mang_seq(slip_proc_mang_seq);

    String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    String slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
    String slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));

    dm.setSlip_seq(slip_seq);
    dm.setSlip_occr_dt(slip_occr_dt);
    dm.setSlip_clsf_cd(slip_clsf_cd);
    dm.setSlip_incmg_pers(slip_incmg_pers);
    dm.setSlip_incmg_pers_ipadd(slip_incmg_pers_ipadd);

    dm.print();

    ds = (HD_COST_1104_DDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1200_LDataSet ds = null;
    HD_COST_1200_LDM dm = new HD_COST_1200_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.corp_card_clsf = Util.checkString(req.getParameter("corp_card_clsf"));
    dm.emp_no = Util.checkString(req.getParameter("emp_no"));
    dm.hd_card_type = Util.checkString(req.getParameter("hd_card_type"));

    dm.print();

    ds = (HD_COST_1200_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1201_LDataSet ds = null;
    HD_COST_1201_LDM dm = new HD_COST_1201_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    ds = (HD_COST_1201_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1202_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1202_ADataSet ds = null;
    HD_COST_1202_ADM dm = new HD_COST_1202_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.card_mang_no = ((String)hash.get("card_mang_no"));
    dm.hd_card_type = ((String)hash.get("hd_card_type"));
    dm.hd_card_stat = ((String)hash.get("hd_card_stat"));
    dm.hd_mang_clsf = ((String)hash.get("hd_mang_clsf"));
    dm.hd_mang_dty_nm = ((String)hash.get("hd_mang_dty_nm"));
    dm.hd_oil_type = ((String)hash.get("hd_oil_type"));
    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_1202_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    System.out.print("¹Ùº¸¾ß ");
    HD_COST_1300_LDataSet ds = null;
    HD_COST_1300_LDM dm = new HD_COST_1300_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.print();

    ds = (HD_COST_1300_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1301_LDataSet ds = null;
    HD_COST_1301_LDM dm = new HD_COST_1301_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.card_no = Util.checkString(req.getParameter("card_no"));

    dm.print();

    ds = (HD_COST_1301_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1302_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1302_ADataSet ds = null;
    HD_COST_1302_ADM dm = new HD_COST_1302_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.flnm = ((String)hash.get("flnm"));
    dm.card_no = ((String)hash.get("card_no"));
    dm.decid_dt = ((String)hash.get("decid_dt"));
    dm.deal_dt = ((String)hash.get("deal_dt"));
    dm.deal_amt = ((String)hash.get("deal_amt"));
    dm.use_plac = ((String)hash.get("use_plac"));
    dm.dept_cd = ((String)hash.get("dept_cd"));
    dm.dty_cd = ((String)hash.get("dty_cd"));
    dm.posi_cd = ((String)hash.get("posi_cd"));
    dm.seq = ((String)hash.get("seq"));
    dm.occr_dt = ((String)hash.get("occr_dt"));
    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_1302_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1303_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1303_LDataSet ds = null;
    HD_COST_1303_LDM dm = new HD_COST_1303_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.card_type = Util.checkString(req.getParameter("card_type"));
    dm.decid_yymm = Util.checkString(req.getParameter("decid_yymm"));
    dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
    dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
    dm.emp_no = Util.checkString(req.getParameter("emp_no"));
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    dm.print();

    ds = (HD_COST_1303_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1400_LDataSet ds = null;
    HD_COST_1400_LDM dm = new HD_COST_1400_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.card_type = Util.checkString(req.getParameter("card_type"));
    dm.decid_yymm = Util.checkString(req.getParameter("decid_yymm"));
    dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
    dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
    dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    dm.print();

    ds = (HD_COST_1400_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1401_LDataSet ds = null;
    HD_COST_1401_LDM dm = new HD_COST_1401_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.card_type = Util.checkString(req.getParameter("card_type"));
    dm.decid_yymm = Util.checkString(req.getParameter("decid_yymm"));
    dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
    dm.emp_no = Util.checkString(req.getParameter("emp_no"));

    ds = (HD_COST_1401_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1402_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1402_ADataSet ds = null;
    HD_COST_1402_ADM dm = new HD_COST_1402_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.card_no = ((String)hash.get("card_no"));
    dm.remk_2 = ((String)hash.get("remk_2"));
    dm.seq = ((String)hash.get("seq"));
    dm.occr_dt = ((String)hash.get("occr_dt"));
    dm.use_type = ((String)hash.get("use_type"));
    dm.medi_cd = ((String)hash.get("medi_cd"));
    dm.dtls_medi_cd = ((String)hash.get("dtls_medi_cd"));
    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.print();

    ds = (HD_COST_1402_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1403_a(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1403_ADataSet ds = null;
    HD_COST_1403_ADM dm = new HD_COST_1403_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.card_type = ((String)hash.get("card_type"));
    dm.decid_yymm = ((String)hash.get("decid_yymm"));
    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.connect_ip = req.getRemoteAddr();
    dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
    dm.print();

    ds = (HD_COST_1403_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1404_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1404_MDataSet ds = null;
    HD_COST_1404_MDM dm = new HD_COST_1404_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    ds = (HD_COST_1404_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1500_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1500_ADataSet ds = null;
    HD_COST_1500_ADM dm = new HD_COST_1500_ADM();

    String multiUpdateData1 = Util.checkString(req.getParameter("multiUpDate1"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    String multiUpdateData2 = Util.checkString(req.getParameter("multiUpDate2"));
    Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.mode_tm = ((String)hash1.get("m")).toUpperCase();
    dm.emp_no_tm = ((String)hash1.get("emp_no"));
    dm.remk_1_tm = ((String)hash1.get("remk_1"));
    dm.decid_yymm_tm = ((String)hash1.get("decid_yymm"));

    dm.mode = ((String)hash2.get("m")).toUpperCase();
    dm.emp_no = ((String)hash2.get("emp_no"));
    dm.card_no = ((String)hash2.get("card_no"));
    dm.remk_2 = ((String)hash2.get("remk_2"));
    dm.seq = ((String)hash2.get("seq"));
    dm.occr_dt = ((String)hash2.get("occr_dt"));
    dm.use_type = ((String)hash2.get("use_type"));
    dm.medi_cd = ((String)hash2.get("medi_cd"));
    dm.dtls_medi_cd = ((String)hash2.get("dtls_medi_cd"));
    
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_1500_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1501_l(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1501_LDataSet ds = null;
    HD_COST_1501_LDM dm = new HD_COST_1501_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.card_type = Util.checkString(req.getParameter("card_type"));
    dm.decid_yymm = Util.checkString(req.getParameter("decid_yymm"));
    dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
    dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

    dm.print();

    ds = (HD_COST_1501_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1502_a(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1502_ADataSet ds = null;
    HD_COST_1502_ADM dm = new HD_COST_1502_ADM();

    String multiUpdateData1 = Util.checkString(req.getParameter("multiUpDate1"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    String multiUpdateData3 = Util.checkString(req.getParameter("multiUpDate3"));
    Hashtable hash2 = getHashMultiUpdateData(multiUpdateData3);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
    dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));

    dm.s_mode = ((String)hash2.get("m")).toUpperCase();
    dm.tmp_dr_amt = ((String)hash2.get("tmp_dr_amt"));
    dm.flnm = ((String)hash2.get("flnm"));
    dm.dept_cd = ((String)hash2.get("dept_cd"));
    dm.card_mang_no = ((String)hash2.get("card_mang_no"));
    dm.use_type = ((String)hash2.get("use_type"));
    dm.medi_cd = ((String)hash2.get("medi_cd"));
    dm.dtls_medi_cd = ((String)hash2.get("dtls_medi_cd"));

    dm.card_type = Util.checkString(req.getParameter("card_type"));
    dm.tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
    dm.titl = Util.checkString(req.getParameter("titl"));
    dm.titl2 = Util.checkString(req.getParameter("titl2"));

    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_1502_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1503_d(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1503_DDataSet ds = null;
    HD_COST_1503_DDM dm = new HD_COST_1503_DDM();

    String multiUpdateData1 = Util.checkString(req.getParameter("multiUpDate1"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash1.get("m")).toUpperCase();
    dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
    dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));

    dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
    dm.slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
    dm.slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));

    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_1503_DDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1506_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1506_MDataSet ds = null;
    HD_COST_1506_MDM dm = new HD_COST_1506_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    dm.print();
    ds = (HD_COST_1506_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1600_LDataSet ds = null;
    HD_COST_1600_LDM dm = new HD_COST_1600_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.decid_yymm_fr = Util.checkString(req.getParameter("decid_yymm_fr"));
    dm.decid_yymm_to = Util.checkString(req.getParameter("decid_yymm_to"));
    dm.hd_mang_clsf = Util.checkString(req.getParameter("hd_mang_clsf"));
    dm.hd_card_type = Util.checkString(req.getParameter("card_type"));
    dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
    dm.emp_no = Util.checkString(req.getParameter("emp_no"));

    dm.print();

    ds = (HD_COST_1600_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }
  
  public void hd_cost_1700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
	    DBManager manager = new DBManager("MISHDL");

	    HD_COST_1700_LDataSet ds = null;
	    HD_COST_1700_LDM dm = new HD_COST_1700_LDM();

	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.decid_yymm = Util.checkString(req.getParameter("decid_yymm"));
	    dm.print();

	    ds = (HD_COST_1700_LDataSet)manager.executeCall(dm);

	    if (!"".equals(ds.errcode)) {
	      System.out.println("DAO..error.");
	      throw new AppException(ds.errcode, ds.errmsg);
	    }

	    req.setAttribute("ds", ds);
	  }
  
  public void hd_cost_1006_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1006_ADataSet ds = null;
    HD_COST_1006_ADM dm = new HD_COST_1006_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.occr_dt = ((String)hash.get("occr_dt"));
    dm.seq = ((String)hash.get("seq"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_1006_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1007_LDataSet ds = null;
    HD_COST_1007_LDM dm = new HD_COST_1007_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
    dm.seq = Util.checkString(req.getParameter("seq"));

    dm.print();

    ds = (HD_COST_1007_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1008_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1008_MDataSet ds = null;
    HD_COST_1008_MDM dm = new HD_COST_1008_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    ds = (HD_COST_1008_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1009_m(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1009_MDataSet ds = null;
    HD_COST_1009_MDM dm = new HD_COST_1009_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

    ds = (HD_COST_1009_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1105_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1105_ADataSet ds = null;
    HD_COST_1105_ADM dm = new HD_COST_1105_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.aplc_dt = ((String)hash.get("aplc_dt"));
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.slip_proc_seq = ((String)hash.get("slip_proc_seq"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_1105_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1106_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1106_ADataSet ds = null;
    HD_COST_1106_ADM dm = new HD_COST_1106_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.aplc_dt = ((String)hash.get("aplc_dt"));
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.slip_proc_seq = ((String)hash.get("slip_proc_seq"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_1106_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1108_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");
    HD_COST_1108_ADataSet ds = null;
    HD_COST_1108_ADM dm = new HD_COST_1108_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.aplc_dt = ((String)hash.get("occr_dt"));
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.slip_proc_seq = ((String)hash.get("slip_proc_seq"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_1108_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_1109_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_1109_MDataSet ds = null;
    HD_COST_1109_MDM dm = new HD_COST_1109_MDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    ds = (HD_COST_1109_MDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_2002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_2002_LDataSet ds = null;
    HD_COST_2002_LDM dm = new HD_COST_2002_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
    dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
    dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

    dm.print();

    ds = (HD_COST_2002_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_2003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_2003_ADataSet ds = null;
    HD_COST_2003_ADM dm = new HD_COST_2003_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    String[] converted = convertMultiUpdateData(multiUpdateData);

    String mode = converted[0];
    String emp_no = converted[3];
    String flnm = converted[4];
    String subj_sel_dt = converted[7];
    String subj_sel_nm = converted[8];
    String itme_seq = converted[9];
    String cmr_man_nm = converted[10];
    String cmr_asst_man_nm = converted[11];
    String drvr_nm = converted[12];
    String etc = converted[13];
    String tot_nops = converted[14];
    String tot_amt = converted[15];
    String proc_amt = converted[16];
    String dept_cd = converted[20];
    String dty_cd = converted[21];
    String posi_cd = converted[22];
    String seq = converted[23];
    String occr_dt = converted[24];
    String medi_cd = converted[17];
    String dtl_medi_cd = converted[18];

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.setMode(mode.toUpperCase());
    dm.setEmp_no(emp_no);
    dm.setFlnm(flnm);
    dm.setSubj_sel_dt(subj_sel_dt);
    dm.setSubj_sel_nm(subj_sel_nm);
    dm.setItme_seq(itme_seq);
    dm.setCmr_man_nm(cmr_man_nm);
    dm.setCmr_asst_man_nm(cmr_asst_man_nm);
    dm.setDrvr_nm(drvr_nm);
    dm.setEtc(etc);
    dm.setTot_nops(tot_nops);
    dm.setTot_amt(tot_amt);
    dm.setProc_amt(proc_amt);
    dm.setDept_cd(dept_cd);
    dm.setDty_cd(dty_cd);
    dm.setPosi_cd(posi_cd);
    dm.setSeq(seq);
    dm.setOccr_dt(occr_dt);
    dm.setMedi_cd(medi_cd);
    dm.setDtl_medi_cd(dtl_medi_cd);
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_2003_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_2006_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_2006_ADataSet ds = null;
    HD_COST_2006_ADM dm = new HD_COST_2006_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.occr_dt = ((String)hash.get("occr_dt"));
    dm.seq = ((String)hash.get("seq"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_2006_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_2007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_2007_LDataSet ds = null;
    HD_COST_2007_LDM dm = new HD_COST_2007_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
    dm.seq = Util.checkString(req.getParameter("seq"));

    dm.print();

    ds = (HD_COST_2007_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_2100_LDataSet ds = null;
    HD_COST_2100_LDM dm = new HD_COST_2100_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_fr_dt = Util.checkString(req.getParameter("occr_fr_dt"));
    dm.occr_to_dt = Util.checkString(req.getParameter("occr_to_dt"));
    dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
    dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

    dm.print();

    ds = (HD_COST_2100_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_2101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_2101_ADataSet ds = null;
    HD_COST_2101_ADM dm = new HD_COST_2101_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    String[] converted = convertMultiUpdateData(multiUpdateData);

    String mode = converted[0];
    String emp_no = converted[3];
    String flnm = converted[4];
    String subj_sel_dt = converted[8];
    String subj_sel_nm = converted[9];
    String itme_seq = converted[10];
    String cmr_man_nm = converted[11];
    String cmr_asst_man_nm = converted[12];
    String drvr_nm = converted[13];
    String etc = converted[14];
    String tot_nops = converted[15];
    String tot_amt = converted[16];
    String proc_amt = converted[17];
    String dept_cd = converted[24];
    String dty_cd = converted[25];
    String posi_cd = converted[26];
    String seq = converted[27];
    String occr_dt = converted[28];
    String medi_cd = converted[18];
    String dtl_medi_cd = converted[19];

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.setMode(mode.toUpperCase());
    dm.setEmp_no(emp_no);
    dm.setFlnm(flnm);
    dm.setSubj_sel_dt(subj_sel_dt);
    dm.setSubj_sel_nm(subj_sel_nm);
    dm.setItme_seq(itme_seq);
    dm.setCmr_man_nm(cmr_man_nm);
    dm.setCmr_asst_man_nm(cmr_asst_man_nm);
    dm.setDrvr_nm(drvr_nm);
    dm.setEtc(etc);
    dm.setTot_nops(tot_nops);
    dm.setTot_amt(tot_amt);
    dm.setProc_amt(proc_amt);
    dm.setDept_cd(dept_cd);
    dm.setDty_cd(dty_cd);
    dm.setPosi_cd(posi_cd);
    dm.setSeq(seq);
    dm.setOccr_dt(occr_dt);
    dm.setMedi_cd(medi_cd);
    dm.setDtl_medi_cd(dtl_medi_cd);
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    ds = (HD_COST_2101_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_2102_l(HttpServletRequest req, HttpServletResponse res) throws AppException
  {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_2102_LDataSet ds = null;
    HD_COST_2102_LDM dm = new HD_COST_2102_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
    dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
    dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

    dm.print();

    ds = (HD_COST_2102_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_2103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_2103_ADataSet ds = null;
    HD_COST_2103_ADM dm = new HD_COST_2103_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    String incmg_pers_ipadd = req.getRemoteAddr();
    dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
    dm.setSs_emp_no(ss_emp_no);
    dm.setCmpy_cd(cmpy_cd);

    String mode = (String)hash.get("m");
    String emp_no = (String)hash.get("emp_no");
    String proc_amt = (String)hash.get("proc_amt");
    String subj_sel_dt = (String)hash.get("subj_sel_dt");
    String flnm = (String)hash.get("flnm");
    String dept_cd = (String)hash.get("dept_cd");
    String slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
    String slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
    String medi_cd = (String)hash.get("medi_cd");
    String dtl_medi_cd = (String)hash.get("dtl_medi_cd");

    dm.setMode(mode.toUpperCase());
    dm.setEmp_no(emp_no);
    dm.setProc_amt(proc_amt);
    dm.setSubj_sel_dt(subj_sel_dt);
    dm.setFlnm(flnm);
    dm.setDept_cd(dept_cd);
    dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
    dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
    dm.setMedi_cd(medi_cd);
    dm.setDtls_medi_cd(dtl_medi_cd);

    String s_mode = (String)hash1.get("m");
    String tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
    String titl = Util.checkString(req.getParameter("titl"));

    dm.setS_mode(s_mode.toUpperCase());
    dm.setTmp_crdt_amt(tmp_crdt_amt);
    dm.setTitl(titl);

    dm.print();

    ds = (HD_COST_2103_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_2104_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_2104_DDataSet ds = null;
    HD_COST_2104_DDM dm = new HD_COST_2104_DDM();
    System.out.println("aution1");
    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    System.out.println("aution2");
    String[] converted = convertMultiUpdateData(multiUpdateData);
    System.out.println("aution3");
    String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    String incmg_pers_ipadd = req.getRemoteAddr();
    dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
    dm.setSs_emp_no(ss_emp_no);
    dm.setCmpy_cd(cmpy_cd);
    System.out.println("aution4");
    String mode = (String)hash.get("m");
    String slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
    String slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");

    dm.setMode(mode.toUpperCase());
    dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
    dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
    System.out.println("aution6");
    String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    String slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
    String slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));
    System.out.println("aution7");
    dm.setSlip_seq(slip_seq);
    dm.setSlip_occr_dt(slip_occr_dt);
    dm.setSlip_clsf_cd(slip_clsf_cd);
    dm.setSlip_incmg_pers(slip_incmg_pers);
    dm.setSlip_incmg_pers_ipadd(slip_incmg_pers_ipadd);

    dm.print();

    ds = (HD_COST_2104_DDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_2108_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");
    HD_COST_2108_ADataSet ds = null;
    HD_COST_2108_ADM dm = new HD_COST_2108_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.aplc_dt = ((String)hash.get("occr_dt"));
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.slip_proc_seq = ((String)hash.get("slip_proc_seq"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_2108_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_3002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_3002_LDataSet ds = null;
    HD_COST_3002_LDM dm = new HD_COST_3002_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
    dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
    dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

    dm.print();

    ds = (HD_COST_3002_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_3003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_3003_ADataSet ds = null;
    HD_COST_3003_ADM dm = new HD_COST_3003_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.flnm = ((String)hash.get("flnm"));
    dm.duty_dt = ((String)hash.get("duty_dt"));
    dm.item_cd = ((String)hash.get("item_cd"));
    dm.prsnt_tm = ((String)hash.get("prsnt_tm"));
    dm.finish_tm = ((String)hash.get("finish_tm"));
    dm.finish_dd_clsf = ((String)hash.get("finish_dd_clsf"));
    dm.cont = ((String)hash.get("cont"));
    dm.pay_cost = ((String)hash.get("pay_cost"));
    dm.dept_cd = ((String)hash.get("dept_cd"));
    dm.dty_cd = ((String)hash.get("dty_cd"));
    dm.posi_cd = ((String)hash.get("posi_cd"));
    dm.occr_dt = ((String)hash.get("occr_dt"));
    dm.seq = ((String)hash.get("seq"));
    dm.medi_cd = ((String)hash.get("medi_cd"));
    dm.dtl_medi_cd = ((String)hash.get("dtl_medi_cd"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_3003_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_3006_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_3006_ADataSet ds = null;
    HD_COST_3006_ADM dm = new HD_COST_3006_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.occr_dt = ((String)hash.get("occr_dt"));
    dm.seq = ((String)hash.get("seq"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_3006_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_3100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_3100_LDataSet ds = null;
    HD_COST_3100_LDM dm = new HD_COST_3100_LDM();

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.occr_fr_dt = Util.checkString(req.getParameter("occr_fr_dt"));
    dm.occr_to_dt = Util.checkString(req.getParameter("occr_to_dt"));
    dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
    dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

    dm.print();

    ds = (HD_COST_3100_LDataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_3101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_3101_ADataSet ds = null;
    HD_COST_3101_ADM dm = new HD_COST_3101_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.flnm = ((String)hash.get("flnm"));
    dm.duty_dt = ((String)hash.get("duty_dt"));
    dm.item_cd = ((String)hash.get("item_cd"));
    dm.prsnt_tm = ((String)hash.get("prsnt_tm"));
    dm.finish_tm = ((String)hash.get("finish_tm"));
    dm.finish_dd_clsf = ((String)hash.get("finish_dd_clsf"));
    dm.cont = ((String)hash.get("cont"));
    dm.pay_cost = ((String)hash.get("pay_cost"));
    dm.dept_cd = ((String)hash.get("dept_cd"));
    dm.dty_cd = ((String)hash.get("dty_cd"));
    dm.posi_cd = ((String)hash.get("posi_cd"));
    dm.occr_dt = ((String)hash.get("occr_dt"));
    dm.seq = ((String)hash.get("seq"));
    dm.medi_cd = ((String)hash.get("medi_cd"));
    dm.dtl_medi_cd = ((String)hash.get("dtl_medi_cd"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();
    ds = (HD_COST_3101_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_3103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_3103_ADataSet ds = null;
    HD_COST_3103_ADM dm = new HD_COST_3103_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
    Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

    String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
    String incmg_pers_ipadd = req.getRemoteAddr();
    dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
    dm.setSs_emp_no(ss_emp_no);
    dm.setCmpy_cd(cmpy_cd);

    String mode = (String)hash.get("m");
    String emp_no = (String)hash.get("emp_no");
    String pay_cost = (String)hash.get("pay_cost");
    String duty_dt = (String)hash.get("duty_dt");
    String flnm = (String)hash.get("flnm");
    String dept_cd = (String)hash.get("dept_cd");
    String slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
    String slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
    String medi_cd = (String)hash.get("medi_cd");
    String dtl_medi_cd = (String)hash.get("dtl_medi_cd");

    dm.setMode(mode.toUpperCase());
    dm.setEmp_no(emp_no);
    dm.setPay_cost(pay_cost);
    dm.setDuty_dt(duty_dt);
    dm.setFlnm(flnm);
    dm.setDept_cd(dept_cd);
    dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
    dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
    dm.setMedi_cd(medi_cd);
    dm.setDtls_medi_cd(dtl_medi_cd);

    String s_mode = (String)hash1.get("m");
    String tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
    String titl = Util.checkString(req.getParameter("titl"));

    dm.setS_mode(s_mode.toUpperCase());
    dm.setTmp_crdt_amt(tmp_crdt_amt);
    dm.setTitl(titl);

    dm.print();

    ds = (HD_COST_3103_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_3105_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_3105_ADataSet ds = null;
    HD_COST_3105_ADM dm = new HD_COST_3105_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.aplc_dt = ((String)hash.get("aplc_dt"));
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.slip_proc_seq = ((String)hash.get("slip_proc_seq"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_3105_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_3106_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");

    HD_COST_3106_ADataSet ds = null;
    HD_COST_3106_ADM dm = new HD_COST_3106_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.aplc_dt = ((String)hash.get("aplc_dt"));
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.slip_proc_seq = ((String)hash.get("slip_proc_seq"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_3106_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }

  public void hd_cost_3108_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    DBManager manager = new DBManager("MISHDL");
    HD_COST_3108_ADataSet ds = null;
    HD_COST_3108_ADM dm = new HD_COST_3108_ADM();

    String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    dm.mode = ((String)hash.get("m")).toUpperCase();
    dm.aplc_dt = ((String)hash.get("occr_dt"));
    dm.emp_no = ((String)hash.get("emp_no"));
    dm.slip_proc_seq = ((String)hash.get("slip_proc_seq"));
    dm.incmg_pers_ipadd = req.getRemoteAddr();
    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

    dm.print();

    ds = (HD_COST_3108_ADataSet)manager.executeCall(dm);

    if (!"".equals(ds.errcode)) {
      System.out.println("DAO..error.");
      throw new AppException(ds.errcode, ds.errmsg);
    }

    req.setAttribute("ds", ds);
  }
}