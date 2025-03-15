import Link from "next/link"
import { BarChart3, Award, Users, BookOpen, GraduationCap, Star, ArrowRight } from "lucide-react"
import { Button } from "@/components/ui/button"
import { Card, CardContent } from "@/components/ui/card"

export default function Home() {
  return (
    <div className="min-h-screen bg-black text-white">
      {/* Header */}
      <header className="container mx-auto px-4 py-6">
        <div className="flex items-center justify-between">
          <div className="flex items-center gap-2">
            <GraduationCap className="h-8 w-8 text-[#4ADE80]" />
            <span className="text-xl font-bold">Bright Sparks</span>
          </div>
          <div className="flex gap-4">
            <Button variant="ghost" className="text-white hover:text-[#4ADE80]">
              Log In
            </Button>
            <Button className="bg-[#4ADE80] text-black hover:bg-[#4ADE80]/90">Sign Up</Button>
          </div>
        </div>
      </header>

      {/* Hero Section */}
      <section className="relative overflow-hidden">
        <div className="container mx-auto px-4 py-20">
          <div className="relative z-10 max-w-4xl mx-auto text-center">
            <h1 className="text-6xl md:text-8xl font-black mb-6 tracking-tight leading-tight">
              IGNITE YOUR
              <br />
              POTENTIAL
            </h1>
            <p className="text-xl md:text-2xl text-gray-300 mb-8">
              Education in Jamaica shouldn't depend on which school you attend or who your teacher is.
              <br />
              Let's bridge the education gap—together.
            </p>
            <Button className="bg-[#4ADE80] text-black hover:bg-[#4ADE80]/90 text-lg px-8 py-6 h-auto">
              Join Bright Sparks
              <ArrowRight className="ml-2 h-5 w-5" />
            </Button>
            <p className="text-sm text-gray-400 mt-4">Free for students, teachers, and institutions across Jamaica.</p>
          </div>

          {/* Floating Elements */}
          <div className="absolute top-10 left-10 animate-float-slow">
            <div className="w-12 h-12 rotate-45 bg-[#4ADE80]/20 rounded-lg" />
          </div>
          <div className="absolute top-40 right-20 animate-float">
            <div className="w-8 h-8 rotate-12 bg-[#60A5FA]/20 rounded-lg" />
          </div>
          <div className="absolute bottom-20 left-1/4 animate-float-slow">
            <div className="w-10 h-10 rotate-45 bg-[#60A5FA]/20 rounded-lg" />
          </div>
        </div>
      </section>

      {/* Features Section */}
      <section className="container mx-auto px-4 py-20">
        <div className="grid grid-cols-1 md:grid-cols-4 gap-6">
          <Card className="bg-white/5 border-0">
            <CardContent className="p-6">
              <BarChart3 className="h-10 w-10 text-[#4ADE80] mb-4" />
              <h3 className="text-xl font-bold mb-2">Progress Tracking</h3>
              <p className="text-gray-400">
                Monitor your academic growth with real-time analytics and personalized insights
              </p>
            </CardContent>
          </Card>
          <Card className="bg-white/5 border-0">
            <CardContent className="p-6">
              <Award className="h-10 w-10 text-[#60A5FA] mb-4" />
              <h3 className="text-xl font-bold mb-2">Competitive Leaderboards</h3>
              <p className="text-gray-400">
                Motivate yourself through friendly competition and recognition of achievements
              </p>
            </CardContent>
          </Card>
          <Card className="bg-white/5 border-0">
            <CardContent className="p-6">
              <Users className="h-10 w-10 text-[#4ADE80] mb-4" />
              <h3 className="text-xl font-bold mb-2">Peer-Reviewed Assignments</h3>
              <p className="text-gray-400">Improve learning through collaborative feedback and assessment from peers</p>
            </CardContent>
          </Card>
          <Card className="bg-white/5 border-0">
            <CardContent className="p-6">
              <BookOpen className="h-10 w-10 text-[#60A5FA] mb-4" />
              <h3 className="text-xl font-bold mb-2">Open Tutoring</h3>
              <p className="text-gray-400">
                Connect with tutors and mentors for personalized help when you need it most
              </p>
            </CardContent>
          </Card>
        </div>
      </section>

      {/* Community Section */}
      <section className="relative bg-[#111] py-20">
        <div className="container mx-auto px-4">
          <div className="max-w-3xl">
            <h2 className="text-4xl md:text-5xl font-bold mb-4">
              REAL-TIME ACADEMIC
              <br />
              SOCIAL PLATFORM
            </h2>
            <p className="text-xl text-gray-300 mb-8">
              Whether you need help, want to tutor, or just love to learn, Bright Sparks is the community that makes
              education accessible, engaging, and competitive.
            </p>
            <div className="flex gap-4">
              <Button className="bg-[#4ADE80] text-black hover:bg-[#4ADE80]/90">Join as Student</Button>
              <Button variant="outline" className="text-white border-white hover:bg-white/10">
                Join as Teacher
              </Button>
            </div>
          </div>
        </div>
        <div className="absolute bottom-0 right-0 w-full h-full bg-[url('data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMjAwIiBoZWlnaHQ9IjIwMCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj48cmVjdCB3aWR0aD0iNCIgaGVpZ2h0PSI0IiBmaWxsPSIjNEFERTgwMTAiIHg9IjAiIHk9IjAiLz48L3N2Zz4=')] opacity-20" />
      </section>

      {/* Testimonials Section */}
      <section className="container mx-auto px-4 py-20">
        <div className="text-center mb-16">
          <h2 className="text-4xl md:text-5xl font-bold mb-4">
            BRIDGING THE
            <br />
            EDUCATION GAP
          </h2>
          <p className="text-xl text-gray-300 max-w-2xl mx-auto">
            Bright Sparks empowers every student to reach their full potential—no matter where they are.
          </p>
        </div>

        <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
          <Card className="bg-white/5 border-0">
            <CardContent className="p-6">
              <div className="flex flex-col items-center text-center">
                <div className="w-20 h-20 rounded-full bg-[#4ADE80]/20 flex items-center justify-center mb-4">
                  <img
                    src="/placeholder.svg?height=80&width=80"
                    alt="Student"
                    className="rounded-full h-16 w-16 object-cover"
                  />
                </div>
                <h3 className="text-xl font-bold mb-2">For Students</h3>
                <div className="flex mb-4">
                  {[...Array(5)].map((_, i) => (
                    <Star key={i} className="h-4 w-4 text-[#4ADE80]" fill="#4ADE80" />
                  ))}
                </div>
                <p className="text-gray-400">
                  "Bright Sparks helped me improve my grades and connect with students from other schools. The
                  leaderboards keep me motivated!"
                </p>
                <p className="text-sm text-[#4ADE80] mt-4">- Michael, Kingston</p>
              </div>
            </CardContent>
          </Card>

          <Card className="bg-white/5 border-0">
            <CardContent className="p-6">
              <div className="flex flex-col items-center text-center">
                <div className="w-20 h-20 rounded-full bg-[#60A5FA]/20 flex items-center justify-center mb-4">
                  <img
                    src="/placeholder.svg?height=80&width=80"
                    alt="Teacher"
                    className="rounded-full h-16 w-16 object-cover"
                  />
                </div>
                <h3 className="text-xl font-bold mb-2">For Teachers</h3>
                <div className="flex mb-4">
                  {[...Array(5)].map((_, i) => (
                    <Star key={i} className="h-4 w-4 text-[#60A5FA]" fill="#60A5FA" />
                  ))}
                </div>
                <p className="text-gray-400">
                  "I can now reach students beyond my classroom. The platform has revolutionized how I provide feedback
                  and support."
                </p>
                <p className="text-sm text-[#60A5FA] mt-4">- Ms. Thompson, Montego Bay</p>
              </div>
            </CardContent>
          </Card>

          <Card className="bg-white/5 border-0">
            <CardContent className="p-6">
              <div className="flex flex-col items-center text-center">
                <div className="w-20 h-20 rounded-full bg-[#4ADE80]/20 flex items-center justify-center mb-4">
                  <img
                    src="/placeholder.svg?height=80&width=80"
                    alt="Institution"
                    className="rounded-full h-16 w-16 object-cover"
                  />
                </div>
                <h3 className="text-xl font-bold mb-2">For Institutions</h3>
                <div className="flex mb-4">
                  {[...Array(5)].map((_, i) => (
                    <Star key={i} className="h-4 w-4 text-[#4ADE80]" fill="#4ADE80" />
                  ))}
                </div>
                <p className="text-gray-400">
                  "Our school has seen a 25% improvement in overall academic performance since implementing Bright
                  Sparks."
                </p>
                <p className="text-sm text-[#4ADE80] mt-4">- Principal Davis, St. Elizabeth</p>
              </div>
            </CardContent>
          </Card>
        </div>
      </section>

      {/* CTA Section */}
      <section className="bg-[#4ADE80] text-black py-20">
        <div className="container mx-auto px-4 text-center">
          <h2 className="text-4xl md:text-5xl font-bold mb-6">LET'S IGNITE THE FUTURE OF LEARNING—TOGETHER</h2>
          <p className="text-xl mb-8 max-w-2xl mx-auto">
            Join the Bright Sparks community today and be part of the movement to transform education in Jamaica.
          </p>
          <Button className="bg-black text-white hover:bg-black/90 text-lg px-8 py-6 h-auto">
            Get Started Now
            <ArrowRight className="ml-2 h-5 w-5" />
          </Button>
        </div>
      </section>

      {/* Footer */}
      <footer className="border-t border-white/10 py-12">
        <div className="container mx-auto px-4">
          <div className="grid grid-cols-2 md:grid-cols-4 gap-8">
            <div>
              <h3 className="font-bold mb-4">Connect with us</h3>
              <div className="flex gap-4">
                <Link href="#" className="text-gray-400 hover:text-[#4ADE80]">
                  Twitter
                </Link>
                <Link href="#" className="text-gray-400 hover:text-[#4ADE80]">
                  Instagram
                </Link>
              </div>
            </div>
            <div>
              <h3 className="font-bold mb-4">Community</h3>
              <ul className="space-y-2">
                <li>
                  <Link href="#" className="text-gray-400 hover:text-[#4ADE80]">
                    Study Groups
                  </Link>
                </li>
                <li>
                  <Link href="#" className="text-gray-400 hover:text-[#4ADE80]">
                    Tutoring
                  </Link>
                </li>
              </ul>
            </div>
            <div>
              <h3 className="font-bold mb-4">Company</h3>
              <ul className="space-y-2">
                <li>
                  <Link href="#" className="text-gray-400 hover:text-[#4ADE80]">
                    About Us
                  </Link>
                </li>
                <li>
                  <Link href="#" className="text-gray-400 hover:text-[#4ADE80]">
                    Careers
                  </Link>
                </li>
              </ul>
            </div>
            <div>
              <h3 className="font-bold mb-4">Help</h3>
              <ul className="space-y-2">
                <li>
                  <Link href="#" className="text-gray-400 hover:text-[#4ADE80]">
                    Support
                  </Link>
                </li>
                <li>
                  <Link href="#" className="text-gray-400 hover:text-[#4ADE80]">
                    FAQ
                  </Link>
                </li>
              </ul>
            </div>
          </div>
          <div className="mt-8 pt-8 border-t border-white/10 text-center text-sm text-gray-400">
            © {new Date().getFullYear()} Bright Sparks. Empowering education across Jamaica.
          </div>
        </div>
      </footer>
    </div>
  )
}

