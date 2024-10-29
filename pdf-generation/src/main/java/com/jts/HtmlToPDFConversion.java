package com.jts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;

public class HtmlToPDFConversion {

	public static void main(String[] args) throws FileNotFoundException {
		String htmlText = "<html><body><h1>Lorem Ipsum छपाई और अक्षर योजन उद्योग का एक साधारण डमी पाठ है. Lorem Ipsum सन १५०० के बाद से अभी तक इस उद्योग का मानक डमी पाठ मन गया, जब एक अज्ञात मुद्रक ने नमूना लेकर एक नमूना किताब बनाई. यह न केवल पाँच सदियों से जीवित रहा बल्कि इसने इलेक्ट्रॉनिक मीडिया में छलांग लगाने के बाद भी मूलतः अपरिवर्तित रहा. यह 1960 के दशक में Letraset Lorem Ipsum अंश युक्त पत्र के रिलीज के साथ लोकप्रिय हुआ, और हाल ही में Aldus PageMaker Lorem Ipsum के संस्करणों सहित तरह डेस्कटॉप प्रकाशन सॉफ्टवेयर के साथ अधिक प्रचलित हुआ.</h1></body></html>";
		
		String pdfDest = "output.pdf";
		
		ConverterProperties converterProperties = new ConverterProperties();
		converterProperties.setFontProvider(new DefaultFontProvider(true, true, true));
		
		HtmlConverter.convertToPdf(htmlText, new FileOutputStream(pdfDest), converterProperties);
		
		System.out.println("PDF created successfully.");
	}
}
