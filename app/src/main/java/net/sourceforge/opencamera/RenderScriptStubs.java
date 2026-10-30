package net.sourceforge.opencamera;

import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;

public class RenderScriptStubs {
    // Container class
}

class ScriptC_process_hdr extends ScriptC {
    public ScriptC_process_hdr(RenderScript rs) {
        super(0, rs);
    }
    public void set_bitmap0(Allocation v) {}
    public void set_bitmap1(Allocation v) {}
    public void set_bitmap2(Allocation v) {}
    public void set_bitmap3(Allocation v) {}
    public void set_bitmap4(Allocation v) {}
    public void set_bitmap5(Allocation v) {}
    public void set_bitmap6(Allocation v) {}
    public void set_offset_x0(int v) {}
    public void set_offset_y0(int v) {}
    public void set_offset_x1(int v) {}
    public void set_offset_y1(int v) {}
    public void set_offset_x2(int v) {}
    public void set_offset_y2(int v) {}
    public void set_offset_x3(int v) {}
    public void set_offset_y3(int v) {}
    public void set_offset_x4(int v) {}
    public void set_offset_y4(int v) {}
    public void set_offset_x5(int v) {}
    public void set_offset_y5(int v) {}
    public void set_offset_x6(int v) {}
    public void set_offset_y6(int v) {}
    public void set_parameter_A0(float v) {}
    public void set_parameter_B0(float v) {}
    public void set_parameter_A1(float v) {}
    public void set_parameter_B1(float v) {}
    public void set_parameter_A2(float v) {}
    public void set_parameter_B2(float v) {}
    public void set_parameter_A3(float v) {}
    public void set_parameter_B3(float v) {}
    public void set_parameter_A4(float v) {}
    public void set_parameter_B4(float v) {}
    public void set_parameter_A5(float v) {}
    public void set_parameter_B5(float v) {}
    public void set_parameter_A6(float v) {}
    public void set_parameter_B6(float v) {}
    public int get_tonemap_algorithm_clamp_c() { return 0; }
    public int get_tonemap_algorithm_exponential_c() { return 1; }
    public int get_tonemap_algorithm_reinhard_c() { return 2; }
    public int get_tonemap_algorithm_filmic_c() { return 3; }
    public int get_tonemap_algorithm_aces_c() { return 4; }
    public void set_tonemap_algorithm(int v) {}
    public void set_tonemap_scale(float v) {}
    public float get_exposure() { return 1.0f; }
    public void set_linear_scale(float v) {}
    public float get_filmic_exposure_bias() { return 0.0f; }
    public void set_W(float v) {}
    public void set_n_bitmaps_g(int v) {}
    public void forEach_hdr_n(Allocation a0, Allocation a1) {}
    public void forEach_hdr(Allocation a0, Allocation a1) {}
}

class ScriptC_process_avg extends ScriptC {
    public ScriptC_process_avg(RenderScript rs) {
        super(0, rs);
    }
    public void forEach_convert_to_f(Allocation a0, Allocation a1) {}
    public void set_bitmap_new(Allocation v) {}
    public void set_offset_x_new(int v) {}
    public void set_offset_y_new(int v) {}
    public void set_avg_factor(float v) {}
    public void set_wiener_C(float v) {}
    public void forEach_avg(Allocation a0, Allocation a1) {}
    public void forEach_avg_f(Allocation a0, Allocation a1) {}
    public void set_bitmap1(Allocation v) {}
    public void set_bitmap2(Allocation v) {}
    public void set_bitmap3(Allocation v) {}
    public void set_bitmap4(Allocation v) {}
    public void set_bitmap5(Allocation v) {}
    public void set_bitmap6(Allocation v) {}
    public void set_bitmap7(Allocation v) {}
    public void forEach_avg_multi(Allocation a0, Allocation a1) {}
}

class ScriptC_create_mtb extends ScriptC {
    public ScriptC_create_mtb(RenderScript rs) {
        super(0, rs);
    }
    public void set_median_value(int v) {}
    public void set_start_x(int v) {}
    public void set_start_y(int v) {}
    public void set_out_bitmap(Allocation v) {}
    public void forEach_create_mtb(Allocation a, Script.LaunchOptions opt) {}
    public void forEach_create_greyscale_f(Allocation a, Script.LaunchOptions opt) {}
    public void forEach_create_greyscale(Allocation a, Script.LaunchOptions opt) {}
}

class ScriptC_align_mtb extends ScriptC {
    public ScriptC_align_mtb(RenderScript rs) {
        super(0, rs);
    }
    public void set_bitmap0(Allocation v) {}
    public void set_bitmap1(Allocation v) {}
    public void set_off_x(int v) {}
    public void set_off_y(int v) {}
    public void set_step_size(int v) {}
    public void bind_errors(Allocation v) {}
    public void invoke_init_errors() {}
    public void forEach_align_mtb(Allocation a, Script.LaunchOptions opt) {}
    public void forEach_align(Allocation a, Script.LaunchOptions opt) {}
}

class ScriptC_histogram_adjust extends ScriptC {
    public ScriptC_histogram_adjust(RenderScript rs) {
        super(0, rs);
    }
    public void set_c_histogram(Allocation v) {}
    public void set_hdr_alpha(float v) {}
    public void set_n_tiles(int v) {}
    public void set_width(int v) {}
    public void set_height(int v) {}
    public void forEach_histogram_adjust(Allocation a0, Allocation a1) {}
}

class ScriptC_histogram_compute extends ScriptC {
    public ScriptC_histogram_compute(RenderScript rs) {
        super(0, rs);
    }
    public void bind_histogram(Allocation v) {}
    public void invoke_init_histogram() {}
    public void forEach_histogram_compute(Allocation a, Script.LaunchOptions opt) {}
    public void forEach_histogram_compute(Allocation a) {}
    public void forEach_histogram_compute_avg_f(Allocation a) {}
    public void forEach_histogram_compute_avg(Allocation a) {}
    public void forEach_histogram_compute_f(Allocation a) {}
}

class ScriptC_avg_brighten extends ScriptC {
    public ScriptC_avg_brighten(RenderScript rs) {
        super(0, rs);
    }
    public void set_bitmap(Allocation v) {}
    public void invoke_setBlackLevel(float v) {}
    public void set_gamma(float v) {}
    public void set_gain(float v) {}
    public void set_tonemap_scale(float v) {}
    public void set_linear_scale(float v) {}
    public void forEach_avg_brighten_f(Allocation a0, Allocation a1) {}
}

class ScriptC_calculate_sharpness extends ScriptC {
    public ScriptC_calculate_sharpness(RenderScript rs) {
        super(0, rs);
    }
    public void bind_sums(Allocation v) {}
    public void set_bitmap(Allocation v) {}
    public void set_width(int v) {}
    public void invoke_init_sums() {}
    public void forEach_calculate_sharpness(Allocation a) {}
}
