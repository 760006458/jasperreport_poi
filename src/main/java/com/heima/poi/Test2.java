package com.heima.poi;

/**
 * xuan
 * 2018/1/19
 */
public class Test2 {
    /*public String exportXls() throws IOException {
        // 查询出 满足当前条件 结果数据
        List<WayBill> wayBills = wayBillService.findWayBills(model);

        // 生成Excel文件
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet sheet = hssfWorkbook.createSheet("运单数据");
        // 表头
        HSSFRow headRow = sheet.createRow(0);
        headRow.createCell(0).setCellValue("运单号");
        headRow.createCell(1).setCellValue("寄件人");
        headRow.createCell(2).setCellValue("寄件人电话");
        headRow.createCell(3).setCellValue("寄件人地址");
        headRow.createCell(4).setCellValue("收件人");
        headRow.createCell(5).setCellValue("收件人电话");
        headRow.createCell(6).setCellValue("收件人地址");
        // 表格数据
        for (WayBill wayBill : wayBills) {
            HSSFRow dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
            dataRow.createCell(0).setCellValue(wayBill.getWayBillNum());
            dataRow.createCell(1).setCellValue(wayBill.getSendName());
            dataRow.createCell(2).setCellValue(wayBill.getSendMobile());
            dataRow.createCell(3).setCellValue(wayBill.getSendAddress());
            dataRow.createCell(4).setCellValue(wayBill.getRecName());
            dataRow.createCell(5).setCellValue(wayBill.getRecMobile());
            dataRow.createCell(6).setCellValue(wayBill.getRecAddress());
        }

        // 下载导出
        // 设置头信息
        ServletActionContext.getResponse().setContentType(
                "application/vnd.ms-excel");
        String filename = "运单数据.xls";
        String agent = ServletActionContext.getRequest()
                .getHeader("user-agent");
        filename = FileUtils.encodeDownloadFilename(filename, agent);
        ServletActionContext.getResponse().setHeader("Content-Disposition",
                "attachment;filename=" + filename);

        ServletOutputStream outputStream = ServletActionContext.getResponse()
                .getOutputStream();
        hssfWorkbook.write(outputStream);

        // 关闭
        hssfWorkbook.close();

        return NONE;
    }*/
}
